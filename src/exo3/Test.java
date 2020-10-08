package exo3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
//		Je definis le builder en fonction du type d'habitation à construire
		ConstructeurHabitation ctr = new ConstructeurStudio();
		
//		Je construis l'habitation en y spécifiant les proprietaires et la ville (param spécifiques)
		ArrayList<String> proprietaires = new ArrayList<String>();
		proprietaires.add("Tommy");
		Habitation habitation = ctr.construire(proprietaires, new Habitation.Ville("Monaco", 98000));
		
//		Description de l'habitation
		System.out.println(habitation);
	}

}
