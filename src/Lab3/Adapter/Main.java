package Lab3.Adapter;

public class Main {
    public static void main(String[] args) {
        CookImpl menu = new CookImpl();
        menu.cook("Salad");
        menu.cook("Cake");
        menu.cook("Pizza");
        menu.cook("Soup");
        menu.cook("Burger");
    }
}
