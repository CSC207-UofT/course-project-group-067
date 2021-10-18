public class Console {
    DishManager dishManager;
    IngredientManager ingredientManager;
    RecipeBook book;

    public Console(DishManager dishManager, IngredientManager ingredientManager, RecipeBook book){
        this.dishManager = dishManager;
        this.ingredientManager = ingredientManager;
        this.book = book;
    }

    public void run(String input) {

        if(dishManager.getDishNames().contains(input)){
            OpenSesame.recipe(dishManager.nameToDish(input));
            return;
        }

        switch (input) {
            case "Search" : BookView.view(Search.find(dishManager));
                break;
            case "View Dishes" : BookView.view(book);
                break;
            case "Favourites" : BookView.view(book.getUser().getFavourites());
                break;
            case "Preferences" : System.out.println(book.getUser().getPreferences());
                break;
            case "Create Dish" : CreateDish.create(dishManager, ingredientManager);
                break;
            case "Create Ingredient" : CreateIngredient.create(ingredientManager);
                break;
            default : throw new IllegalStateException("Unexpected Command/Dish: " + input);
        }
    }
}
