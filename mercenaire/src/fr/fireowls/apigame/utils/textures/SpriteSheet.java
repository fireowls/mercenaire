package fr.fireowls.apigame.utils.textures;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpriteSheet {

    private int width;
    private int height;

    private int selectedTexture;

    private List<TextureInfo> textureInfos;
    private float animationClock;


    public SpriteSheet(File resources) {

        this.selectedTexture = 0;
        this.animationClock = 0;

        this.textureInfos = new ArrayList<>();

        if (!resources.getName().equals("texture-info.json")) {
            resources = new File(resources.getAbsolutePath() + "/texture-info.json");
        }

        JsonReader json = new JsonReader();
        JsonValue value = json.parse(Gdx.files.internal(resources.getAbsolutePath()));

        width = value.getInt("width");
        height = value.getInt("height");

        JsonValue textureArray = value.get("textures");
        for (JsonValue textureValue : textureArray.iterator()) {

            String file = textureValue.getString("file");
            double frequency = textureValue.getDouble("frequency");
            Texture texture = new Texture(Gdx.files.internal(resources.getParent() + "/" + file));

            TextureRegion[][] region = TextureRegion.split(texture, width, height);

            TextureInfo textureInfo = new TextureInfo(texture, region, frequency);

            JsonValue animationValue = textureValue.get("animation");
            if (animationValue != null) {
                double delay = animationValue.getDouble("delay");
                int firstFrame = animationValue.getInt("first-frame");
                int lastFrame = animationValue.getInt("last-frame");
                String playMode = animationValue.getString("play-mode");
                textureInfo.setAnimation(new Animation<TextureRegion>((float) delay, Arrays.copyOfRange(textureInfo.getFrames(), firstFrame, lastFrame + 1)));
                textureInfo.getAnimation().setPlayMode(Animation.PlayMode.valueOf(playMode));
            }
            textureInfos.add(textureInfo);

        }

        double selected = Math.random();
        double last = 0;
        for (int i = 0 ; i < textureInfos.size() ; i++) {
            if (selected >= last && selected <= last + textureInfos.get(i).getFrequency()) {
                selectedTexture = i;
                return;
            }
            last += textureInfos.get(i).getFrequency();
        }

    }

    public void setSelectedTexture(int selectedTexture) {
        this.selectedTexture = selectedTexture;
    }

    public void update(float delta) {
        this.animationClock += delta;
    }

    public TextureRegion getTexture() {
        return this.textureInfos.get(selectedTexture).getAnimation() != null ?
                this.textureInfos.get(selectedTexture).getAnimation().getKeyFrame(animationClock) :
                new TextureRegion(this.textureInfos.get(selectedTexture).getTexture());
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
