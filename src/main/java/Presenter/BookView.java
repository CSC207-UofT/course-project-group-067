package Presenter;

import Entities.Dish;
import ObjectConversion.ReferenceStorage;

import java.util.ArrayList;

public class BookView {

    public static void view(){
        ArrayList<Dish> dishes = ReferenceStorage.dm.getDishes();
        System.out.println("Dishes:");
        int index = 1;
        for(Dish d: dishes){
            System.out.print(index + " ");
            System.out.println(d.getName());
            index++;
        }

    }

    public static void view(ArrayList<Dish> dishes){
        System.out.println("Specified Dishes:");
        int index = 1;
        for(Dish d: dishes){
            System.out.print(index + " ");
            System.out.println(d.getName());
            index++;
        }

    }

}
