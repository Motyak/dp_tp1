package exo1;

import java.util.ArrayList;

public class Application {
	ArrayList<VehiculeAutonome> vehicules;
	
	Application() {
		this.vehicules = new ArrayList<VehiculeAutonome>();
		this.vehicules.add(new Quad());
		this.vehicules.add(new Moto());
		this.vehicules.add(new Voiture());
	}
}
