package fr.eni.ecole.QuelMedecin;

public class MedecinGeneraliste extends Medecin {
	// attributs d'instance
	//	private String nom;
	//	private String prenom;
	//	private String telephone;
	//	private Adresse adresse;
	//	private Creneau[] creneaux = new Creneau[15];

	// attributs de la classe
	private static int tarif = 25;


	// constructeur public de la base
	//	public MedecinGeneraliste() {
	//
	//	}

	// constructeur public parametré 
	public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
		super(nom, prenom, telephone, adresse);
		//		this.nom = nom.toUpperCase();
		//		this.prenom = prenom;
		//		this.telephone = telephone;
		//		this.adresse = adresse;
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
	 * @return the tarif
	 */
	public static int getTarif() {
		return MedecinGeneraliste.tarif;
	}

	/**
	 * @param tarif the tarif to set
	 */
	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
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

	// méthodes d'action

	public void afficher() {
		super.afficher();
		System.out.println("Tarif : "+MedecinGeneraliste.getTarif() + "€");
		this.afficherAdresseEtCreneaux();
	}
}



