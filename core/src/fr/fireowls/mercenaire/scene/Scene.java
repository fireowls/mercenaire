package fr.fireowls.mercenaire.scene;

import fr.fireowls.mercenaire.utils.Updatable;

public abstract class Scene implements Updatable {

    private SceneStatus status = SceneStatus.STOP;

    public SceneStatus getStatus() {
        return status;
    }

    public void setStatus(SceneStatus status) {
        this.status = status;
    }

}
