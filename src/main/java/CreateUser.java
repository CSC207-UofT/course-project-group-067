import java.util.Scanner;

public class CreateUser {

    static Scanner sc = new Scanner(System.in);

    public static void create(){
        User u = new User();
        fieldName(u);
        fieldPreferences(u);
        UserManager.addUser(u);
    }

    private static void fieldName(User u) {
        System.out.println("Enter UserName");
        String name = sc.nextLine().strip();
        u.addName(name);
    }

    private static void fieldPreferences(User u) {
        System.out.println("Enter Preferences, END to finish");
        String input = sc.nextLine();

        while(!(input.equals("END"))){
            u.addPreferences(input);
            input = sc.nextLine();
        }

    }
}
