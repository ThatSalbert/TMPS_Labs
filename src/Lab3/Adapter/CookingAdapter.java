package Lab3.Adapter;

public class CookingAdapter implements Cook{
    AdvancedCook advancedCook;

    public CookingAdapter(String food){
        if(food.equalsIgnoreCase("Salad")) {
            advancedCook = new CookingSalad();
        } else if (food.equalsIgnoreCase("Pizza")) {
            advancedCook = new CookingPizza();
        } else if (food.equalsIgnoreCase("Burger")) {
            advancedCook = new CookingBurger();
        }
    }

    @Override
    public void cook(String food) {
        if(food.equalsIgnoreCase("Salad")) {
            advancedCook.cookSalad();
        } else if (food.equalsIgnoreCase("Pizza")) {
            advancedCook.cookPizza();
        } else if (food.equalsIgnoreCase("Burger")) {
            advancedCook.cookBurger();
        }
    }
}
