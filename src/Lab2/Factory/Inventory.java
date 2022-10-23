package Lab2.Factory;

import java.util.HashMap;

public class Inventory {
    private static HashMap<Integer, Item> playerInventory= new HashMap<Integer, Item>();

    private Inventory(int slot, Item item){
        playerInventory.put(slot, item);
    }

    public static Item getInventoryItem(int slot, String type, String itemName, String itemDescription, int amount){
        if(playerInventory.get(slot) == null){
            if("Weapon".equalsIgnoreCase(type)){
                if(amount != 1){
                    System.out.println("Can't have more than one of this type in a single slot.");
                } else {
                    Weapon weapon = new Weapon(itemName, itemDescription, amount);
                    new Inventory(slot, weapon);
                    return weapon;
                }
            } else if ("Material".equalsIgnoreCase(type)){
                Material material = new Material(itemName, itemDescription, amount);
                new Inventory(slot, material);
                return material;
            } else {
                System.out.println("Unsupported item type.");
            }
        } else if(playerInventory.get(slot) != null) {
            System.out.println("Slot occupied.");
        }
        return null;
    }

    public static void displayInventory(){
        playerInventory.forEach((key, value) -> System.out.println("Slot " + key + ": " + value.getItemName() + ", " + value.getItemDescription() + ", " + value.getItemAmount()));
    }
}
