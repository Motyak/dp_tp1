package exo2;

public class GraphiqueFactoryOrdi implements GraphiqueFactory {

	static private GraphiqueFactoryOrdi instance = null;
	
	private GraphiqueFactoryOrdi() {
		super();
	}
	
	public final static GraphiqueFactoryOrdi getInstance() {
		if(GraphiqueFactoryOrdi.instance == null)
			GraphiqueFactoryOrdi.instance = new GraphiqueFactoryOrdi();
		
		return GraphiqueFactoryOrdi.instance;
	}
	
	@Override
	public ZoneDeTexte creerZoneDeTexte() {
		return new ZoneDeTexteOrdi();
	}

	@Override
	public Bouton creerBouton() {
		return new BoutonOrdi();
	}

	@Override
	public ListeDeChoix creerListeDeChoix() {
		return new ListeDeChoixOrdi();
	}

}
