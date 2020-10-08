package exo4;

import java.util.ArrayList;

import exo4.Employe.Service;

public class Manager extends Employe {
	public ArrayList<Employe> larbins;
	public double salaireFixeMensuel;
	
//	je simplifie au max les infos en param
	public Manager(String prenom, Service service, double salaireMensuel, ArrayList<Employe> larbins) {
		this.prenom = prenom;
		this.service = service;
		this.salaireFixeMensuel = salaireMensuel;
		this.larbins = larbins;
	}
	
	@Override
	public double getSalaireMensuel() {
		return this.salaireFixeMensuel;
	}
}
