package exo4;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

//	Dans les classes de cet exercice en particulier j'ai mis la portée des attributs à 'public'
//	pour éviter de devoir coder les accesseurs/mutateurs.
	public static void main(String[] args) {
//		on créé les employés
		ArrayList<Employe> employes = new ArrayList<Employe>();
		employes.add(new EmployeClassique("Michel1", Employe.Service.INFORMATIQUE, 50.0));
		employes.add(new EmployeClassique("Michel2", Employe.Service.INFORMATIQUE, 51.0));
		employes.add(new Manager("Michel1", Employe.Service.INFORMATIQUE, 99999.9, new ArrayList<Employe>(employes)));
		
//		On les ajoute à une entreprise
		Entreprise entreprise = new Entreprise(employes);
		
//		description des employes
		entreprise.afficherEmployes();
	}

}
