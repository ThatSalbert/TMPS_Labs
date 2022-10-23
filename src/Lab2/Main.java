package Lab2;

import Lab2.Factory.Inventory;
import Lab2.Factory.Item;
import Lab2.Prototype.Document;
import Lab2.Singleton.PlayerProfiles;

import static Lab2.Singleton.PlayerProfiles.removeFromHash;
import static Lab2.Factory.Inventory.displayInventory;

public class Main {
    public static void main(String[] args) {

        int max = 99999;
        int min = 10000;
        int range = max - min + 1;

        //Singleton Pattern
        PlayerProfiles playerProfile1;
        int idOfPlayer1 = (int) ((Math.random() * range) + min);
        playerProfile1 = PlayerProfiles.getProfile(idOfPlayer1);
        System.out.println("Player " + playerProfile1.getId() + " is level " + playerProfile1.getLevel() + " with " + playerProfile1.getExp() + " experience.");

        PlayerProfiles playerProfile2;
        int idOfPlayer2 = (int) ((Math.random() * range) + min);
        playerProfile2 = PlayerProfiles.getProfile(idOfPlayer2);
        playerProfile2.giveExp(847);
        System.out.println("Player " + playerProfile2.getId() + " is level " + playerProfile2.getLevel() + " with " + playerProfile2.getExp() + " experience.");

        PlayerProfiles playerProfile3;
        int idOfPlayer3 = (int) ((Math.random() * range) + min);
        playerProfile3 = PlayerProfiles.getProfile(idOfPlayer3);
        playerProfile3.giveExp(3281);
        System.out.println("Player " + playerProfile3.getId() + " is level " + playerProfile3.getLevel() + " with " + playerProfile3.getExp() + " experience.");

        removeFromHash(idOfPlayer3);
        playerProfile3 = PlayerProfiles.getProfile(idOfPlayer3);
        System.out.println("Player " + playerProfile3.getId() + " is level " + playerProfile3.getLevel() + " with " + playerProfile3.getExp() + " experience.");

        //Factory Pattern
        Inventory.getInventoryItem(1, "weapon", "Wooden Sword", "Basic wooden sword.", 1);
        Inventory.getInventoryItem(1, "material", "Stone", "Just stone.", 5);
        Inventory.getInventoryItem(2, "armor", "Cloth Helmet", "What is this doing here?", 1);
        Inventory.getInventoryItem(2, "material", "Stone", "Just stone.", 5);
        Inventory.getInventoryItem(3, "weapon", "Iron Dagger", "Regular iron dagger. Amazing.", 2);
        Inventory.getInventoryItem(3, "weapon", "Iron Dagger", "Regular iron dagger. Amazing.", 1);
        displayInventory();

        //Prototype Pattern
        Document document1 = new Document("Some document", "SomeName", "SomeLastName", "31/02/2012");
        Document document2 = (Document) document1.getClone();
        document1.getDocument();
        document2.getDocument();
    }
}
