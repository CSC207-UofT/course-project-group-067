package Controller;

import ObjectConversion.ReferenceStorage;

import java.sql.SQLException;
import java.util.Scanner;

public class RecipeBook {

    public void open() throws SQLException {

        Scanner sc = new Scanner(System.in);

        menuOptions();

        String choice = sc.nextLine().strip().toLowerCase();
        while (!(choice.equals("close"))) {

            if (choice.equals("profile")) {
                userOptions();

                String input = sc.nextLine().toLowerCase();

                UserConsole c = new UserConsole();

                while (!(input.equals("close"))) {
                    try {
                        c.run(input);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    userOptions();

                    input = sc.nextLine().toLowerCase();
                }

            } else if (choice.equals("book")) {

                bookOptions();

                String input = sc.nextLine().toLowerCase();

                BookConsole c = new BookConsole();

                while (!(input.equals("close"))) {
                    try {
                        c.run(input);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    bookOptions();

                    input = sc.nextLine().toLowerCase();
                }
            } else {
                System.out.println("Invalid choice");
            }
            menuOptions();

            choice = sc.nextLine().strip().toLowerCase();

        }


    }

    private void userOptions() {
        System.out.println("Enter one of the following" + "\n");
        System.out.println("favourites -> To see the favourite dishes \n");
        System.out.println("preferences -> To see the preferred attributes \n");
        System.out.println("add to preferences -> To add an attribute to your preferred attributes \n");
        System.out.println("remove from preferences -> To remove an attribute from your preferred attributes \n");
        System.out.println("close -> To return to main menu \n");

    }

    private void menuOptions() {
        System.out.println("Enter one of the following" + "\n");
        System.out.println("book -> To open the recipe book menu" + "\n");
        System.out.println("profile -> To open the user profile menu" + "\n");
        System.out.println("close -> To return to user selection menu \n");

    }

    private void bookOptions() {
        System.out.println("Enter one of the following" + "\n");
        System.out.println("view dishes -> To view all stored dishes \n");
        System.out.println("view ingredients -> To view all stored ingredients \n");
        System.out.println("view ingredient -> To view details of a specific ingredient \n");
        System.out.println("favourites -> To view all dishes marked as favourite \n");
        System.out.println("add to favourites -> To add a dish to your list of favourite dishes \n");
        System.out.println("remove from favourites -> To remove a dish from your list of favourite dishes \n");
        System.out.println("preferences -> To view all dishes containing preferred attributes \n");
        if (ReferenceStorage.u.getEdit().equals("1")) {
            System.out.println("create dish -> To create a new dish \n");
            System.out.println("create ingredient -> To create a new ingredient \n");
        }
    }

}
