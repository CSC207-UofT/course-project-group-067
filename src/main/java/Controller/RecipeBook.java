package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class RecipeBook{


    public void open() throws IOException, ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        BookView.view();

        System.out.println("Enter Command:");

        String input = sc.nextLine();

        Console c = new Console();

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
