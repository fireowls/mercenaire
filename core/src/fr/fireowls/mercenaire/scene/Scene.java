package fr.fireowls.mercenaire.scene;

import fr.fireowls.apigame.utils.Updatable;

public abstract class Scene implements Updatable {

    private SceneStatus status;

    public Scene() {
        this.status = SceneStatus.STOP;
    }

    public SceneStatus getStatus() {
        return status;
    }

    public void setStatus(SceneStatus status) {
        this.status = status;
    }

}
