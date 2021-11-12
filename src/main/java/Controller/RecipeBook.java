package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import java.util.Scanner;

public class RecipeBook {


    public void open() {
        initializeManagers();
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

    /*
    De-serialize the managers data and store it as respective managers in ReferenceStorage
     */
    private void initializeManagers() {
    }


}
