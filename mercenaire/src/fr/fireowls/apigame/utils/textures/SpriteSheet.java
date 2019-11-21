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

    private List<TextureInfo> textureInfos;

    public SpriteSheet(File resources) {

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
            Texture texture = new Texture(file);

            TextureRegion[][] region = TextureRegion.split(texture, width, height);

            TextureInfo textureInfo = new TextureInfo(texture, region, frequency);

            JsonValue animationValue = textureValue.get("animation");
            if (animationValue != null) {
                double delay = animationValue.getDouble("delay");
                int firstFrame = animationValue.getInt("first-frame");
                int lastFrame = animationValue.getInt("last-frame");
                String playMode = animationValue.getString("play-mode");
                textureInfo.setAnimation(new Animation<TextureRegion>((float) delay, Arrays.copyOfRange(textureInfo.getFrames(), firstFrame, lastFrame)));
                textureInfo.getAnimation().setPlayMode(Animation.PlayMode.valueOf(playMode));
            }

        }

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
