package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.dao.EtudiantDao;
import persistence.dao.EtudiantDaoImpl;
import persistence.entites.Etudiant;

/**
 * Servlet implementation class EtudiantAjoutServlet
 */
@WebServlet("/EtudiantAjoutServlet")
public class EtudiantAjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EtudiantAjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Etudiant etudiant = new Etudiant();
		EtudiantDao etudao = new EtudiantDaoImpl();
		etudiant.setNumEtudiant(Integer.parseInt(request.getParameter("numEtudiant")));
		etudiant.setNom(request.getParameter("nom"));
		etudiant.setPrenom(request.getParameter("prenom"));
		etudiant.setMoyenne(Double.parseDouble(request.getParameter("moyenne")));
		etudao.add(etudiant);
		EtudiantListing etuserv = new EtudiantListing();
		etuserv.doGet(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
