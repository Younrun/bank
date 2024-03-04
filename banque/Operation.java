package banque;
import java.util.Date;
public class Operation {
    private Date date;
    private double montant;
    private int type;
     public Operation(int type , double montant, Date date){
        this.type = type;
        this.date=date;
        this.montant=montant;
     }
     public boolean equals(Operation ope){
        return this.type==ope.type && this.montant==ope.montant && this.date.equals(ope.date);
     }
     public String Tostring(){
        String res = "le type est: "+this.type+" le montant est: "+this.montant+" la date de l'operation est: "+this.date;
        return res;
     }
     public int getType(){
        return this.type;
     }
     public void setType(int type){
        this.type=type;
     }
     public double getMontant(){
        return this.montant;
     }
     public void setMontant(double montant){
        this.montant=montant;
     }
     public Date getDate(){
        return this.date;
     }
     public void setDate(Date date){
        this.date=date;
     }
}
