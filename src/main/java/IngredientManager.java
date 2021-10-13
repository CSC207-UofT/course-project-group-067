import java.util.ArrayList;

public class IngredientManager {
    public ArrayList<Ingredient> ingredients;
    public ArrayList<String> allAttributes = ArrayList<>() ;

    public IngredientManager() {this.ingredients = new ArrayList<Ingredient>();}

    public void createIngredient(String name) {
        Ingredient i = new Ingredient(name);
        this.ingredients.add(i);
    }

    public void createIngredient(String name, ArrayList<String> attributes) {
        Ingredient i = new Ingredient(name, attributes);
        this.ingredients.add(i);
    }

    public void addAttribute(Ingredient ingredient, ArrayList<String> attributes) {
        for(String att : attributes){
        ingredient.addAttribute(att);}
    }

}
