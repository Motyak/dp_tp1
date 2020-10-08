package exo4;

public class EmployeClassique extends Employe {
	public int nbHeuresTravailHebdo;
	public double tauxHoraire;
	
//	je simplifie au max les infos en param
	public EmployeClassique(String prenom, Service service, double tauxHoraire) {
		this.prenom = prenom;
		this.service = service;
		this.tauxHoraire = tauxHoraire;
	}
	
	@Override
	public double getSalaireMensuel() {
//		je suppose 35h par semaine et 4 semaines par mois
		return this.tauxHoraire * 35 * 4;
	}
}
