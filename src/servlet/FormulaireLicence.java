package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LicenceDao;
import model.Licence;

/**
 * Servlet implementation class FormulaireLicence
 */
@WebServlet("/FormulaireLicence")
public class FormulaireLicence extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormulaireLicence() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Licence lic = new Licence();
		LicenceDao dao = new LicenceDao();
		
		lic.setCategorie(request.getParameter("categorie"));
		lic.setDescription(request.getParameter("description"));
		lic.setCompatibilite(request.getParameter("compatibilite"));
		lic.setDroits(request.getParameter("droits"));
		lic.setNom(request.getParameter("nom"));
		lic.setType(request.getParameter("type"));
		
		dao.addLicence(lic);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formulaireLicence.jsp");
		rd.forward(request, response);
	}

}
