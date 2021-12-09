package Presenter;

import Entities.Dish;

import java.util.ArrayList;

public class OpenSesame {

    public static void recipe(Dish d) {
        ArrayList<String> ingredients = d.getIngredientsName();
        ArrayList<String> method = d.getMethod();
        ArrayList<String> attributes = d.getAttributes();
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println(d.getName());

        System.out.println("INGREDIENTS");

        for (String ingredient : ingredients) {
            System.out.print(ingredient + "  ");
        }
        System.out.println();

        System.out.println("ATTRIBUTES");

        for (String attribute : attributes) {
            System.out.print(attribute + "  ");
        }
        System.out.println();

        System.out.println("INSTRUCTIONS");
        for (String methodLine : method) {
            System.out.println(methodLine);
        }

        System.out.println("--------------------------------------------------------------------------------------");

    }
}
