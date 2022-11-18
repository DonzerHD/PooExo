package exoPOO;

public class CompteBancaire {
	// attributs
      double solde;
        
    
    //Constructeur
     public CompteBancaire(double solde) { 
    	  this.solde = solde;
      }

    //méthodes
     
     public String CalculSolde(double ligne1, double ligne2, double ligne3, double ligne4, double ligne5) {
    	double sommeFinal = this.solde + ligne1 + ligne2 + ligne3 + ligne4 + ligne5;
    	 return "Le solde de votre compte est de : " + sommeFinal + "€";
     }
     
     public String CalculMoyenneLigne(double ligne1, double ligne2, double ligne3, double ligne4, double ligne5) {
    	 double sommeFinal = (ligne1 + ligne2 + ligne3 + ligne4 + ligne5) / 5;
    	 return "La moyenne des lignes de compte est de : " + sommeFinal + "€";
     }
     
     public void  LigneE(double ligne1, double ligne2, double ligne3, double ligne4, double ligne5) {
    	 if( ligne1 >= ligne2 && ligne1 >= ligne3 && ligne1 >= ligne4 && ligne1 >= ligne5)
             System.out.println("La ligne la plus élevée est "+ ligne1);
         else if (ligne2 >= ligne1 && ligne2 >= ligne3 && ligne2 >= ligne4 && ligne2 >= ligne5)
             System.out.println("La ligne la plus élevée est "+ ligne2);
         else if (ligne3 >= ligne1 && ligne3 >= ligne2 && ligne3 >= ligne4 && ligne3 >= ligne5)
             System.out.println("La ligne la plus élevée est "+ ligne3);
         else if (ligne4 >= ligne1 && ligne4 >= ligne2 && ligne4 >= ligne3 && ligne4 >= ligne5)
             System.out.println("La ligne la plus élevée est "+ ligne4);
         else
             System.out.println("La ligne la plus élevée est " + ligne5 + "€");
     }
     
     public void  LigneF(double ligne1, double ligne2, double ligne3, double ligne4, double ligne5) {
    	 if( ligne1 <= ligne2 && ligne1 <= ligne3 && ligne1 <= ligne4 && ligne1 <= ligne5)
             System.out.println("La ligne la plus faible est "+ ligne1);
         else if (ligne2 <= ligne1 && ligne2 <= ligne3 && ligne2 <= ligne4 && ligne2 <= ligne5)
             System.out.println("La ligne la plus faible est "+ ligne2);
         else if (ligne3 <= ligne1 && ligne3 <= ligne2 && ligne3 <= ligne4 && ligne3 <= ligne5)
             System.out.println("La ligne la plus faible est "+ ligne3);
         else if (ligne4 <= ligne1 && ligne4 <= ligne2 && ligne4 <= ligne3 && ligne4 <= ligne5)
             System.out.println("La ligne la plus faible est "+ ligne4);
         else
             System.out.println("La ligne la plus faible est " + ligne5 + "€");
     }
}

