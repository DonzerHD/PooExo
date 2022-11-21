package exoPOO;

import java.util.Scanner;

public class CompteBancaire {
	// attributs
      private double solde;
      private double[] montant1;
      private String[] intitulé1;
        
    
    //Constructeur
      
 
  public CompteBancaire(double solde) {
	   Scanner scanner = new Scanner(System.in);
  	   this.solde = solde;
  	       System.out.println("--------------------------------------------------------");
          System.out.println("Le solde de votre compte est de : " + this.solde + "€");
          System.out.println("--------------------------------------------------------");
  		  System.out.print("Combien de lignes voulez vous tapez : ");
		       int chiffre = scanner.nextInt();
		       montant1 = new double[chiffre];
		       intitulé1 = new String[chiffre];
  		        UtilisateurLigne(); 
  		      scanner.close();
     }
    //méthodes
     
     
     // Calcul de la solde
     public String CalculSolde() { 
    	 double somme = 0;
         for( double i : montant1) {
             somme = somme + i;
         }
    	double sommeFinal = this.solde + somme ;
    	 return "Le solde de votre compte est maintenant de : " + sommeFinal + "€";
     }
     
     
     // Calcul la moyenne des lignes
     public String CalculMoyenneLigne() {
    	 double somme = 0;
    	 for(int i = 0; i < montant1.length; i++){
    	 somme += montant1[i];
    	 }
    	 double sommeFinal = somme / montant1.length;
    	 return "La moyenne des lignes du compte est de : " + sommeFinal + "€";
     }
     
     
     //Affiche la ligne la plus élevée et plus faible
     public String  LigneE() { 
    	 double maxVal = Integer.MAX_VALUE;
    	 double minVal = Integer.MIN_VALUE;
    	 
    	 for(int i = 0; i < montant1.length; i++){
    		 if(montant1[i] < maxVal) {
    		 maxVal = montant1[i];}
    		 if(montant1[i] > minVal) {
    		minVal = montant1[i];}
    		 } 
    		 return "La ligne la plus élevée est " +  minVal + "€ et la plus faible est " + maxVal + "€";
     }
     
   
     public void UtilisateurLigne() {
	       Scanner scanner = new Scanner(System.in);
	       
	       // Intitulé
	       
  	   for (int i = 0; i < intitulé1.length ; i++) {
  		   int a = i + 1;
  		   System.out.print("Rentrez l'intitulé " + a + " : ");
  		   intitulé1[i] = scanner.nextLine();		   
  	   }
  	   
  	  // Montant
  	   
  	   for (int i = 0; i < montant1.length ; i++) {
  		   System.out.print("Rentrez le montant de l'intitulé [" + intitulé1[i] + "] : ");    
  		   montant1[i] = scanner.nextDouble();	    	    		   
  	   }
  	   System.out.println("------------------Relevé de compte------------------------------");
	         	   
  	   // Affichage des lignes saisie par l'utilisateur
  	   for (int i = 0; i < montant1.length ; i++) {
      	   if (montant1[i] > 0 ) {   // Si le montant est supérieur à 0
      		   System.out.println( intitulé1[i] + " +" + montant1[i] + "€");
      		
      	   }else{   
      	       System.out.println( intitulé1[i] + " " + montant1[i] + "€");       
      	   }    	
      	   
      	   scanner.close();
      	   
  	   	}  
					
	 }


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public double[] getMontant1() {
		return montant1;
	}


	public void setMontant1(double[] montant1) {
		this.montant1 = montant1;
	}


	public String[] getIntitulé1() {
		return intitulé1;
	}


	public void setIntitulé1(String[] intitulé1) {
		this.intitulé1 = intitulé1;
	} 
}

