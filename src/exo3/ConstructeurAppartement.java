package exo3;

import java.util.ArrayList;

public class ConstructeurAppartement implements ConstructeurHabitation {

	@Override
	public Habitation construire(ArrayList<String> proprietaires, Habitation.Ville ville) {
		return new Habitation(proprietaires, 3, 2, ville);
	}

}
