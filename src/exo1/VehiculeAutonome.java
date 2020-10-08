package exo1;

public abstract class VehiculeAutonome {
	void demarrer() {
		System.out.println("Le véhicule démarre.");
	}
	
	void arreter() {
		System.out.println("Le véhicule s'arrête.");
	}
	
	abstract void rouler();
}
