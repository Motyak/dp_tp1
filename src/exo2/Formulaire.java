package exo2;

import java.util.ArrayList;

public class Formulaire {
	ArrayList<ElementGraphique> elements;
	
	Formulaire(ArrayList<ElementGraphique> elements) {
		this.elements = elements;
	}
	
	void afficher() {
		for(ElementGraphique e : this.elements)
			e.afficher();
	}
}
