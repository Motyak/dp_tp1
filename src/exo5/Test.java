package exo5;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
//		on créé une liste de document de types différents
		ArrayList<Document> docs = new ArrayList<Document>();
		docs.add(new DocumentTexte("contenu au format texte"));
		docs.add(new DocumentHtml("contenu au format html"));
		
//		on ajoute le composant pdf en l'injectant dans l'adapter
		ComposantPdf pdf = new ComposantPdf("nom doc pdf", "version doc pdf");
		docs.add(new ComposantPdfAdapter(pdf));
		
//		on affiche les documents
		for(Document d : docs) {
			System.out.println("Affichage du document " + d + " : ");
			d.afficheDocument();
			System.out.println();
		}
	}

}
