import java.util.Scanner;

public class RecipeBook {
    private DishManager dishManager;
    private IngredientManager ingredientManager;
    private final User u;

    public RecipeBook(User u){
        this.dishManager = new DishManager();
        this.ingredientManager = new IngredientManager();
        this.u = u;
    }


    public void open() {
        Scanner sc = new Scanner(System.in);
        BookView.view(this);

        System.out.println("Enter Command:");

        String input = sc.nextLine();

        Console c = new Console(dishManager, ingredientManager, this);

        while(!(input.equals("CLOSE"))){
            c.run(input);
            System.out.println("Enter Command:");

            input = sc.nextLine();
        }

        String[] args = new String[]{"TEMP"};
        Launch.main(args);

    }

    public DishManager getDishManager() {
        return dishManager;
    }

    public User getUser() {
        return u;
    }
}
