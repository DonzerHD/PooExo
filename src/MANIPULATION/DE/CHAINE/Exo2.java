package MANIPULATION.DE.CHAINE;

import java.util.Scanner;

public class Exo2 {

    public static void main(String[] args) {

    // création de la variable
        Scanner scanner = new Scanner (System.in);
        System.out.println("ecrire une chaine de caractère: ");
        final String SEPARATEUR = " ";
        String str = scanner.nextLine();

        String mots[]= str.split(SEPARATEUR);
        
        System.out.println("Majuscule dans chaque début de mot : ");
        
        scanner.close();

        for (int i = 0; i < mots.length; i++) {
        

    // définition le nombre de lettre en majuscule dans un mot
        String firstLtr = mots[i].substring(0, 1);
    // définit le nombre de lettre supprimier pour placer une majuscule
        String restLtrs = mots[i].substring(1, mots[i].length());


    // Exécute toute les instructions pour définir la majuscule et ce qui ne les pas
        firstLtr = firstLtr.toUpperCase();
        mots[i] = firstLtr + restLtrs;
        
        // //
        System.out.print(mots[i] + " ");
        }
     
    }

}