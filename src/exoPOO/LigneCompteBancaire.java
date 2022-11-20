package exoPOO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LigneCompteBancaire {
	
	   // attributs
	    
	   private String intitulé;
       private double montant;
       
       //Constructeur
       
       // Exo 7 Création des lignes du compte par l'utilisateur
       public LigneCompteBancaire() {
    	   System.out.print("Voulez vous rentrer des lignes si Oui tapez ('O') si Non tapez ('N') : ");
		   Scanner scanner = new Scanner(System.in);
    	   String réponse =  scanner.nextLine();
    	   if ("O".equals(réponse)) {  // Si O lance la fonction UtilisateurLigne
    		 UtilisateurLigne();
           }else if("N".equals(réponse)){ // Si N rien 
    		   
    	   }
    	   }
       
       // Exo 5 Création des lignes du compte
       public LigneCompteBancaire(final String intitulé, final double montant) {
    	   this.intitulé = intitulé;
    	   this.montant = montant;
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
       
    // Affiche les lignes du compte créé par l'utilisateur.
    // Les intitulés seront stocké dans une liste
    // Les montants seront stocké dans un tableau 
       public void UtilisateurLigne() {
		       Scanner scanner = new Scanner(System.in);
		       
		       // Intitulé
    		   System.out.print("Rentrez votre votre intitulé :");
    		   List<String> intituléList = new ArrayList<String>();
        		   intituléList.add(scanner.nextLine());
        	   
        	  // Montant
        	   double [] montant= new double[1];
    		   System.out.print("Rentrez votre votre montant:");
        	   for (int i = 0; i < montant.length ; i++) {
        		   montant[i] = scanner.nextDouble();
        		   
        	   }
        	   
        	   // Si 1 permet à l'utilisateur de relancer la fonction pour ajouter une nouvelle ligne et 2 pour lui permettre d'arrêter .
        	   System.out.print("Voulez vous continuer tapez '1' Oui tapez '2' Non : ");
        	   int argent = scanner.nextInt();
        	   if ( argent == 1) {
        	    UtilisateurLigne();
        	   }else if (argent == 2) {
        	   } 
        	         	   
        	   // Affichage des lignes saisie par l'utilisateur
        	   for (int i = 0; i < montant.length ; i++) {
            	   if (montant[i] > 0 ) {   // Si le montant est supérieur à 0
            		   System.out.println(intituléList.get(i) + " +" + montant[i] + "€");
            	   }else{   // Si le montant est inférieur à 0
            	       System.out.println(intituléList.get(i) + " " + montant[i] + "€");
            	   }
            	   
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

       

