package fr.fireowls.apigame.item;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.io.File;

public class ItemMeta {
    protected String name, desc;
    private JsonReader reader;
    private JsonValue val;

    public ItemMeta(String fileName){
        reader = new JsonReader();
        FileHandle f = Gdx.files.internal("json/item/"+fileName);
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
