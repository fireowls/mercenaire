package fr.fireowls.apigame.craft.forge;

import fr.fireowls.apigame.item.Item;
import fr.fireowls.apigame.item.material.materials.CopperIngot;
import fr.fireowls.apigame.item.material.materials.IronIngot;
import fr.fireowls.apigame.item.material.materials.SteelIngot;

/**
 * Class qui reuni toutes les recettes des items crafter dans la forge avec
 * un id ( unique ), la classe de l'objet en lui meme et la recette sous la forme :
 * [nom de l'objet utiliser dans la recette ( celui de l'item meta )]:[nb d'objet];...;#
 * La recette doit commencer par le nom d'un item et doit se terminer par un #
 * Exemple : recette du l'ingot de fer : Iron Ore:2;#
 */
public enum ForgeRecipe {

    IRONINGOT(1, IronIngot.class,"Iron Ore:2;#"),
    COPPERINGOT(2,CopperIngot.class,"Copper Ore:2;#"),
    STEELINGOT(3, SteelIngot.class,"Iron Ingot:4;#");

    private int id;
    private Class<? extends Item> item;
    private String recipe;

    private ForgeRecipe(int id,Class<? extends Item> c, String s){
        this.id = id;
        this.item = c;
        this.recipe = s;
    }

    public int getId() {
        return id;
    }

    public Class<? extends Item> getItem() {
        return item;
    }

    public String getRecipe() {
        return recipe;
    }

    public static String getItemRecipe(Class<? extends Item> c){
        for(ForgeRecipe recipe:ForgeRecipe.values()){
            if(recipe.item.equals(c)){
                return recipe.recipe;
            }
        }
        return null;
    }
}
