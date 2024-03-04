package banque;

import java.util.Scanner;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
public class Compte {
    private int numero;
    private String nom;
    private double solde;
    private String password;
    private char access ;
    private static int nbComptes;
    private List<Operation> listOperations = new ArrayList<>();
    
    public Compte(String nom ,double solde, String password ){
                if (nom == null){Scanner A=new Scanner(System.in);
                    System.out.print("donner le nom:");
                    nom=A.next();
                    A.close(); 
                }
                else this.nom=nom;
                this.solde=solde;
                this.password=password;
                nbComptes++;
                numero=nbComptes;
    }
    public Compte(){
        this(null, 0.0 , null);
    }
    public Compte(Compte compte)  {
            nom=compte.nom;
            solde=compte.solde;
            password=compte.password;
            numero=++nbComptes;
    }

    public void deposer(double montant){
        this.solde+=montant;
        Date date = new Date();
        int type = 1;
        Operation o = new Operation(type, montant, date);
        add(o);

    }
	
    public void retirer(double montant) throws SoldInsuffisantException {
        if (this.solde>=montant){
            this.solde-=montant;
            Date date = new Date();
            int type = -1;
            Operation o = new Operation(type, montant, date);
            add(o);
            
        }
        else{
            throw new SoldInsuffisantException(this , montant);
        }
    }
    public void virer (double montant, Compte compte) throws SoldInsuffisantException{
        this.retirer(montant) ;
        compte.deposer(montant);
    }
    public String Tostring(){

        String res= "le numero du compte est: "+this.numero+"\n"+" le nom du proprietere est:"+this.nom+" le solde est:"+this.solde;
        return res;
    }
    public double getSolde(){
        return this.solde;
    }
    public void setSolde(double  newSolde){
                this.solde=newSolde;
    }
    public void add(Operation operation){
        listOperations.add(operation);
    }
    public void relevé(){
        for(int i=0 ; i<listOperations.size() ; i++ ){
            Operation a = listOperations.get(i);
            System.out.println("Numéro= "+numero+"\t Nom= "+nom);
            if (a.getType()<0){
                System.out.println(a.getDate() + " retrait \t \t "+ a.getMontant() + "\n");
            }
            else {
                System.out.println(a.getDate() + "   depot   "+ a.getMontant() + "\n");
            }
        }
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String newpassword){
        this.password=newpassword;
    }
    public char getAccess(){
        return this.access;
    }
    public void setAccess(char newAccess){
        this.access=newAccess;
    }

    
}


