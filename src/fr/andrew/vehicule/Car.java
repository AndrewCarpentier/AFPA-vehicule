package fr.andrew.vehicule;

public class Car extends Vehicule {
	
	protected int nombreDePlaces;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String marque, int vitesse, int puissance, double prix, double kilometrage) {
		super(marque, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
	}
	
	
	//Getter & Setter
	protected int getNombreDePlaces() {
		return nombreDePlaces;
	}

	protected void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}



	
}
