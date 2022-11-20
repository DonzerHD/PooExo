package exoPOO;

public class CompteBancaire {
	// attributs
      private double solde;
        
    
    //Constructeur
     public CompteBancaire(double solde) { 
    	  this.solde = solde;
      }

    //méthodes
     
     
     // Calcul de la solde
     public String CalculSolde(double ligne1, double ligne2, double ligne3, double ligne4, double ligne5) { 
    	double sommeFinal = this.solde + ligne1 + ligne2 + ligne3 + ligne4 + ligne5;
    	 return "Le solde de votre compte est de : " + sommeFinal + "€";
     }
     
     
     // Calcul la moyenne des lignes
     public String CalculMoyenneLigne(double ligne1, double ligne2, double ligne3, double ligne4, double ligne5) {
    	 double sommeFinal = (ligne1 + ligne2 + ligne3 + ligne4 + ligne5) / 5;
    	 return "La moyenne des lignes de compte est de : " + sommeFinal + "€";
     }
     
     
     //Affiche la ligne la plus élevée
     public void  LigneE(double ligne1, double ligne2, double ligne3, double ligne4, double ligne5) {
    	 if( ligne1 >= ligne2 && ligne1 >= ligne3 && ligne1 >= ligne4 && ligne1 >= ligne5)           // ligne 1 plus grand 
             System.out.println("La ligne la plus élevée est "+ ligne1 + "€");
         else if (ligne2 >= ligne1 && ligne2 >= ligne3 && ligne2 >= ligne4 && ligne2 >= ligne5)      // ligne 2 plus grand 
             System.out.println("La ligne la plus élevée est "+ ligne2 + "€");
         else if (ligne3 >= ligne1 && ligne3 >= ligne2 && ligne3 >= ligne4 && ligne3 >= ligne5)      // ligne 3 plus grand 
             System.out.println("La ligne la plus élevée est "+ ligne3 + "€");
         else if (ligne4 >= ligne1 && ligne4 >= ligne2 && ligne4 >= ligne3 && ligne4 >= ligne5)      // ligne 4 plus grand 
             System.out.println("La ligne la plus élevée est "+ ligne4 + "€");
         else
             System.out.println("La ligne la plus élevée est " + ligne5 + "€");                     // ligne 5 plus grand 
     }
     
     // Affiche la ligne la plus petite
     public void  LigneF(double ligne1, double ligne2, double ligne3, double ligne4, double ligne5) {    
    	 if( ligne1 <= ligne2 && ligne1 <= ligne3 && ligne1 <= ligne4 && ligne1 <= ligne5)                // ligne 1 plus petite
             System.out.println("La ligne la plus faible est "+ ligne1 + "€");
         else if (ligne2 <= ligne1 && ligne2 <= ligne3 && ligne2 <= ligne4 && ligne2 <= ligne5)           // ligne 2 plus petite
             System.out.println("La ligne la plus faible est "+ ligne2 + "€"); 
         else if (ligne3 <= ligne1 && ligne3 <= ligne2 && ligne3 <= ligne4 && ligne3 <= ligne5)           // ligne 3 plus petite
             System.out.println("La ligne la plus faible est "+ ligne3 + "€");
         else if (ligne4 <= ligne1 && ligne4 <= ligne2 && ligne4 <= ligne3 && ligne4 <= ligne5)           // ligne 4 plus petite
             System.out.println("La ligne la plus faible est "+ ligne4 + "€");
         else
             System.out.println("La ligne la plus faible est " + ligne5 + "€");                           // ligne 5 plus petite
     }

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
}

