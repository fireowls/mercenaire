package fr.fireowls.apigame.entity.type.movable;

public enum Direction {

    NORTH(0, 1),
    NORTH_EST(0.70710678118, 0.70710678118),
    NORTH_WEST(-0.70710678118, 0.70710678118),
    WEST(-1, 0),
    STATIC(0, 0),
    EST(1, 0),
    SOUTH(0, -1),
    SOUTH_EST(0.70710678118, -0.70710678118),
    SOUTH_WEST(-0.70710678118, -0.70710678118),
    ;

    private double x;
    private double y;

    private Direction(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
