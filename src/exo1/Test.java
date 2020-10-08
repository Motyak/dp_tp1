package exo1;

public class Test {
	public static void main(String[] args) {
		Application app = new Application();
		
		for(VehiculeAutonome v : app.vehicules) {
//			on presente le vehicule
			System.out.println("Vehicule " + v + " : ");
			
//			on demarre le vehicule
			v.demarrer();
			
//			on le fait rouler
			v.rouler();
			
//			puis on l'arrete
			v.arreter();
			
			System.out.println();
		}
	}
}
