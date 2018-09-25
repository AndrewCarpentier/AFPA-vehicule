package fr.andrew.vehicule;

public class Voiture extends Vehicule {

	private int nombreDePorte;
	
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(String marque, String couleur, int vitesse, int puissance, double prix, double kilometrage, int nombreDePorte) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
		this.nombreDePorte = nombreDePorte;
	}



	//Getter & Setter
	public int getNombreDePorte() {
		return nombreDePorte;
	}

	public void setNombreDePorte(int nombreDePorte) {
		this.nombreDePorte = nombreDePorte;
	}


	
}
