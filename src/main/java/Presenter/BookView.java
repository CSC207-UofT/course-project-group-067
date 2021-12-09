package Presenter;

import Entities.Dish;
import Entities.Ingredient;
import ObjectConversion.ReferenceStorage;

import java.util.ArrayList;

public class BookView {

    public static void view() {
        ArrayList<Dish> dishes = ReferenceStorage.dm.getDishes();
        System.out.println("Dishes:");
        int index = 1;
        for (Dish d : dishes) {
            System.out.print(index + " ");
            System.out.println(d.getName());
            index++;
        }
        System.out.println();

    }

    public static void view(ArrayList<Dish> dishes) {
        System.out.println("Specified Dishes:");
        int index = 1;
        for (Dish d : dishes) {
            System.out.print(index + " ");
            System.out.println(d.getName());
            index++;
        }
        System.out.println();
    }

    public static void ingredientsView() {
        ArrayList<Ingredient> ingredients = ReferenceStorage.im.getIngredients();
        System.out.println("Ingredients:");
        int index = 1;
        for (Ingredient i : ingredients) {
            System.out.print(index + " ");
            System.out.println(i.getName());
            index++;
        }
        System.out.println();

    }

}
