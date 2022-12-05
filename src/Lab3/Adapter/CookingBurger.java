package Lab3.Adapter;

public class CookingBurger implements AdvancedCook{
    @Override
    public void cookSalad() {

    }

    @Override
    public void cookPizza() {

    }

    @Override
    public void cookBurger() {
        System.out.println("Cooking Burger.");
    }
}
