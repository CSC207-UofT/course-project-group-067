import java.util.Scanner;

public class RecipeBook {
    DishManager dishManager;
    IngredientManager ingredientManager;

    public RecipeBook(){
        this.dishManager = new DishManager();
        this.ingredientManager = new IngredientManager();
    }
    public void open() {
        Scanner sc = new Scanner(System.in);
        BookView.view(this);

        System.out.println("Enter Command:");

        String input = sc.nextLine();

        Console c = new Console(dishManager, ingredientManager);

        while(!(input.equals("CLOSE"))){
            Command.run()

        }

        String[] args = new String[]{"TEMP"};
        Launch.main(args);

    }

}
