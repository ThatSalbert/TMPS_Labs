package Lab2.Factory;

public class Material extends Item{
    private final String materialName;
    private final String materialDescription;
    private final int materialAmount;

    public Material(String _materialName, String _materialDescription, int _materialAmount){
        this.materialName = _materialName;
        this.materialDescription = _materialDescription;
        this.materialAmount = _materialAmount;
    }

    @Override
    public String getItemName() {
        return materialName;
    }

    @Override
    public String getItemDescription() {
        return materialDescription;
    }

    @Override
    public int getItemAmount() {
        return materialAmount;
    }
}
