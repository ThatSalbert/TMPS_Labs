package Lab3.Adapter;

public class CookingSalad implements AdvancedCook{
    @Override
    public void cookSalad() {
        System.out.println("Cooking Salad.");
    }

    @Override
    public void cookPizza() {

    }

    @Override
    public void cookBurger() {

    }
}
