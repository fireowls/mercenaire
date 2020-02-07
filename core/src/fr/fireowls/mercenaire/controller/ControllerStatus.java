package fr.fireowls.mercenaire.controller;

public class ControllerStatus {

    private boolean up, right, left, down;

    public ControllerStatus() {
        up = false;
        right = false;
        left = false;
        down = false;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }
}
