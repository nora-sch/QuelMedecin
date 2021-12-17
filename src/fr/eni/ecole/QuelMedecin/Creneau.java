package fr.eni.ecole.QuelMedecin;

import java.time.LocalTime;

public class Creneau {
	// attributs d'instance
	private MedecinGeneraliste medecin;
	private LocalTime debut;
	private  int duree;
	// attributs de la classe
	public Creneau(LocalTime debut, int duree, MedecinGeneraliste medecin) {
		this.medecin = medecin;
		this.debut = debut;
		this.duree = duree;
		medecin.ajouterCreneau(this);


	}
	/**
	 * @return the medecin
	 */
	public MedecinGeneraliste getMedecin() {
		return medecin;
	}
	/**
	 * @param medecin the medecin to set
	 */
	public void setMedecin(MedecinGeneraliste medecin) {
		this.medecin = medecin;
	}
	/**
	 * @return the debut
	 */
	public LocalTime getDebut() {
		return debut;
	}
	/**
	 * @param debut the debut to set
	 */
	public void setDebut(LocalTime debut) {
		this.debut = debut;
	}
	/**
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}
	/**
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public void afficher() {
		System.out.println(this.debut + " - "+this.debut.plusMinutes(this.duree)+ " ("+this.duree+" minutes)");
	}

}
