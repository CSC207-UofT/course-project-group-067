import java.util.ArrayList;

public class PlainDish implements Dish {
    private String name;
    private double time;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<String> method;

    public PlainDish() {
        this.name = "EMPTY";
        this.ingredients = new ArrayList<>();
        this.method = new ArrayList<>();
        this.time = -1.00;
    }

    /**
     * Alternative Constructor for reading from file with all input fields given
     *
     * @param dishName    name of Dish
     * @param ingredients List of Ingredients in Dish
     * @param method      List of method in Dish
     * @param time        time taken to make dish
     */
    public Dish(String dishName, ArrayList<Ingredient> ingredients, ArrayList<String> method, double time) {
        this.name = dishName;
        this.ingredients = ingredients;
        this.method = method;
        this.time = time;
    }

    public void addName(String name) {
        this.name = name;
    }

    public void addIngredient(Ingredient i) {
        this.ingredients.add(i);
    }

    public void addMethod(String stepX) {
        this.method.add(stepX);
    }

    public void addTime(double time) {
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return (ArrayList<Ingredient>) this.ingredients.clone();
    }

    public ArrayList<String> getIngredientsName() {
        ArrayList<String> names = new ArrayList<>();

        for (Ingredient i : this.ingredients) {
            names.add(i.getName());
        }

        return names;
    }

    public ArrayList<String> getMethod() {
        return (ArrayList<String>) this.method.clone();
    }

    public double getTime() {
        return this.time;
    }

    @Override
    public boolean hasAttribute(AttributeDecorator attribute) {
        return false;
    }

    @Override
    public PlainDish getPlainDish() {
        return this;
    }
}
