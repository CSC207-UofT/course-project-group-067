import java.util.ArrayList;

public class Dish {
    public String name;
    public double time;
    public ArrayList<Ingredient> ingredients;
    public ArrayList<String> method;
    public ArrayList<String> attributes;

    /**
     * Constructor that takes one parameter dishName and create empty lists
     * for both ingredients and method
     * default time is -1.00
     *
     * @param dishName name of dish
     */
    public Dish(String dishName) {
        this.name = dishName;
        this.ingredients = new ArrayList<>();
        this.method = new ArrayList<>();
        this.time = -1.00;
        this.attributes = new ArrayList<String>();
    }


    /**
     * Alternative constructor where all dishName ingredients and method are provided
     * and creates list for the later 2 and implements name
     *
     * @param dishName  name of Dish
     * @param ingredients List of Ingredients in Dish
     * @param method    List of method in Dish
     * @param time time taken to make dish
     */
    public Dish(String dishName, ArrayList<Ingredient> ingredients, ArrayList<String> method, double time) {
        this.name = dishName;
        this.ingredients = ingredients;
        this.method = method;
        this.time = time;
    }

    public void addIngredient(Ingredient i) {
        this.ingredients.add(i);
        this.attributes.addAll(i.getAttributes());
    }

    public void addMethod(String stepX) {
        this.method.add(stepX);
    }

    public void addTime(double time) {
        this.time = time;
    }

    public String getName() {return this.name;}
    public ArrayList<Ingredient> getIngredients(){return (ArrayList<Ingredient>) this.ingredients.clone();}
    public ArrayList<String> getMethod() {return (ArrayList<String>) this.method.clone();}
    public double getTime() {return this.time;}


}
