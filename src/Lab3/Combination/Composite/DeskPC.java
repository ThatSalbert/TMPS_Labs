package Lab3.Combination.Composite;

public class DeskPC implements Computer {
    @Override
    public void assemble() {
        System.out.println("Assembling Desktop PC.");
    }

    @Override
    public String component() {
        return null;
    }
}
