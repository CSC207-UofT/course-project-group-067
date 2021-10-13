import java.lang.reflect.Array;
import java.util.ArrayList;

public class DishManager {
    public ArrayList<Dish> dishes;

    public DishManager() {
        this.dishes = new ArrayList<Dish>();
    }

    public void createDish(String dishName) {
        Dish d = new Dish(dishName);
        this.dishes.add(d);
    }


    public void createDish(String dishName, ArrayList<Ingredient> ingredients, ArrayList<String> method, double time) {
        Dish d = new Dish(dishName, ingredients, method, time);
        this.dishes.add(d);
    }


    public void addIngredient(Dish dish, ArrayList<Ingredient> ingredients) {
        for (Ingredient i : ingredients) {
            dish.addIngredient(i);}
        this.dishes.add(dish);}

    public void addMethod(Dish dish, ArrayList<String> method) {
        for (String stepX : method) {
            dish.addMethod(stepX);}
        this.dishes.add(dish);
        }

    public ArrayList<Dish> getDishes() {
        return this.dishes;
    }

    public ArrayList<String> getDishNames() {
        ArrayList<String> ret = new ArrayList<>();
        for (Dish dish : this.dishes) {
            ret.add(dish.getName());}
        return ret;}

}