package Controller;


import Database.JBDC;
import Entities.User;
import EntityCreation.EntityCreatorDistributor;
import ObjectConversion.ReferenceStorage;
import Serialization.AddToDB;
import Serialization.Initialize;

import java.sql.SQLException;
import java.util.Scanner;

public class Launch {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        initializeAll();

        if (ReferenceStorage.um.getUserList().isEmpty()) {
            System.out.println("No users found, creating new user...." + "\n" + "\n");
            LaunchUserMaker();

        }


        boolean loop = true;
        while (loop) {

            System.out.println("Enter one of the following:" + "\n" + "\n" + "username -> Takes you to the login screen" + "\n");
            System.out.println("create -> To create a new user" + "\n" + "\n" + "end -> To terminate the program" + "\n");
            String input = sc.nextLine().strip().toLowerCase();

            if (input.equals("end")) {
                loop = false;

            } else if (input.equals("create")) {
                LaunchUserMaker();
            } else if (ReferenceStorage.um.getUserNames().contains(input)) {
                ReferenceStorage.u = ReferenceStorage.um.getUserByName(input);

                System.out.println("Enter password for " + ReferenceStorage.u.getName() + "\n");
                String pass = sc.nextLine().strip().toLowerCase();

                if (pass.equals(ReferenceStorage.u.getPassword())) {
                    RecipeBook rb = new RecipeBook();
                    rb.open();
                } else {
                    System.out.println("Invalid password...\n");
                }

            } else {
                System.out.println("User not found...\n");
            }


        }
    }


    private static void initializeAll() throws SQLException {
        Initialize i = new Initialize(JBDC.getDatasets());
        i.initializeAttributes();
        i.initializeIngredients();
        i.initializeDishes();
        i.initializeUsers();
    }

    private static void LaunchUserMaker() throws SQLException {
        User u = EntityCreatorDistributor.distribute("USER", "").create();
        ReferenceStorage.um.addUser(u);
        new AddToDB().AddUser(u);
    }


}
