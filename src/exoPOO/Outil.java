package exoPOO;

/**
 * @author Thomas.L et Padoue
 *
 */
public class Outil {
      private String nom;
      private String description;
      private String utilisaton;
      private String lieuxStockage;
      
      public Outil(String nom, String description, String utilisation, String lieuxStockage) {
    	 this.nom = nom;
    	 this.description = description;
    	 this.utilisaton = utilisation;
    	 this.lieuxStockage = lieuxStockage;
      }
      
      public Outil(){    	  
      }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUtilisaton() {
		return utilisaton;
	}

	public void setUtilisaton(String utilisaton) {
		this.utilisaton = utilisaton;
	}

	public String getLieuxStockage() {
		return lieuxStockage;
	}

	public void setLieuxStockage(String lieuxStockage) {
		this.lieuxStockage = lieuxStockage;
	}
      
}
