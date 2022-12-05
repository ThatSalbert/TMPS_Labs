package Lab3.Adapter;

public class CookImpl implements Cook{
    CookingAdapter cookingAdapter;
    @Override
    public void cook(String food) {
        if(food.equalsIgnoreCase("Salad") || food.equalsIgnoreCase("Pizza") || food.equalsIgnoreCase("Burger")){
            cookingAdapter = new CookingAdapter(food);
            cookingAdapter.cook(food);
        } else {
            System.out.println("No such food on the menu.");
        }
    }
}
