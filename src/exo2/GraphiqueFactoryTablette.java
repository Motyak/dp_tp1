package exo2;

public class GraphiqueFactoryTablette implements GraphiqueFactory {

	static private GraphiqueFactoryTablette instance = null;
	
	private GraphiqueFactoryTablette() {
		super();
	}
	
	public final static GraphiqueFactoryTablette getInstance() {
		if(GraphiqueFactoryTablette.instance == null)
			GraphiqueFactoryTablette.instance = new GraphiqueFactoryTablette();
		
		return GraphiqueFactoryTablette.instance;
	}
	
	@Override
	public ZoneDeTexte creerZoneDeTexte() {
		return new ZoneDeTexteTablette();
	}

	@Override
	public Bouton creerBouton() {
		return new BoutonTablette();
	}

	@Override
	public ListeDeChoix creerListeDeChoix() {
		return new ListeDeChoixTablette();
	}

}
