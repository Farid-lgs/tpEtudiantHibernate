package persistence.dao;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.entites.Etudiant;


public class EtudiantDaoImpl implements EtudiantDao {

	@Override
	public Etudiant findByNum(int numEtudiant) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Etudiant et = s.get(Etudiant.class, numEtudiant);
		s.close();
		return et;
	}

	@Override
	public void add(Etudiant etudiant) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(etudiant);
		tx.commit();
		session.close();
	}
	
	@Override
	public List<Etudiant> findAll() {
		List<Etudiant> listeEtudiant = new ArrayList<Etudiant>();
		Session s = HibernateUtil.getSessionFactory().openSession();
		listeEtudiant = s.createQuery("from Etudiant").list();
		s.close();
		return listeEtudiant;
	}
	
}
