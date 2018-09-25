package fr.andrew;

import fr.andrew.vehicule.Camion;
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
		
		System.out.println("La voiture est une " +C3.getMarque()+ " C3 \rde couleur " +C3.getCouleur()+ " \ravec " +C3.getNombreDePorte()+ " portes, \relle a une vitesse maximal de " +C3.getVitesse()+ " "
				+ "Km/h et \rune puissance de " +C3.getPuissance()+ "chevaux. \rElle à un kilometrage de " +C3.getKilometrage()+ " Km et \relle est vendu à un prix de " +C3.getPrix()+ "€.");
				
		System.out.println("\r----ACTION VOITURE C3----\r");
		C3.demarrer();
		C3.accelerer();
		C3.rouler();
/*		
*		try {									//permet d'arreter le programme pendant une courte duree
*			Thread.sleep(5000);
*		} catch (InterruptedException e) {			
*			// TODO Auto-generated catch block
*			e.printStackTrace();
*		}
*/		
		System.out.println("Je roule depuis 1h j'ai besoin d'une pause");
		C3.freiner();
		C3.arreter();		
		System.out.println("La C3 à " +C3.getNombreDePorte()+ " portes");
		
		
		System.out.println("\r----CAMION----\r");
		Camion fh16 = new Camion();
		Camion actros = null;
		fh16.setMarque("volvo");
		fh16.setCouleur("vert");
		fh16.setVitesse(180);
		fh16.setPuissance(24);
		fh16.setPrix(100000);
		fh16.setKilometrage(5000);
		fh16.setCapacite(26);
		
		System.out.println("Le camion fh16 est de marque" +fh16.getMarque());
		System.out.println("Il est de couleur " +fh16.getCouleur());
		System.out.println("Il a une vitesse maximal de " +fh16.getVitesse()+ "Km/h");
		System.out.println("Il a une puissance de " +fh16.getPuissance()+ " chevaux");
		System.out.println("Il coute la maudite somme de " +fh16.getPrix()+ "€" );
		System.out.println("Il a un kilometrage de " +fh16.getKilometrage()+ "Km");
		System.out.println("Et il a une capacite de " +fh16.getCapacite()+ " tonne");
		
		System.out.println("\r----ACTION DU CAMION----\r");
		if(fh16.getCapacite()<25) {	
			actros = new Camion();
			actros.setMarque("mercedes");
			actros.setCouleur("blanc");
			actros.setVitesse(200);
			actros.setPuissance(75);
			actros.setPrix(150000);
			actros.setKilometrage(0);
			actros.setCapacite(30);
			System.out.println("Le votre camion a était changer par un camion Actros de marque " +actros.getMarque()+ " qui à une capacite de " +actros.getCapacite()+ " tonne\r");
		}
/*		
*		try {
*			System.out.println("Utilisation du camion Actros");
*			actros.demarrer();
*			actros.accelerer();
*			actros.rouler();
*		}catch (Exception e) {
*			System.out.println("Utilisation du camion FH16");
*			fh16.demarrer();
*			fh16.accelerer();
*			fh16.rouler();
*		} 
*/
		if(actros == null) {
			System.out.println("Utilisation du camion FH16");
			fh16.demarrer();
			fh16.accelerer();
			fh16.rouler();
		}else {
			System.out.println("Utilisation du camion Actros");
			actros.demarrer();
			actros.accelerer();
			actros.rouler();
		}
/*		
*		if(fh16.getCapacite()<25) {
*			System.out.println("Utilisation du camion Actros");
*			actros.demarrer();
*			actros.accelerer();
*			actros.rouler();
*		}else {
*			System.out.println("Utilisation du camion FH16");
*			fh16.demarrer();
*			fh16.accelerer();
*			fh16.rouler();
*		}
*/
	}		
		
}
