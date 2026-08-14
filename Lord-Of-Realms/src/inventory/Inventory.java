package inventory;

import player.Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Inventory {
    private Map<Item, Integer> items;
    private Player player;

    public Inventory(){
        items = new HashMap<>();
    }

    public void addItem(Item item){
        if(items.containsKey(item)){
            items.put(item, items.get(item) + 1);
        }else{
            items.put(item, 1);
        }
    }

   /*
   public List<Item> getItems(){
        return items;
    }
    */

   /*
    public void showItems(){
        for(Item item : items){
            System.out.println(.addItem(item));
            System.out.println(player.getInventory().getItemsText());
        }
    }
    */

    public String getItemsText(){
        if(items.isEmpty()){
            return "Empty";
        }

        StringBuilder text = new StringBuilder();

        for(Map.Entry<Item, Integer> entry : items.entrySet()){
            Item item = entry.getKey();
            int quantity = entry.getValue();

            text.append(item.getName())
                    .append(" x ")
                    .append(quantity)
                    .append("\n");
        }

        return text.toString();
    }

    public boolean hasItem(Item item){
        return items.containsKey(item);
    }

    public boolean removeItem(Item item){
       if(!(items.containsKey(item))){
           return false;
        }
        int quantity = items.get(item);

       if(quantity > 1){
           items.put(item, quantity-1);
       }else{
           items.remove(item);
       }

       return true;
    }

}
