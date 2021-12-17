package fr.eni.ecole.QuelMedecin;

public class Medecin extends Personne {
	// attributs d'instance

	private Creneau[] creneaux = new Creneau[15];

	// attributs de la classe

	// constructeur public parametré 
	public Medecin(String nom, String prenom, String telephone, Adresse adresse) {
		super(nom, prenom, telephone, adresse);
	}

	// getters et setters
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	// méthodes 

	//	public void afficher() {
	//		super.afficher();
	//		
	//	}
	public void afficherAdresseEtCreneaux() {
		System.out.println("Adresse: ");
		this.adresse.afficher();
		System.out.println("Créneaux :");
		for(int i = 0; i<this.creneaux.length; i++) {
			if(this.creneaux[i]!=null) {
				this.creneaux[i].afficher();
			}
		}
	}

	public void ajouterCreneau(Creneau creneau) {
		int index = 0;
		while(index<this.creneaux.length && this.creneaux[index]!=null) {
			index++;		
		}
		if(index==this.creneaux.length) {
			System.err.println("Limit de 15 creneaux par jour est atteint!");
		}else {
			if(creneau.getMedecin()!=null && creneau.getMedecin()!=this) {
				System.err.println("Ce creneau est déjà pris par un autre medecine!");
			}else if(creneau.getMedecin()!=null) {
				creneau.setMedecin(this);
			}
			this.creneaux[index] = creneau;
		}
	}


}
