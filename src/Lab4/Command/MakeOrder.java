package Lab4.Command;

public class MakeOrder implements Order{
    private final PCBuildService pcBuildService;

    public MakeOrder(PCBuildService pcBuildService) {
        this.pcBuildService = pcBuildService;
    }
    @Override
    public void placeOrder() {
        pcBuildService.buildPC();
    }
}
