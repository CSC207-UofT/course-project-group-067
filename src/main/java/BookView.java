import java.util.ArrayList;

public class BookView {

    public static void view(RecipeBook book){
        ArrayList<Dish> dishes = book.dishManager.getDishes();
        System.out.println("Dishes:");
        for(Dish d: dishes){
            System.out.println(d.getName());
        }

    }
}
