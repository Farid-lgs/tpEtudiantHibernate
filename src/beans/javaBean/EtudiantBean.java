package beans.javaBean;

import persistence.dao.EtudiantDaoImpl;
import persistence.entites.Etudiant;

public class EtudiantBean {
	
	private int numEtudiant;
	private String nom;
	private String prenom;
	private double moyenne;
	EtudiantDaoImpl etudiantdao= new EtudiantDaoImpl();
	Etudiant  etudiant =new Etudiant();
	
	public boolean aReussi() {
		if(getMoyenne()>10)
			return true;
		else
			return false;
	}

	public int getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(int numEtudiant) {
		this.numEtudiant = numEtudiant;
		etudiant = etudiantdao.findByNum(numEtudiant);
		this.nom= etudiant.getNom();
		this.prenom= etudiant.getPrenom();
		this.moyenne= etudiant.getMoyenne();
	}

	public String getNom() {
		return etudiant.getNom();
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return etudiant.getPrenom();
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getMoyenne() {
		return etudiant.getMoyenne();
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	
}
