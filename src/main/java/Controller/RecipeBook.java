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
        String choice = sc.nextLine();

        if(choice.equals("Profile")) {
            System.out.println("Enter One Command: 'Favourites'; 'Preferences', 'CLOSE';");

            String input = sc.nextLine();

            UserConsole c = new UserConsole();

            while (!(input.equals("CLOSE"))) {
                c.run(input);
                System.out.println("Enter Command:");

                input = sc.nextLine();
            }
            open();
        }

        if(choice.equals("BOOK")){

            BookView.view();

            System.out.println("Enter Command:");

        String input = sc.nextLine();

        BookConsole c = new BookConsole();

        while(!(input.equals("CLOSE"))){
            c.run(input);
            System.out.println("Enter Command:");

            input = sc.nextLine();
        }

        String[] args = new String[]{"TEMP"};
        ReferenceStorage.reset();
        Launch.main(args);
        }

    }

}
