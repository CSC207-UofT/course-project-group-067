package Entities;

public class Admin extends User{
    public boolean canEdit(){
        return true;
    }
}
