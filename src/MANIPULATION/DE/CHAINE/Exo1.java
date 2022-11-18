package MANIPULATION.DE.CHAINE;

import java.util.Scanner;

public class Exo1 {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Ecrire une chaîne de caractères: ");
	   String chaineC = scanner.nextLine();
	   
	   // Appels des fonctions
       int nbr_occurE= compteurChar(chaineC, 'e', 'E');  
       int nbr_occurA= compteurChar(chaineC, 'a', 'A');
       int nbr_occurO= compteurChar(chaineC, 'o', 'O');
       
       // Affichage dans la console
       System.out.println("Nombre de 'e' dans le texte= " + nbr_occurE);
       System.out.println("Nombre de 'a' dans le texte= " + nbr_occurA);
       System.out.println("Nombre de 'o' dans le texte= " + nbr_occurO);
       
       scanner.close();
	      
   }
   
   //Fonction qui compte le nombre d'un même caractère dans une chaine de caractères.
   public static int compteurChar(String str, char chm, char chM) 
	{
 	int compteur = 0; 
 	for (int i = 0; i < str.length(); i++) 
   if (str.charAt(i) == chm)           // Minuscule
      compteur++;      
   else if(str.charAt(i) == chM) {    // Majuscule
	   compteur++;
   }
 	return compteur;   // le compteur est celui qui compte le nombre du même caractère.
	}   
}

