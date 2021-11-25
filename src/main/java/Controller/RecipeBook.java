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
        MainMenuConsole c = new MainMenuConsole();
        BookConsole bc = new BookConsole();
        UserConsole uc = new UserConsole();
        AbstractConsole currentConsole = c;


        String input = ("Main Menu");



        while(!(input.equals("CLOSE"))){
            System.out.println("Enter Command:");
            System.out.println(currentConsole);
            input = sc.nextLine();
            switch (input) {
                case "User Profile": currentConsole = uc;
                break;
                case "Start": currentConsole = bc;
                break;
                case "Main Menu": currentConsole = c;
                break;
                default: currentConsole.run(input); //If the command does not change the console, it will be run
            }
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
