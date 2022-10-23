package Lab2.Singleton;

import Lab2.Factory.Inventory;

import java.util.HashMap;

public class PlayerProfiles {
    private int id;
    private int level;
    private int exp;
    private int expToNextLevel;
    private static HashMap<Integer, PlayerProfiles> playerProfileHashMap = new HashMap<Integer, PlayerProfiles>();

    public PlayerProfiles(int _id){
        this.id = _id;
        this.level = 1;
        this.exp = 0;
        this.expToNextLevel = 250;
        playerProfileHashMap.put(id, this);
    }

    public static PlayerProfiles getProfile(int _id){
        if(playerProfileHashMap.get(_id) == null){
            return new PlayerProfiles(_id);
        }
        return playerProfileHashMap.get(_id);
    }
    public static void removeFromHash(int _id){
        System.out.println("Id: " + _id + " removed.");
        playerProfileHashMap.remove(_id);
    }
    public int getId (){
        return id;
    }
    public int getLevel(){
        return level;
    }
    public int getExp(){
        return exp;
    }

    public void giveExp(int amount){
        this.exp += amount;
        while (exp >= expToNextLevel) {
            level++;
            exp -= expToNextLevel;
            expToNextLevel = (int) (level * 250 * 1.15);
        }
    }
}
