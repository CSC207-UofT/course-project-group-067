import java.util.ArrayList;

public class BookView {

    public static void view(RecipeBook book){
        ArrayList<Dish> dishes = book.getDishManager().getDishes();
        System.out.println("Dishes:");
        int index = 1;
        for(Dish d: dishes){
            System.out.print(index + " ");
            System.out.println(d.getPlainDish().getName());
            index++;
        }

    }

    public static void view(ArrayList<Dish> dishes){
        System.out.println("Dishes:");
        int index = 1;
        for(Dish d: dishes){
            System.out.print(index + " ");
            System.out.println(d.getName());
            index++;
        }

    }
}
