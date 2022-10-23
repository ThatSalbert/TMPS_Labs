package Lab2.Factory;

public class Weapon extends Item{
    private final String weaponName;
    private final String weaponDescription;
    private final int weaponAmount;

    public Weapon(String _weaponName, String _weaponDescription, int _weaponAmount){
        this.weaponName = _weaponName;
        this.weaponDescription = _weaponDescription;
        this.weaponAmount = _weaponAmount;
    }

    @Override
    public String getItemName() {
        return weaponName;
    }

    @Override
    public String getItemDescription() {
        return weaponDescription;
    }

    @Override
    public int getItemAmount() {
        return weaponAmount;
    }
}
