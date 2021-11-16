package Presenter;

import Entities.Dish;

import java.util.ArrayList;

public class OpenSesame {

    public static void recipe(Dish d){
        ArrayList<String> ingredients = d.getPlainDish().getIngredientsName();
        ArrayList<String > method = d.getPlainDish().getMethod();
        String attributes = d.toString();
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println(d.getPlainDish().getName());

        System.out.println("INGREDIENTS");

        for(String ingredient: ingredients){
            System.out.print(ingredient + "  ");
        }
        System.out.println();

        System.out.println("ATTRIBUTES");

        System.out.println(attributes);
        System.out.println();

        System.out.println("INSTRUCTIONS");
        for(String methodLine: method){
            System.out.println(methodLine);
        }

        System.out.println("--------------------------------------------------------------------------------------");

    }
}
