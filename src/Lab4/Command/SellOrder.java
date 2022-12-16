package Lab4.Command;

public class SellOrder implements Order{
    private final PCBuildService pcBuildService;

    public SellOrder(PCBuildService pcBuildService) {
        this.pcBuildService = pcBuildService;
    }
    @Override
    public void placeOrder() {
        pcBuildService.sellPC();
    }
}
