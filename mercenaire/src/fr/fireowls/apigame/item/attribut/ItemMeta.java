package fr.fireowls.apigame.item.attribut;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.io.File;

public class ItemMeta {
    protected String name, desc;
    private JsonReader reader;
    private JsonValue val;
    private LanguageMeta lang;

    public ItemMeta(String fileName){
        lang = LanguageMeta.ENGLISH;
        reader = new JsonReader();
        FileHandle f = Gdx.files.internal(lang.getPath()+fileName);
        val = reader.parse(f);
        name = val.getString("name");
        desc = val.getString("desc");
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
