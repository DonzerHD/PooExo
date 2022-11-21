package exoPOO;


/**
 * This class allows you to create a contact
 * @author Thomas.L et Padoue
 */
public class Contact {

   private String nom;
   private String prenom;
   private int age;
   /**
 * Adds +1 to the population each time a user is created.
 */
private static int users;    
   
 
   /**
    * This class allows you to create a contact
 * @param nom  name
 * @param prenom first name
 * @param age age
 * 
 */
public Contact(final String nom,final String prenom,final int age) {
	   this.nom = nom;
	   this.prenom = prenom;
	   this.age = age;
	   users++;
   }
   
  

   /**
 * Displays contact information .
 */
public void AffichageInfo() {
	   System.out.println("Nom : " + this.nom + " Prénom : " + this.prenom + " Age : " + this.age + " ans. Population : " + users );
   }  
 
   /**
 * Displays the trigram of the contact .
 */
public void AffichageDuTri() {
	   String lettreP= this.prenom.substring(0,1);
	   String lettreNf= this.nom.substring(0,1);
	   String nomM = this.nom.toUpperCase();
	   char lettreNl = nomM.charAt(nomM.length()-1);
	   System.out.println(lettreP + lettreNf + lettreNl);
   }

	   /**
	 * Displays contact initials
	 */
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

