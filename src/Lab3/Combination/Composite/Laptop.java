package Lab3.Combination.Composite;

public class Laptop implements Computer {
    @Override
    public void assemble() {
        System.out.println("Assembling Laptop.");
    }

    @Override
    public String component() {
        return null;
    }
}
