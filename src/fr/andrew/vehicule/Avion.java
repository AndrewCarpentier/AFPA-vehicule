package fr.andrew.vehicule;

public class Avion extends Vehicule implements appareilVolant{

	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avion(String marque, String couleur, int vitesse, int puissance, double prix, double kilometrage) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void voler() {
		// TODO Auto-generated method stub
		System.out.println("L'avion vole");
	}

	@Override
	public void decoler() {
		// TODO Auto-generated method stub
		System.out.println("L'avion décolle");
	}

	@Override
	public void atterir() {
		// TODO Auto-generated method stub
		System.out.println("L'avion atteri");
	}

	
}
