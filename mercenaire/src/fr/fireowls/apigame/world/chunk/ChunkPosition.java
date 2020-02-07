package fr.fireowls.apigame.world.chunk;

public class ChunkPosition {

    private int x;
    private int y;

    public ChunkPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ChunkPosition && ((ChunkPosition) obj).getX() == x && ((ChunkPosition) obj).getY() == y;
    }

    @Override
    public String toString() {
        return x+":"+y;
    }
}
