package fr.eni.ecole.QuelMedecin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RendezVous {
	private Creneau creneau;
	private Patient patient;
	private LocalDate date;

	public RendezVous(Creneau creneau, Patient patient,  LocalDate date){
		this.creneau = creneau;
		this.patient = patient;
		this.date = date;
	}

	public void afficher() {
		System.out.print("Rendez-vous du "+ this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))+ " ");
		this.creneau.afficher();
		System.out.println("Avec le Dr "+this.creneau.getMedecin().getNom().toUpperCase());
		//System.out.print("Pour "+this.patient.getNom().toUpperCase() + " "+ this.patient.getPrenom());
		System.out.print("Pour ");
		this.patient.afficher();

		// version 2 
		//	System.out.printf("Rendez-vous du %s ",
		//			this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		//			this.creneau.afficher();
		//			System.out.printf("avec le Dr %s%npour ",
		//			this.creneau.getMedecin().getNom());
		//			this.patient.afficher();

	}


}
