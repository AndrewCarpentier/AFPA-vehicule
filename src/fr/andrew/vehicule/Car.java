package fr.andrew.vehicule;

public class Car extends Vehicule {
	
	private int nombreDePlaces;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Car(String marque, String couleur, int vitesse, int puissance, double prix, double kilometrage, int nombreDePlaces) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
		this.nombreDePlaces = nombreDePlaces;
	}
	

	//Getter & Setter
	public int getNombreDePlaces() {
		return nombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}



	
}
