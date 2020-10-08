package exo4;

public abstract class Employe {
	public String nom;
	public String prenom;
	public String adresse;
	public Service service;
	
	abstract public double getSalaireMensuel();
	
	public static enum Service {
		DRH,
		COMPTABILITE,
		INFORMATIQUE
	}
}
