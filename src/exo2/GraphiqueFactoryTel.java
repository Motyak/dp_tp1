package exo2;

public class GraphiqueFactoryTel implements GraphiqueFactory {

	static private GraphiqueFactoryTel instance = null;
	
	private GraphiqueFactoryTel() {
		super();
	}
	
	public final static GraphiqueFactoryTel getInstance() {
		if(GraphiqueFactoryTel.instance == null)
			GraphiqueFactoryTel.instance = new GraphiqueFactoryTel();
		
		return GraphiqueFactoryTel.instance;
	}
	
	@Override
	public ZoneDeTexte creerZoneDeTexte() {
		return new ZoneDeTexteTel();
	}

	@Override
	public Bouton creerBouton() {
		return new BoutonTel();
	}

	@Override
	public ListeDeChoix creerListeDeChoix() {
		return new ListeDeChoixTel();
	}

}
