package banque;
import java.util.Scanner;

public class login {
    public String Name;
    private int nbComptes;
    private String password;

    public void register(String name, String password){
        Compte newaccount = new Compte(name, 0, password);
    }



}
