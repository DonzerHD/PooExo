package exoPOO;

/**
 * @author  Permet de créer des contacts avec nom ; prénom et âge .
 *
 */
public class Contact {
	// Attributs
   private String nom;
   private String prenom;
   private int age;
   private static int users;    // Affiche la population (+1) à chaque fois qu'une personne est créée .
   
   //Constructeur
   public Contact(final String nom,final String prenom,final int age) {
	   this.nom = nom;
	   this.prenom = prenom;
	   this.age = age;
	   users++;
   }
   
   // -- Méthodes --
   
   // Affichage des informations du contact
   public void AffichageInfo() {
	   System.out.println("Nom : " + this.nom + " Prénom : " + this.prenom + " Age : " + this.age + " ans. Population : " + users );
   }  
   // Affiche le trigramme
   public void AffichageDuTri() {
	   String lettreP= this.prenom.substring(0,1);
	   String lettreNf= this.nom.substring(0,1);
	   String nomM = this.nom.toUpperCase();
	   char lettreNl = nomM.charAt(nomM.length()-1);
	   System.out.println(lettreP + lettreNf + lettreNl);
   }
   //Affiche les initiales
	   public void AffichageIni(){
		 String lettreP= this.prenom.substring(0,1);
		String lettreNf= this.nom.substring(0,1);
		System.out.println(lettreNf + lettreP);
	   }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getUsers() {
		return users;
	}

	public static void setUsers(int users) {
		Contact.users = users;
	}
   } 

