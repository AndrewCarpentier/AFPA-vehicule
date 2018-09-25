package fr.andrew.vehicule;

public class Bateau extends Vehicule implements appareilFlottantSurEau{

	public Bateau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bateau(String marque, String couleur, int vitesse, int puissance, double prix, double kilometrage) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void flotter() {
		// TODO Auto-generated method stub
		System.out.println("Le bateau flotte sur l'eau");
	}

	@Override
	public void quitterLePort() {
		// TODO Auto-generated method stub
		System.out.println("Le bateau quitte le port");
	}

	@Override
	public void arriverAuPort() {
		// TODO Auto-generated method stub
		System.out.println("Le bateau arrive au port");
	}

	
}
