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
  
	  LigneCompteBancaire ligne1 = new LigneCompteBancaire("Carrefour", 12.44);
	  System.out.println(ligne1.Indication());
	  
	  
	
	  }	
  
  public static void Indication(final String intitulé, final double montant) {
	   if (montant > 0 ) {
		   System.out.println(intitulé + " +" + montant + "€"); 
	   }else{
	   System.out.println(intitulé + " " + montant + "€");
	   }
}
}
