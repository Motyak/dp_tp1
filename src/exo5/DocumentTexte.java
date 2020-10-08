package exo5;

public class DocumentTexte implements Document {

	private String contenuAuFormatTexte;
	
	public DocumentTexte(String contenu) {
		this.contenuAuFormatTexte = contenu;
	}
	
	@Override
	public void afficheDocument() {
		System.out.println(this.contenuAuFormatTexte);
	}

}
