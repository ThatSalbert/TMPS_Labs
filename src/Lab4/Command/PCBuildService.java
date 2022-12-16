package Lab4.Command;

public class PCBuildService {
    private final String name = "Desktop PC";

    public void buildPC() {
        System.out.println("Building " + name + "(s)");
    }

    public void sellPC() {
        System.out.println("Selling " + name + "(s)");
    }
}
