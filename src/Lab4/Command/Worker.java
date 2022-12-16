package Lab4.Command;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.placeOrder();
        }
        orders.clear();
    }
}
