package fr.fireowls.apigame.craft.workbench;

import fr.fireowls.apigame.item.Item;

import fr.fireowls.apigame.item.equipment.purse.purses.SpruceToothPurse;
import fr.fireowls.apigame.item.equipment.purse.purses.BigPurse;
import fr.fireowls.apigame.item.equipment.purse.purses.GreaterPurse;
import fr.fireowls.apigame.item.equipment.purse.purses.MediumPurse;
import fr.fireowls.apigame.item.equipment.purse.purses.SmallPurse;
import fr.fireowls.apigame.item.material.materials.Stick;
import fr.fireowls.apigame.item.tool.axe.axes.StoneAxe;
import fr.fireowls.apigame.item.tool.fishingrod.fishingrods.FishRod;
import fr.fireowls.apigame.item.tool.hoe.hoes.StoneHoe;
import fr.fireowls.apigame.item.tool.pickaxe.pickaxes.StonePick;
import fr.fireowls.apigame.item.tool.shovel.shovels.StoneShovel;
import fr.fireowls.apigame.item.weapon.weapons.sword.swords.StoneSword;

public enum WorkbenchRecipe {

    STICK(1, Stick.class,"Wood:2;#"),
    STONESWORD(2, StoneSword.class,"Stone:4;Stick:2;#"),
    STONEHOE(3, StoneHoe.class,"Stone:4;Stick:4;#"),
    STONEAXE(4, StoneAxe.class,"Stone:3;Stick:2;#"),
    STONEPICKAXE(5, StonePick.class,"Stone:6;Stick:4;#"),
    STONESHOVEL(6, StoneShovel.class,"Stone:2;Stick:2;#"),
    FISHROD(7, FishRod.class,"Stick:2;String:3;#"),
    SMALLPURSE(8, SmallPurse.class,"Leather:10;#"),
    MEDIUMPURSE(9, MediumPurse.class,"Small Purse:1;Leather:30;#"),
    BIGPURSE(10, BigPurse.class,"Medium Purse:1;Leather:50;#"),
    GREATERPURSE(11, GreaterPurse.class,"Big Purse:1;Leather:100;#"),
    SPRUCETOOTHPURSE(12, SpruceToothPurse.class,"Greater Purse:1;tigerSkin:5;#");

    private int id;
    private Class<? extends Item> item;
    private String recipe;

    private WorkbenchRecipe(int id,Class<? extends Item> c, String s){
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
        for(WorkbenchRecipe recipe:WorkbenchRecipe.values()){
            if(recipe.item.equals(c)){
                return recipe.recipe;
            }
        }
        return null;
    }
}
