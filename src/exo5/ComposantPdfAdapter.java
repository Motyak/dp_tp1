package exo5;

public class ComposantPdfAdapter implements Document {

	private ComposantPdf pdf;
	
	public ComposantPdfAdapter(ComposantPdf pdf) {
		this.pdf = pdf;
	}
	
	@Override
	public void afficheDocument() {
		this.pdf.afficheNom();
		this.pdf.afficheVersion();
	}
	
}
