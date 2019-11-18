package fr.fireowls.mercenaire.scene;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import fr.fireowls.apigame.utils.Updatable;

import java.util.ArrayList;
import java.util.List;

public class SceneManager implements Updatable {

    private List<Scene> scenes;
    private int index = -1;
    private boolean pause;

    public SceneManager() {
        scenes = new ArrayList<>();
        pause = false;

        try {
            for (SceneType sceneType : SceneType.values()) {
                scenes.add(createScene(sceneType));
            }
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        setScene(SceneType.MAIN_MENU);
    }

    public void setScene(SceneType scene) {
        if (index >= 0) {
            scenes.get(index).pause();
        }
        index = scene.ordinal();
        switch (scenes.get(index).getStatus()) {
            case STOP:
                create();
                break;
            case PAUSED:
                resume();
                break;
        }
    }

    public Scene createScene(SceneType sceneType) throws IllegalAccessException, InstantiationException {
        return (Scene) sceneType.getReference().newInstance();
    }

    @Override
    public void create() {
        scenes.get(index).setStatus(SceneStatus.RUNNING);
        scenes.get(index).create();
    }

    @Override
    public void update(float delta) {
        if (!pause)
            scenes.get(index).update(delta);
    }

    @Override
    public void draw(SpriteBatch batch) {
        if (!pause)
            scenes.get(index).draw(batch);
    }

    @Override
    public void pause() {
        scenes.get(index).setStatus(SceneStatus.PAUSED);
        pause = true;
        scenes.get(index).pause();
    }

    @Override
    public void resume() {
        scenes.get(index).setStatus(SceneStatus.RUNNING);
        pause = false;
        scenes.get(index).resume();
    }

    @Override
    public void dispose() {
        scenes.stream().forEach(Scene::dispose);
    }

    public void disposeCurrentScene() {
        scenes.get(index).setStatus(SceneStatus.STOP);
        scenes.get(index).dispose();
    }
}
