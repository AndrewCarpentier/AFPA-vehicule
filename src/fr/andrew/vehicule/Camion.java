package fr.andrew.vehicule;

public class Camion extends Vehicule{
	
	protected int capacite;

	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camion(String marque, int vitesse, int puissance, double prix, double kilometrage) {
		super(marque, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
	}
	
	//Getter & Setter
	protected int getCapacite() {
		return capacite;
	}

	protected void setCapacite(int capacite) {
		this.capacite = capacite;
	}



	
}
