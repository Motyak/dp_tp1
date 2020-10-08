package exo5;

public class ComposantPdf {
	
	private String nom;
	private String version;
	
	public ComposantPdf(String nom, String version) {
		this.nom = nom;
		this.version =  version;
	}
	
	public void afficheNom() {
		System.out.println(this.nom);
	}
	
	public void afficheVersion() {
		System.out.println(this.version);
	}
}
