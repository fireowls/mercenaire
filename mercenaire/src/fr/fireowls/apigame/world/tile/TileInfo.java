package fr.fireowls.apigame.world.tile;

import com.badlogic.gdx.utils.JsonValue;

public class TileInfo {

    private int x;
    private int y;

    private float heat;
    private float wet;

    public TileInfo(int x, int y, float heat, float wet) {
        this.heat = heat;
        this.wet = wet;
        this.x = x;
        this.y = y;
    }

    public float getHeat() {
        return heat;
    }

    public float getWet() {
        return wet;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toJSON() {
        return "{\"x\":" + x + ",\"y\":" + y + ",\"heat\":" + heat + ",\"wet\":" + wet + "}";
    }

    public static TileInfo fromJSON(JsonValue jsonValue) {
        int x = jsonValue.getInt("x");
        int y = jsonValue.getInt("y");
        float heat = jsonValue.getFloat("heat");
        float wet = jsonValue.getFloat("wet");
        return new TileInfo(x, y, heat, wet);
    }

}
