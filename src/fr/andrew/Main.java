package fr.andrew;

import fr.andrew.vehicule.Voiture;

public class Main {

	public static void main(String[] args) {

		Voiture C3 = new Voiture();
		C3.setMarque("citroen");
		C3.setCouleur("rouge");
		C3.setVitesse(230);
		C3.setPuissance(6);
		C3.setPrix(15000);
		C3.setKilometrage(0);
		C3.setNombreDePorte(5);
		
		System.out.println("La voiture est une " +C3.getMarque()+ " C3 \rde couleur " +C3.getCouleur()+ " \ravec " +C3.getNombreDePorte()+ " portes, \relle à une vitesse maximal de " +C3.getVitesse()+ " "
				+ "Km/h et \rune puissance de " +C3.getPuissance()+ ". \rElle à un kilometrage de " +C3.getKilometrage()+ " Km et \relle est vendu à un prix de " +C3.getPrix()+ "€.");
				
		System.out.println("\r----ACTION VOITURE C3----\r");
		C3.demarrer();
		C3.accelerer();
		C3.rouler();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Je roule depuis 1h j'ai besoin d'une pause");
		C3.freiner();
		C3.arreter();
	}
}
