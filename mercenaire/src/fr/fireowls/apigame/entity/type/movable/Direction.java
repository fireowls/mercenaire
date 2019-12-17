package fr.fireowls.apigame.entity.type.movable;

public enum Direction {

    NORTH(0, 1),
    NORTH_EST(1, 1),
    NORTH_WEST(-1, 1),
    WEST(-1, 0),
    STATIC(0, 0),
    EST(1, 0),
    SOUTH(0, 1),
    SOUTH_EST(1, 1),
    SOUTH_WEST(-1, 1),
    ;

    private int x;
    private int y;

    private Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
