public class Library {

    DishManager dishManager;
    IngredientManager ingManager;

    public Library(DishManager dishManager, IngredientManager ingManager){
        this.dishManager = dishManager;
        this.ingManager = ingManager;
    }

    public Ingredient nameToIngredient(String name){
        Ingredient ret = null;
        boolean found = false;

        for(Ingredient i: ingManager.ingredients){
            if(i.getName().equals(name)){
                ret = i;
                found = true;
                break;
            }
        }
        if(found)
            return ret;
        else
            throw new IllegalStateException("Ingredient Does Not Exist: " + name);

    }
}
