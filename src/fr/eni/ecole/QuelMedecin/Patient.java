package fr.eni.ecole.QuelMedecin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient extends Personne {
	// attributs d'instance
//	private String nom;
//	private String prenom;
//	private String telephone;
	private char sexe;
	private long numSoc;
	private LocalDate dateNaissance;
	private String comments;
//	private Adresse adresse;
	// attributs de la classe
	// constructeur public de la base
	//public Patient() {}
	// constructeur public parametré 
	public Patient(String nom, String prenom, String telephone, char sexe, long numSoc, LocalDate dateNaissance, String comments, Adresse adresse) {
		super(nom, prenom, telephone, adresse);
		this.nom = nom.toUpperCase();
		this.prenom = prenom;
		this.telephone = telephone;
		if(sexe!='F' && sexe != 'M') {
			System.err.println("Choisissez bien le sexe pour le patient "+this.nom.toUpperCase()+ " "+ this.prenom+" entre 'M' pour masculin et 'F' pour féminin!");
		}else {
			this.sexe = sexe;	
		}
		this.numSoc = numSoc;
		this.dateNaissance = dateNaissance ;
		this.comments = comments;
		this.adresse = adresse;
	}

	// getters et setters
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


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
	 * @return the sexe
	 */
	public char getSexe() {
		return sexe;
	}


	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}


	/**
	 * @return the numSoc
	 */
	public long getNumSoc() {
		return numSoc;
	}


	/**
	 * @param numSoc the numSoc to set
	 */
	public void setNumSoc(long numSoc) {
		this.numSoc = numSoc;
	}


	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}


	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}


	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	// méthodes

	public void afficher() {
		
		super.afficher();
//		System.out.println(this.nom.toUpperCase() + " " +this.prenom);	
//		System.out.println("Téléphone : "+this.telephone);
		if(this.sexe == 'F') {
			System.out.println("Sexe : Féminin");
		}else {
			System.out.println("Sexe : Masculin");
		}
		System.out.println("Numéro de Sécurité sociale : "+this.numSoc);
		System.out.println("Date de naissance : "+this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		if(this.comments == null) {
			System.out.println("Commentaires : "+"[aucun commentaire]");
		}else {
			System.out.println("Commentaires : "+this.comments);
		}
		System.out.print("Adresse : ");
		this.adresse.afficher();


		// version 2:	
		//		System.out.printf("%s %s%nTéléphone : %s%nSexe : %s%n" +
		//				"Numéro de Sécurité sociale : %d%nDate de naissance : %s%nCommentaires : %s%n",
		//				this.nom, this.prenom, this.telephone,
		//				this.sexe == 'F' ? "Féminin" : "Masculin", this.numSoc,
		//				this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
		//				this.comments != null ? this.comments : "[aucun commentaire]");
	}
}
