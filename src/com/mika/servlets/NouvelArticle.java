package com.mika.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mika.beans.Article;
import com.mika.forms.NouvelArticleForm;

/**
 * Servlet implementation class NouvelArticle
 */

public class NouvelArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/nouvelArticle.jsp";
	public static final String ATT_FICHIER = "article";
	public static final String ATT_FORM = "form";
	public static final String CHEMIN = "chemin";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NouvelArticle() {
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
	    /* Pr�paration de l'objet formulaire */
        NouvelArticleForm form = new NouvelArticleForm();

        /* Traitement de la requ�te et r�cup�ration du bean en r�sultant */
        Article article = form.ajouterArticle(request);

        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_FICHIER, article );
	    
	    this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}
	
}
