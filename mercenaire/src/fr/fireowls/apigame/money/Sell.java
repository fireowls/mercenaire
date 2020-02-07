package fr.fireowls.apigame.money;

import fr.fireowls.apigame.inventory.Inventory;
import fr.fireowls.apigame.item.Item;


public class Sell {

    public boolean sellAllItem(Inventory inv, Purse purse){
        if((inv.getItemsValue() + purse.getAmount()) > purse.getPurseItem().getMaxMoneyAmount()){
            return false;
        }else {
            purse.addMoney(inv.getItemsValue());
            inv.removeAllSellable();
            return true;
        }
    }

    public boolean sellItem(Item item, int qte, Inventory inv,Purse purse){
        if(item.getPrice() == 0 || (purse.getAmount()+(item.getPrice()*qte)) > purse.getPurseItem().getMaxMoneyAmount()){
            return false;
        }else {
            purse.addMoney(item.getPrice() * qte);
            inv.remove(qte,item);
            return true;
        }
    }
}
