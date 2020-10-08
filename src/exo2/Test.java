package exo2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {	
//		construction de la bonne factory selon la plateforme ciblee (ici ordi)
		GraphiqueFactory factory = GraphiqueFactoryOrdi.getInstance();
		
//		construction du formulaire
		ArrayList<ElementGraphique> elements = new ArrayList<ElementGraphique>();
		elements.add(factory.creerZoneDeTexte());
		elements.add(factory.creerBouton());
		
		Formulaire formulaire = new Formulaire(elements);
		
//		affichage du formulaire
		formulaire.afficher();
	}

}
