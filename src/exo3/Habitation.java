package exo3;

import java.util.ArrayList;

public class Habitation {
	private ArrayList<String> proprietaires;
	private int nbDePieces;
	private int nbDeFenetres;
	private Ville ville;
	
	public Habitation(ArrayList<String> proprietaires, int nbDePieces, int nbDeFentres, Ville ville) {
		this.proprietaires = proprietaires;
		this.nbDePieces = nbDePieces;
		this.nbDeFenetres = nbDeFentres;
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		return "Proprietaires : \n" + this.proprietaires.toString() + "\n"
			+ "Nombre de pieces : " + this.nbDePieces + "\n"
			+ "Nombre de fenetres : " + this.nbDeFenetres + "\n"
			+ "Ville : " + this.ville.nom + " (" + this.ville.codePostal + ")\n";
	}
	
	public static class Ville {
		Ville(String nom, int codePostal) {
			this.nom = nom;
			this.codePostal = codePostal;
		}
		public String nom;
		public int codePostal;
	}
}
