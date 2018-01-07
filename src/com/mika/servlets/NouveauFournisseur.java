package com.mika.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mika.beans.Fournisseur;
import com.mika.forms.FournisseurForm;

/**
 * Servlet implementation class NouveauFournisseur
 */
public class NouveauFournisseur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/nouveauFournisseur.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NouveauFournisseur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FournisseurForm form = new FournisseurForm();
		Fournisseur fournisseur = form.inscrireFournisseur(request);
		
		request.setAttribute("fournisseur", fournisseur);
		
		this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	
	}

}
