package exo3;

import java.util.ArrayList;

public class ConstructeurStudio implements ConstructeurHabitation {

	@Override
	public Habitation construire(ArrayList<String> proprietaires, Habitation.Ville ville) {
		return new Habitation(proprietaires, 2, 1, ville);
	}

}
