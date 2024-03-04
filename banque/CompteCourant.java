package banque;

import java.util.Date;

public class CompteCourant extends Compte {
    private int decouvert;

    public CompteCourant(String nom, double solde, int decouvert , String password) {
        super(nom, solde,password);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double montant) throws SoldInsuffisantException {
        if (montant > (getSolde() + decouvert)) {
            throw new SoldInsuffisantException(this, montant);
        } else {
            setSolde(getSolde() - montant);
            Date date = new Date();
            int type = -1;
            Operation o = new Operation(type, montant, date);
            add(o);
           
        }
    }
}
