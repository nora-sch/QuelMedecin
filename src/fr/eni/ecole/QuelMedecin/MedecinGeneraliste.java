package fr.eni.ecole.QuelMedecin;

public class MedecinGeneraliste {
	// attributs d'instance
	private String nom;
	private String prenom;
	private String telephone;
	private Adresse adresse;
	private Creneau[] creneaux = new Creneau[15];

	// attributs de la classe
	private static int tarif = 25;


	// constructeur public de la base
	public MedecinGeneraliste() {

	}

	// constructeur public parametré 
	public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
		super();
		this.nom = nom.toUpperCase();
		this.prenom = prenom;
		this.telephone = telephone;
		this.adresse = adresse;
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
		return tarif;
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
		System.out.println(this.nom.toUpperCase() + " " +this.prenom);	
		System.out.println("Téléphone : "+this.telephone);
		System.out.println("Tarif : "+MedecinGeneraliste.getTarif() + "€");
		System.out.print("Adresse : ");
		this.adresse.afficher();
		System.out.println("Créneaux :");
		for(int i = 0; i<this.creneaux.length; i++) {
			if(this.creneaux[i]!=null) {
				this.creneaux[i].afficher();
			}
		}

// version 2
//		System.out.printf("%s %s%nTéléphone : %s%nTarif : %d€%nAdresse :%n",
//				this.nom, this.prenom,
//				this.telephone, MedecinGeneraliste.tarif);
//		this.adresse.afficher();
//		System.out.println("Créneaux :");
//		for(int i=0; i<this.creneaux.length; i++)
//			if(this.creneaux[i]!=null)
//				this.creneaux[i].afficher();
//	}




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
	
// version 2
//	if (this != creneau.getMedecin()) {
//		System.err.println("Ce créneau ne peut être associé à ce médecin " +
//		"car il est déjà associé à un autre");
//		} else {
//		int pos = 0;
//		while (pos < this.creneaux.length && this.creneaux[pos] != null)
//		pos++;
//		if (pos == this.creneaux.length)
//		System.err.println(
//		"Trop de créneaux sont affectés à ce médecin");
//		else
//		this.creneaux[pos] = creneau;
//		}

}


}
