package MANIPULATION.DE.CHAINE;

import java.util.Scanner;

public class Exo3 {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Ecrire une chaîne de caractères: ");
	   String chaineC = scanner.nextLine();
	   scanner.close();
	   
	   chaineC = chaineC.replace("e", "3");
	   chaineC = chaineC.replace("E", "3");
	   chaineC = chaineC.replace("o", "0");
	   chaineC = chaineC.replace("O", "0");

       System.out.println(chaineC);
}
}
