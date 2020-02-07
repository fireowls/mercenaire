package fr.fireowls.apigame.item.utils;

import fr.fireowls.apigame.inventory.Inventory;

public class HasMaterial {

    public static boolean hasMat(String recipe, Inventory inv,int nb){
        String[] items = recipe.split(";");
        for(String s:items){
            if(!s.equals("#")){
                int qte = Integer.parseInt(s.split(":")[1]);
                String iName = s.split(":")[0];
                if(!inv.getAllItemName().contains(iName)){
                    return false;
                }else {
                    if(!inv.hasEnoughtItem(qte*nb,inv.getItemFormName(iName))){
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
