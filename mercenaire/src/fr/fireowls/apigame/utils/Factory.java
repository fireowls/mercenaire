package fr.fireowls.apigame.utils;

import java.io.File;

public abstract class Factory<E> {

    protected File file;

    public Factory(File file) {
        this.file = file;
    }

    public abstract E parse();
    public abstract void save(E element);

    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }
}
