package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class RecipeBook{

    public void open() throws IOException, ClassNotFoundException, SQLException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Menu Input");
        System.out.println("BOOK");
        System.out.println("Profile");
        String choice = sc.nextLine().toLowerCase();

        if(choice.equals("profile")) {
            System.out.println("Enter One Command: 'Favourites'; 'Preferences', 'CLOSE';");

            String input = sc.nextLine().toLowerCase();

            UserConsole c = new UserConsole();

            while (!(input.equals("close"))) {
                try{
                    c.run(input);
                } catch (IllegalStateException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Command:");

                input = sc.nextLine().toLowerCase();
            }
            open();
        }

        if(choice.equals("book")){

            BookView.view();

            System.out.println("Enter Command:");

            String input = sc.nextLine().toLowerCase();

            BookConsole c = new BookConsole();

            while(!(input.equals("close"))){
                try{
                    c.run(input);
                } catch (IllegalStateException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter Command:");

                input = sc.nextLine().toLowerCase();
            }

        String[] args = new String[]{"TEMP"};
        ReferenceStorage.reset();
        Launch.main(args);
        }

    }

}
