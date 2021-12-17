package fr.eni.ecole.QuelMedecin;

public class Adresse {
	// attributs d'instance
	private String mentions; // peut être null
	private int numero;
	private String complNumero;
	private String voie;
	private int codePostale; // 55555
	private String ville; // uppercase
	// attributs de la classe

	//constructeur public  parametré I
	public Adresse(int numero,  String complNumero, String voie, int codePostale, String ville) {
		this.mentions = null;
		this.numero = numero;
		this.complNumero = complNumero;
		this.voie = voie;
		this.codePostale = codePostale;
		this.ville = ville.toUpperCase();
	}
	// constructeur public parametré  II
	public Adresse(String mentions,int numero,  String complNumero, String voie, int codePostale, String ville) {
		super();
		this.mentions = mentions;
		this.numero = numero;
		this.complNumero = complNumero;
		this.voie = voie;
		this.codePostale = codePostale;
		this.ville = ville.toUpperCase();
	}
	// getters et setters
	/**
	 * @return the mentions
	 */
	public String getMentions() {
		return mentions;
	}
	/**
	 * @param mentions the mentions to set
	 */
	public void setMentions(String mentions) {
		this.mentions = mentions;
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the complNumero
	 */
	public String getComplNumero() {
		return complNumero;
	}
	/**
	 * @param complNumero the complNumero to set
	 */
	public void setComplNumero(String complNumero) {
		this.complNumero = complNumero;
	}
	/**
	 * @return the voie
	 */
	public String getVoie() {
		return voie;
	}
	/**
	 * @param voie the voie to set
	 */
	public void setVoie(String voie) {
		this.voie = voie;
	}
	/**
	 * @return the codePostale
	 */
	public int getCodePostale() {
		return codePostale;
	}
	/**
	 * @param codePostale the codePostale to set
	 */
	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	// méthodes d'action

	public void afficher() {
		if(this.getMentions()!=null){
			System.out.println(this.mentions);}

		System.out.print(this.getNumero());
		if(this.complNumero!=null){
			System.out.print(this.complNumero);
		}
		System.out.print(" "+this.voie);
		System.out.println();
		String formattedCP = String.format("%05d", this.codePostale);
		System.out.println(formattedCP+ " "+this.ville);

		// version 2:	
		//		if (this.mentions != null)
		//			System.out.println(mentions);
		//			System.out.printf("%d%s %s%n%05d %s%n", this.numero,
		//			this.complNumero != null ? this.complNumero : "", this.rue, this.cp, this.ville);


	}

}
