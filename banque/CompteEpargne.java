package banque;

import java.util.Date;

public class CompteEpargne extends Compte{
    private double taux;

    public CompteEpargne(String nom , double solde, double taux , String password){
        super(nom, solde, password);
        this.taux=taux;
    }

    @Override
    public void deposer(double montant){
         double NouveauSolde= getSolde()+montant+montant*taux;
         setSolde(NouveauSolde);
         Date date = new Date();
         int type = 1;
         Operation o = new Operation(type, montant, date);
         this.add(o);
    }
}
