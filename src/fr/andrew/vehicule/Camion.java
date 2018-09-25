package fr.andrew.vehicule;

public class Camion extends Vehicule{
	
	private int capacite;

	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camion(String marque, String couleur, int vitesse, int puissance, double prix, double kilometrage, int capacite) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
		this.capacite = capacite;
	}



	//Getter & Setter
	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}



	
}
