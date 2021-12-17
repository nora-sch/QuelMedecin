package fr.eni.ecole.QuelMedecin;

public class MedecinSpecialiste extends Medecin {

	// attributs d'instance
	private String spec;
	private int tarif;

	// attributs de la classe

	// constructeur public parametré 
	public MedecinSpecialiste(String nom, String prenom, String telephone, Adresse adresse, String specialite, int tarif) {
		super(nom, prenom, telephone, adresse);
		this.spec = specialite;
		this.tarif = tarif;
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

	/**
	 * @return the type
	 */
	public String getSpecialite() {
		return spec;
	}

	/**
	 * @param type the type to set
	 */
	public void setSpecialite(String specialite) {
		this.spec = specialite;
	}

	/**
	 * @return the tarifPersonnalise
	 */
	public int getTarif() {
		return tarif;
	}

	/**
	 * @param tarifPersonnalise the tarifPersonnalise to set
	 */
	public void setTarif(int tarifPersonnalise) {
		this.tarif = tarifPersonnalise;
	}


	// méthodes
	
	public void afficher() {
		super.afficher();
		System.out.println("Spécialité : "+this.spec);
		System.out.println("Tarif : "+ this.getTarif() + "€");
		this.afficherAdresseEtCreneaux();
	}

}


