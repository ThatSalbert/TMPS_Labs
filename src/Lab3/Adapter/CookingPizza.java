package Lab3.Adapter;

public class CookingPizza implements AdvancedCook{
    @Override
    public void cookSalad() {

    }

    @Override
    public void cookPizza() {
        System.out.println("Cooking Pizza.");
    }

    @Override
    public void cookBurger() {

    }
}
