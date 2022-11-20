package exoPOO;

public class LigneCompteBancaire {
	
	   // attributs
	    
	   private String intitulé;
       private double montant;
      
       //Constructeur
       
       public LigneCompteBancaire(final String intitulé, final double montant1) {
    	   this.intitulé = intitulé;
    	   this.montant = montant1;
       }
       
       
       
       //méthodes
       
       // Affiche les lignes du compte;
       public String Indication() {
    	   if (montant > 0 ) {
    		   return intitulé + " +" + montant + "€";
    	   }else{
    	       return intitulé + " " + montant + "€";
    	   }
       }



	public String getIntitulé() {
		return intitulé;
	}



	public void setIntitulé(String intitulé) {
		this.intitulé = intitulé;
	}



	public double getMontant() {
		return montant;
	}



	public void setMontant(double montant) {
		this.montant = montant;
	}
       
   
 						
   	 } 
        	   

             				




       

