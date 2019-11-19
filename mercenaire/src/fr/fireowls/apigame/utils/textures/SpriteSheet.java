package fr.fireowls.apigame.utils.textures;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;
import fr.fireowls.apigame.utils.Updatable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SpriteSheet implements Updatable {

    private File file;
    private TextureRegion[] frames;
    private Animation<TextureRegion> animations;

    private String id;
    private int width, height;
    private List<TextureInfo> textures;

    private TextureRegion texture;

    private float timerAnimation;

    public SpriteSheet(String file) {
        this(new File(file));
    }

    public SpriteSheet(File file) {

        if (!file.getName().equals("texture-info.json")) {
            file = new File(file.getAbsolutePath() + "/texture-info.json");
        }

        this.file = file;

        JsonReader json = new JsonReader();
        JsonValue value = json.parse(Gdx.files.internal(file.getAbsolutePath()));

        id = value.getString("id");
        width = value.getInt("width");
        height = value.getInt("height");

        JsonValue textureArray = value.get("textures");
        textures = new ArrayList<>();
        for (JsonValue textureValue : textureArray.iterator()) {
            textures.add(new TextureInfo(textureValue, file));
        }
    }

    @Override
    public void create() {
        texture = selectTexture();
        timerAnimation = 0;
    }

    @Override
    public void update(float delta) {
        timerAnimation += delta;
        if (animations != null) {
            texture = animations.getKeyFrame(timerAnimation);
        }
    }

    @Override
    public void draw(SpriteBatch batch) {
        batch.draw(texture, 50, 50);
    }

    public void draw(SpriteBatch batch, float x, float y) {
        batch.draw(texture, x, y);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
        texture.getTexture().dispose();
    }

    private TextureRegion selectTexture() {
        double selection = Math.random();
        double min = 0d, max = 0d;
        for (TextureInfo textureInfo : textures) {
            min = max;
            max = textureInfo.getFrequency() + min;
            if (min <= selection && selection < max) {

                Texture texture = textureInfo.getTexture();

                if (textureInfo.haveAnimation()) {
                    createAnimation(texture, textureInfo);
                }

                return new TextureRegion(texture);
            }
        }
        return null;
    }

    private void createAnimation(Texture texture, TextureInfo textureInfo) {
        int col = texture.getWidth() / width;
        int row = texture.getHeight() / height;
        TextureRegion[][] tmp = TextureRegion.split(texture, texture.getWidth() / col, texture.getHeight() / row);
        TextureRegion[] tmpFlat = new TextureRegion[col * row];

        int i = 0;
        for (int y = 0 ; y < row ; y++)
            for (int x = 0 ; x < col ; x++)
                tmpFlat[i++] = tmp[y][x];

        frames = new TextureRegion[textureInfo.getLastFrame() - textureInfo.getFirstFrame() + 1];
        int index = 0;
        for (i = 0 ; i < tmpFlat.length ; i++) {
            if (i >= textureInfo.getFirstFrame() && i <= textureInfo.getLastFrame()) {
                frames[index++] = tmpFlat[i];
            }
        }

        animations = new Animation<TextureRegion>(textureInfo.getAnimationDelay(), frames);
        animations.setPlayMode(textureInfo.getPlayMode());
    }

    public TextureRegion getTexture() {
        return texture;
    }

    public String getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public File getFile() {
        return file;
    }
}
