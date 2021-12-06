package Controller;


import Database.JBDC;
import Entities.User;
import EntityCreation.EntityCreatorDistributor;

import ObjectConversion.ReferenceStorage;
import Serialization.AddToDB;
import Serialization.Initialize;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Launch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        initializeAll();

        if(ReferenceStorage.um.getUserList().isEmpty()){
            System.out.println("No Users Found, Creating New User....");
            LaunchUserMaker();

        }

        printUsers();


        boolean loop = true;
        while(loop) {

            System.out.println("Select from the users listed or enter 'create' to create a new user or 'end' to terminate");
            String input = sc.nextLine().strip().toLowerCase();

            if (input.equals("end")){
                loop = false;
                break;
            }

            else if (input.equals("create")) {
                LaunchUserMaker();
            }

            else if (ReferenceStorage.um.getUserNames().contains(input)){
                ReferenceStorage.u = ReferenceStorage.um.getUserByName(input);

                RecipeBook rb = new RecipeBook();
                rb.open();
            }

            else{
                System.out.println("User not found...");
            }
            printUsers();

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
        User u = EntityCreatorDistributor.distribute("USER","").create();
        ReferenceStorage.um.addUser(u);
        new AddToDB().AddUser(u);
    }

    private static void printUsers(){
        System.out.println("Users:");
        for(User u : ReferenceStorage.um.getUserList()){
            System.out.println(u.getName());
        }
    }

}
