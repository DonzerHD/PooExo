package exoPOO;

public class CompteBancaire {
	// attributs
      

    
    //Constructeur
   
    
    //méthodes
 
	public static void Indication(final String intitulé, final double montant) {
		   if (montant > 0 ) {
			   System.out.println(intitulé + " +" + montant + "€"); 
		   }else{
		   System.out.println(intitulé + " " + montant + "€");
		   }
	}
}
