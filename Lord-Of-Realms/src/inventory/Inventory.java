package inventory;

import player.Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class Inventory {
    private List<Item> items;
    private Player player;

    public Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems(){
        return items;
    }

   /* public void showItems(){
        for(Item item : items){
            System.out.println(.addItem(item));
            System.out.println(player.getInventory().getItemsText());
        }
    }*/

    public String getItemsText(){
        if(items.isEmpty()){
            return "Empty";
        }

        StringBuilder text = new StringBuilder();

        for(Item item : items){
            text.append(item.getName()).append("\n");
        }

        return text.toString();
    }

    public boolean hasItem(String itemName){
        for(Item item : items){
            if(item.getName().equals(itemName)){
                return true;
            }
        }
        return false;
    }

    public boolean removeItem(String itemName){
        Iterator<Item> iterator = items.iterator();

        Item item = iterator.next();

        if(item.getName().equals(itemName)){
            iterator.remove();
            return true;
        }

        return false;
    }

}
