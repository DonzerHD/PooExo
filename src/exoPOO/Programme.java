package exoPOO;

public class Programme {
  public static void main(String[] args) {
	  
	 // Les Contacts
	/* Contact personne1 = new Contact("Lemay", "Thomas", 22);
	Contact personne2 = new Contact("Donove","Emmanuel", 44);
	Contact personne3 = new Contact("Coco","Marie", 64);
	Contact personne4 = new Contact("Longo","Paola", 43);
	personne1.AffichageDuTri();
	personne1.AffichageIni();
	personne1.AffichageInfo();
	personne2.AffichageDuTri();
	personne2.AffichageIni();
	personne2.AffichageInfo();
	personne3.AffichageInfo(); */
	
	 //Comptes Bancaires
  	 	 LigneCompteBancaire ligne1 = new LigneCompteBancaire("Carrefour", -64.45);
  	 	 LigneCompteBancaire ligne2 = new LigneCompteBancaire("Micromania", -32.55);
  	 	 LigneCompteBancaire ligne3 = new LigneCompteBancaire("Salaire", 2264.45);
  	 	 LigneCompteBancaire ligne4 = new LigneCompteBancaire("Crabe", 23.44);
  	 	 LigneCompteBancaire ligne5 = new LigneCompteBancaire("Trade", 22.33);
  	 	  
  	 	System.out.println(ligne1.Indication());
  	 	System.out.println(ligne2.Indication());
  	 	System.out.println(ligne3.Indication());
  	 	System.out.println(ligne4.Indication());
  	 	System.out.println(ligne5.Indication());
  	 	
  	 	CompteBancaire compte1 = new CompteBancaire(300.44);
  	 	System.out.println(compte1.CalculSolde(ligne1.montant, ligne2.montant, ligne3.montant, ligne4.montant, ligne5.montant));
  	 	System.out.println(compte1.CalculMoyenneLigne(ligne1.montant, ligne2.montant, ligne3.montant, ligne4.montant, ligne5.montant));
  	 	compte1.LigneE(ligne1.montant, ligne2.montant, ligne3.montant, ligne4.montant, ligne5.montant);
  	 	compte1.LigneF(ligne1.montant, ligne2.montant, ligne3.montant, ligne4.montant, ligne5.montant);
         
	  }	
}
