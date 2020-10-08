package exo4;

import java.util.ArrayList;

public class Entreprise {
	private ArrayList<Employe> employes;
	
	public Entreprise(ArrayList<Employe> employes) {
		 this.employes = employes;
	}
	
	public void afficherEmployes() {
		for(Employe e : this.employes) {
			System.out.println("Fiche employe " + e + " : ");
			System.out.println(e.prenom + " : " + e.getSalaireMensuel() + "€/mois");
			if(e.getClass() == Manager.class) {
				System.out.println("Ses larbins sont : ");
				System.out.println(((Manager)e).larbins);
			}
			System.out.println();
		}
	}
}
