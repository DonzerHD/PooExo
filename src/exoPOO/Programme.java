package exoPOO;

public class Programme {
  public static void main(String[] args) {
	  
	 //------------------ Programme Les Contacts ------------------------ //
	  
	            // Création des contacts
	  
	/* Contact personne1 = new Contact("Lemay", "Thomas", 22);
	Contact personne2 = new Contact("Donove","Emmanuel", 44);
	Contact personne3 = new Contact("Coco","Marie", 64);
	Contact personne4 = new Contact("Longo","Paola", 43);
	
	// Affichage des infos et du trigramme et des initiales.
	  
	personne1.AffichageDuTri();  
	personne1.AffichageIni();
	personne1.AffichageInfo();
	personne2.AffichageDuTri();
	personne2.AffichageIni();
	personne2.AffichageInfo();
	personne3.AffichageInfo(); */
	
	//----------------------- Exercice 5-----------------//
  	 	
	   // Création des lignes
	  
	   /* LigneCompteBancaire ligne1 = new LigneCompteBancaire("Carrefour", -64.45);
  	 	 LigneCompteBancaire ligne2 = new LigneCompteBancaire("Micromania", -32.55);
  	 	 LigneCompteBancaire ligne3 = new LigneCompteBancaire("Salaire", 2264.45);
  	 	 LigneCompteBancaire ligne4 = new LigneCompteBancaire("Crabe", 23323.44);
  	 	 LigneCompteBancaire ligne5 = new LigneCompteBancaire("Trade", -2232.33);
  	 	  
  	  // Affichage des lignes
  	   
  	 	System.out.println(ligne1.Indication());
  	 	System.out.println(ligne2.Indication());
  	 	System.out.println(ligne3.Indication());
  	 	System.out.println(ligne4.Indication());
  	 	System.out.println(ligne5.Indication()); */
  	 
  	 	 	   
	
	//----------------------- Programme Exercice 6 et 7-----------------//
	  
	 // L'utilisateur peut saisir les lignes comptables 
	  CompteBancaire compte1 = new CompteBancaire(1000);
	  System.out.println("--------------------------------------------------------");
	  System.out.println(compte1.CalculMoyenneLigne());
	  System.out.println("--------------------------------------------------------");
	  System.out.println(compte1.LigneE());
	  System.out.println("--------------------------------------------------------");
	  System.out.println(compte1.CalculSolde());
	  System.out.println("--------------------------------------------------------"); 
	 
	  
	//----------------------- Programme Exercice 8-----------------//
	  
	  
	     Outil Marteau = new Outil();
	     Outil Tournevis = new Outil("Tournevis","Outil emmanché comportant une tige cylindrique en acier dont l'extrémité est adaptée pour visser ou dévisser des vis." , "Le tournevis est un outil de poing utilisé entre autres pour l'insertion et le retrait des vis dans les matériaux.", "Maison");

	  }	
}
