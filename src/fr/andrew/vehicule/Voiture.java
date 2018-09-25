package fr.andrew.vehicule;

public class Voiture extends Vehicule {

	protected int nombreDePorte;
	
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(String marque, int vitesse, int puissance, double prix, double kilometrage) {
		super(marque, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
	}

	//Getter & Setter
	protected int getNombreDePorte() {
		return nombreDePorte;
	}

	protected void setNombreDePorte(int nombreDePorte) {
		this.nombreDePorte = nombreDePorte;
	}


	
}
