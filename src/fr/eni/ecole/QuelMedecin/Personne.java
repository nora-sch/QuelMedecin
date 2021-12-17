package fr.eni.ecole.QuelMedecin;

public class Personne {
	// attributs d'instance
		protected String nom;
		protected String prenom;
		protected String telephone;
		protected Adresse adresse;
		// constructeur parametré
		public Personne(String nom, String prenom, String telephone, Adresse adresse) {
			this.nom = nom.toUpperCase();
			this.prenom = prenom;
			this.telephone = telephone;
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
		 * @return the adresse
		 */
		public Adresse getAdresse() {
			return adresse;
		}

		/**
		 * @param adresse the adresse to set
		 */
		public void setAdresse(Adresse adresse) {
			this.adresse = adresse;
		}
	// méthodes
		/**
		* Affiche les informations sur la personne sous la forme :
		* NOM Prénom
		* Téléphone : XXXXXXXXXX
		*/
		public void afficher() {
		System.out.printf("%s %s%nTéléphone : %s%n", this.nom,
		this.prenom, this.telephone);
		}


}
