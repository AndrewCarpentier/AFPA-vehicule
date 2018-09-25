package fr.andrew.vehicule;

public class Vehicule {

	protected String marque;
	protected String couleur;
	protected int vitesse;
	protected int puissance;
	protected double prix;
	protected double kilometrage;
	
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Vehicule(String marque, String couleur, int vitesse, int puissance, double prix, double kilometrage) {
		this.marque = marque;
		this.couleur = couleur;
		this.vitesse = vitesse;
		this.puissance = puissance;
		this.prix = prix;
		this.kilometrage = kilometrage;
	}

	//methode	
	public void demarrer() {
		System.out.println("Le vehicule à demarrer");
	}
	
	public void accelerer() {
		System.out.println("Le vehicule accelere");
	}
	
	public void freiner() {
		System.out.println("Le vehicule à freiner");
	}
	
	public void rouler() {
		System.out.println("Le vehicule roule");
	}
	
	public void arreter() {
		System.out.println("Le vehicule est à l'arret");
	}

	//Getter & Setter
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public double getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
