import java.util.ArrayList;

public class DishManager {
    private ArrayList<Dish> dishes;

    public DishManager() {
        this.dishes = new ArrayList<>();
    }

    public void addDishToList(Dish dish) {
        dishes.add(dish);
    }


    public Dish nameToDish(String name){
        Dish ret = null;
        boolean found = false;

        for(Dish d: this.dishes){
            if(d.getPlainDish().getName().equals(name)){
                ret = d;
                found = true;
                break;
            }
        }
        if(found)
            return ret;
        else
            throw new IllegalStateException("Dish Does Not Exist: " + name);

    }

    public ArrayList<Dish> getDishes() {
        return this.dishes;
    }

    public ArrayList<String> getDishNames() {
        ArrayList<String> ret = new ArrayList<>();
        for (Dish dish : this.dishes) {
            ret.add(dish.getPlainDish().getName());}
        return ret;
    }

}
