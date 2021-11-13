package Serialization;

import Controller.RecipeBook;
import Managers.DishManager;
import Managers.IngredientManager;
import Managers.UserManager;
import ObjectConversion.ReferenceStorage;

import java.io.*;

public class SerializationClass {
    public static void umWrite(UserManager userManager) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("um.ser", false);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(userManager);
        out.close();
        fileOut.close();
        System.out.println("Serialized UserManager data is saved in um.ser");
    }
    public static void umRead() throws IOException, ClassNotFoundException {
        File f = new File("um.ser");
        if(f.exists()){
            FileInputStream fileInputStream = new FileInputStream("um.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ReferenceStorage.um = (UserManager) objectInputStream.readObject();
            objectInputStream.close();
        }
        else{
            ReferenceStorage.um = new UserManager();
        }
    }
    public static void dmWrite(DishManager dishManager) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("dm.ser", false);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(dishManager);
        out.close();
        fileOut.close();
        System.out.println("Serialized DishManager data is saved in dm.ser");
    }
    public static void dmRead() throws IOException, ClassNotFoundException {
        File f = new File("dm.ser");
        if(f.exists()){
            FileInputStream fileInputStream = new FileInputStream("dm.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ReferenceStorage.dm = (DishManager) objectInputStream.readObject();
            objectInputStream.close();
        }
        else{
            ReferenceStorage.dm = new DishManager();
        }
    }
    public static void imWrite(IngredientManager ingredientManager) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("im.ser", false);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(ingredientManager);
        out.close();
        fileOut.close();
        System.out.println("Serialized IngredientManager data is saved in im.ser");
    }
    public static void imRead() throws IOException, ClassNotFoundException {
        File f = new File("im.ser");
        if(f.exists()){
            FileInputStream fileInputStream = new FileInputStream("im.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ReferenceStorage.im = (IngredientManager) objectInputStream.readObject();
            objectInputStream.close();
        }
        else{
            ReferenceStorage.im = new IngredientManager();
        }
    }
}
