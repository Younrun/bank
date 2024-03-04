package banque;

public class SoldInsuffisantException extends Exception {
    
   public SoldInsuffisantException (Compte compte , double montant){
    System.out.println("impossible de retirer le montant "+montant+"Solde: "+ compte.getSolde());
   } 
   
    
}
