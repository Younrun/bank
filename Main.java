
import banque.*;
public class Main  {
    public static void main(String[] args) throws SoldInsuffisantException
    
    {
        
        Compte compte1= new Compte("younes", 1500.0,"00002");
        Compte compte2 = new Compte("yassine", 1600.0,"00001");
        CompteCourant compte3 = new CompteCourant("Ahmed", 5000, 1000);
        CompteEpargne compte4 = new CompteEpargne("carlos", 500, 0.75);
        try{
                compte2.virer(200,compte1);
                System.out.println(compte1.Tostring());
                System.out.println(compte2.Tostring());}
                catch( SoldInsuffisantException e){
                e.printStackTrace();
                System.out.println("impossible de retirer le montant 1000000 solde :"+compte1.getSolde());
         }
         compte1.retirer(300);
         compte1.retirer(500);
         compte1.deposer(3000);
         compte1.retirer(800);

         compte3.retirer(5500);
         compte4.deposer(6900);
         System.out.println(compte3.getSolde()+"\n \n");
         System.out.println(compte4.getSolde()+"\n \n" );
          System.out.println("relevé du compte 1\n");
         compte1.relevé();
         System.out.println("\n \n");
         System.out.println("relevé du compte 2\n");
         compte2.relevé();

    }
}
