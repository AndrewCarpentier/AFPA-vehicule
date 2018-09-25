package fr.andrew.vehicule;

public class Vehicule {

	protected String marque;
	protected int vitesse;
	protected int puissance;
	protected double prix;
	protected double kilometrage;
	
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehicule(String marque, int vitesse, int puissance, double prix, double kilometrage) {
		this.marque = marque;
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

	//Getter & Setter
	protected String getMarque() {
		return marque;
	}

	protected void setMarque(String marque) {
		this.marque = marque;
	}

	protected int getVitesse() {
		return vitesse;
	}

	protected void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	protected int getPuissance() {
		return puissance;
	}

	protected void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	protected double getPrix() {
		return prix;
	}

	protected void setPrix(double prix) {
		this.prix = prix;
	}

	protected double getKilometrage() {
		return kilometrage;
	}

	protected void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}
	
}
