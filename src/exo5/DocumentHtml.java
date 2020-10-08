package exo5;

public class DocumentHtml implements Document {

	private String contenuAuFormatHtml;
	
	public DocumentHtml(String contenu) {
		this.contenuAuFormatHtml = contenu;
	}
	
	@Override
	public void afficheDocument() {
		System.out.println(this.contenuAuFormatHtml);
	}

}
