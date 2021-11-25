package Controller;

import Presenter.BookView;
import Search.Search;

import java.io.IOException;

public class BookConsole implements AbstractConsole {
    private CreateOperation CreateDish = new CreateDishOperation();
    private CreateIngredientOperation CreateIngredient = new CreateIngredientOperation();
    private CreateExecutor CreateExecutor = new CreateExecutor();

    @Override
    public void run(String input) throws IOException {
        switch (input) {
            case "Create Dish" :
                CreateExecutor.genesis(CreateDish);
                break;
            case "Create Ingredient" :
                CreateExecutor.genesis(CreateIngredient);
                break;
           case "Search" : BookView.view(Search.find());
                break;
            case "View Dishes" : BookView.view();
                break;
        }
    }
}
