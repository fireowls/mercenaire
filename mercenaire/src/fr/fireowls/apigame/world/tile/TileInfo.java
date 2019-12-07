package fr.fireowls.apigame.world.tile;

import com.badlogic.gdx.utils.JsonValue;

public class TileInfo {

    private int x;
    private int y;

    private float heat;
    private float wet;
    private float tileSelector;

    public TileInfo(int x, int y, float heat, float wet, float tileSelector) {
        this.heat = heat;
        this.wet = wet;
        this.tileSelector = tileSelector;
        this.x = x;
        this.y = y;
    }

    public float getHeat() {
        return heat;
    }

    public float getWet() {
        return wet;
    }

    public float getTileSelector() {
        return tileSelector;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setTileSelector(float tileSelector) {
        this.tileSelector = tileSelector;
    }

    public String toJSON() {
        return "{\"x\":" + x + ",\"y\":" + y + ",\"heat\":" + heat + ",\"wet\":" + wet + ",\"frequency:\"" + tileSelector + "}";
    }

    public static TileInfo fromJSON(JsonValue jsonValue) {
        int x = jsonValue.getInt("x");
        int y = jsonValue.getInt("y");
        float heat = jsonValue.getFloat("heat");
        float wet = jsonValue.getFloat("wet");
        float frequency = jsonValue.getFloat("frequency");
        return new TileInfo(x, y, heat, wet, frequency);
    }

}
