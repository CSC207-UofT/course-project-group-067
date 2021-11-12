package Controller;


import EntityCreation.EntityCreatorDistributor;

import ObjectConversion.ReferenceStorage;

import java.util.Scanner;

public class Launch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initializeUserManager();

        if(ReferenceStorage.um.getMap().isEmpty()){
            System.out.println("No Users Found, Creating New Entities.User....");
            ReferenceStorage.um.addUser(EntityCreatorDistributor.distribute("USER","").create());
        }

        System.out.println("Users:");
        for(String username: ReferenceStorage.um.getUserNames()){
            System.out.println(username);
        }

        System.out.println("Enter Your Username");
        String input = sc.nextLine().strip();

        while(!(ReferenceStorage.um.getUserNames().contains(input))){
            System.out.println("Username not found, retry");
            input = sc.nextLine().strip();
        }
        ReferenceStorage.u = ReferenceStorage.um.getUserByName(input);

        RecipeBook rb = new RecipeBook();
        rb.open();

    }


    /*
    De-serialize the usermanager data and store it as a UserManager object in ReferenceStorage.um
     */
    public static void initializeUserManager(){

    }

}
