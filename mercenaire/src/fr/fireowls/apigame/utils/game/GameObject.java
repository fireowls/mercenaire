package fr.fireowls.apigame.utils.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

public abstract class GameObject implements Updatable {

    private GameObjectState state;

    private List<OnCreate> onCreate;
    private List<OnUpdate> onUpdate;
    private List<OnDraw> onDraw;
    private List<OnPause> onPause;
    private List<OnResume> onResume;
    private List<OnDispose> onDispose;

    public GameObject() {
        this.state = GameObjectState.WAITING;
        onCreate = new ArrayList<>();
        onUpdate = new ArrayList<>();
        onDraw = new ArrayList<>();
        onPause = new ArrayList<>();
        onResume = new ArrayList<>();
        onDispose = new ArrayList<>();
    }

    @Override
    public void create() {
        if (state == GameObjectState.WAITING) {
            this.state = GameObjectState.RUNNING;
            if (onCreate != null)
                this.onCreate.stream().forEach(OnCreate::handle);
            onCreate();
        }
    }

    protected abstract void onCreate();

    @Override
    public void update(float delta) {
        if (state == GameObjectState.RUNNING) {
            if (onUpdate != null)
                this.onUpdate.stream().forEach(x -> x.handle(delta));
            onUpdate(delta);
        }
    }

    protected abstract void onUpdate(float delta);

    @Override
    public void draw(SpriteBatch batch) {
        if (state == GameObjectState.RUNNING) {
            if (onDraw != null)
                this.onDraw.stream().forEach(x -> x.handle(batch));
            onDraw(batch);
        }
    }

    protected abstract void onDraw(SpriteBatch batch);

    @Override
    public void pause() {
        if (state == GameObjectState.RUNNING) {
            this.state = GameObjectState.PAUSE;
            if (onPause != null)
                this.onPause.stream().forEach(OnPause::handle);
            onPause();
        }
    }

    protected abstract void onPause();

    @Override
    public void resume() {
        if (state == GameObjectState.PAUSE) {
            this.state = GameObjectState.RUNNING;
            if (onResume != null)
                this.onResume.stream().forEach(OnResume::handle);
            onResume();
        }
    }

    protected abstract void onResume();

    @Override
    public void dispose() {
        if (state == GameObjectState.RUNNING || state == GameObjectState.PAUSE) {
            this.state = GameObjectState.STOP;
            if (onDispose != null)
                this.onDispose.stream().forEach(OnDispose::handle);
            onDispose();
        }
    }

    protected abstract void onDispose();

    public void setOnCreate(OnCreate onCreate) {
        this.onCreate.add(onCreate);
    }

    public void setOnUpdate(OnUpdate onUpdate) {
        this.onUpdate.add(onUpdate);
    }

    public void setOnDraw(OnDraw onDraw) {
        this.onDraw.add(onDraw);
    }

    public void setOnPause(OnPause onPause) {
        this.onPause.add(onPause);
    }

    public void setOnResume(OnResume onResume) {
        this.onResume.add(onResume);
    }

    public void setOnDispose(OnDispose onDispose) {
        this.onDispose.add(onDispose);
    }

    public GameObjectState getState() {
        return state;
    }
}
