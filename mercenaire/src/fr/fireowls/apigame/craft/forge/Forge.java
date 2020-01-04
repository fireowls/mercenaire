package fr.fireowls.apigame.craft.forge;

import fr.fireowls.apigame.craft.CraftingTable;
import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.Item;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Forge extends CraftingTable {

    public List<Item> getAllAvailableCraft(Inventory inv){
        List<Item> items = new ArrayList<>();
        for(ForgeRecipe item:ForgeRecipe.values()){
            Item i = null;
            try {
                i = item.getItem().getConstructor(int.class).newInstance(0);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            if(i.hasMaterial(inv,1)){
                items.add(i);
            }
        }
        return items;
    }

    public void craft(ForgeRecipe recipe,Inventory inv,int nb){
        Item itemToCraft = null;

        try {
            itemToCraft = recipe.getItem().getConstructor(int.class).newInstance(0);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        if(itemToCraft != null){
            if(itemToCraft.hasMaterial(inv,nb)){
                String[] items = recipe.getRecipe().split(";");
                for(String s:items){
                    if(!s.equals("#")){
                        int qte = Integer.parseInt(s.split(":")[1]);
                        String iName = s.split(":")[0];
                        inv.remove(qte*nb,inv.getItemFormName(iName));
                    }

                }
                inv.put(nb,itemToCraft);
            }
        }
    }

}
