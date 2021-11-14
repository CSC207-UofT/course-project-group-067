package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Serialization.SerializationClass;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class RecipeBook{


    public void open() throws IOException, ClassNotFoundException {
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
    private void initializeManagers() throws IOException, ClassNotFoundException {
        SerializationClass.umRead();
        SerializationClass.dmRead();
        SerializationClass.imRead();

    }


}
