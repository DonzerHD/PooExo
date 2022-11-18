package exoPOO;

public class LigneCompteBancaire {
	
	   // attributs
	    
	   String intitulé;
       double montant;
       
       //Constructeur
       public LigneCompteBancaire(final String intitulé, final double montant) {
    	   this.intitulé = intitulé;
    	   this.montant = montant;
       }
       
       //méthodes
       public String Indication() {
    	   if (this.montant > 0 ) {
    		   return this.intitulé + " +" + this.montant + "€"; 
    	   }else{
    	       return this.intitulé + " " + this.montant + "€";
    	   }
       }
       
}
