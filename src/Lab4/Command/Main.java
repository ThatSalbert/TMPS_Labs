package Lab4.Command;

public class Main {
    public static void main(String[] args) {
        PCBuildService pcBuildService = new PCBuildService();
        Order makeOrder = new MakeOrder(pcBuildService);
        Order sellOrder = new SellOrder(pcBuildService);
        Worker worker = new Worker();
        worker.takeOrder(makeOrder);
        worker.takeOrder(sellOrder);
        worker.placeOrders();
    }
}
