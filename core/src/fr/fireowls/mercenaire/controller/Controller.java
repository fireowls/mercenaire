package fr.fireowls.mercenaire.controller;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

public abstract class Controller implements InputProcessor {

    private ControllerStatus status;

    public Controller() {
        status = new ControllerStatus();
    }

    public abstract void handler(ControllerStatus status);

    @Override
    public boolean keyDown(int keycode) {

        switch (keycode) {
            case Input.Keys.UP:
                status.setUp(true);
                break;
            case Input.Keys.LEFT:
                status.setLeft(true);
                break;
            case Input.Keys.RIGHT:
                status.setRight(true);
                break;
            case Input.Keys.DOWN:
                status.setDown(true);
                break;
        }
        handler(status);
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        switch (keycode) {
            case Input.Keys.UP:
                status.setUp(false);
                break;
            case Input.Keys.LEFT:
                status.setLeft(false);
                break;
            case Input.Keys.RIGHT:
                status.setRight(false);
                break;
            case Input.Keys.DOWN:
                status.setDown(false);
                break;
        }
        handler(status);
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
