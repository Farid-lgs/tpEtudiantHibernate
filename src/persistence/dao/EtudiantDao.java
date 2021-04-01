package persistence.dao;

import java.util.List;

import persistence.entites.Etudiant;

public interface EtudiantDao {
	
	void add(Etudiant etudiant);
	Etudiant findByNum(int numEtudiant);
	public List<Etudiant> findAll();
}