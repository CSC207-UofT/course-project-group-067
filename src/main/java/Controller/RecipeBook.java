package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Serialization.SerializationClass;

import java.io.IOException;
import java.util.Scanner;

public class RecipeBook{


    public void open() throws IOException, ClassNotFoundException {
        initializeManagers();
        Scanner sc = new Scanner(System.in);
        BookView.view();

        System.out.println("Enter Menu Input");
        System.out.println("BOOK");
        System.out.println("Profile");
        String choice = sc.nextLine();
        if(choice.equals("Profile")) {
            System.out.println("Enter One Command: 'Favourites'; 'Preferences'; 'Save' ");

            String input = sc.nextLine().toLowerCase();

            UserConsole c = new UserConsole();

            while (!(input.equals("close"))) {
                try{
                    c.run(input);
                } catch(IllegalStateException e){
                    System.out.println("Unexpected Command/Entities.Dish: " + input);
                }
                System.out.println("Enter Command:");

                input = sc.nextLine().toLowerCase();
            }
        }
        if(choice.equals("BOOK"))
        System.out.println("Enter Command:");

        String input = sc.nextLine().toLowerCase();

        BookConsole c = new BookConsole();

        while(!(input.equals("close"))){
            try{
                c.run(input);
            } catch(IllegalStateException e){
                System.out.println("Unexpected Command/Entities.Dish: " + input);
            }
            System.out.println("Enter Command:");

            input = sc.nextLine().toLowerCase();
        }

        String[] args = new String[]{"TEMP"};
        ReferenceStorage.reset();
        Launch.main(args);

    }

    /*
    De-serialize the managers data and store it as respective managers in ReferenceStorage
     */
    private void initializeManagers() throws IOException, ClassNotFoundException {
        SerializationClass.umRead();
        SerializationClass.dmRead();
        SerializationClass.imRead();

    }


}
