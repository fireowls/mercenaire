package fr.fireowls.apigame.money;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.Item;

public class Buy {

    public boolean buyItem(Item item, int qte, Inventory inv, Purse purse){
        if(item.getMaxStackValue() == 0 || purse.getAmount() < item.getMarchandPrice()*qte){
            return false;
        }else {
            purse.subMoney(item.getMarchandPrice() * qte);
            inv.put(qte,item);
            return true;
        }
    }
}
