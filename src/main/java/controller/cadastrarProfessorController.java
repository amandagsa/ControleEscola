package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entity.Professor;

/**
 * Servlet implementation class cadastrarProfessorController
 */
@WebServlet("/cadastrarProfessorController")
public class cadastrarProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public cadastrarProfessorController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/hmtl; charset-UTF-8");

		String nomeProfessor = request.getParameter("nomeProfessor");
		Professor professor = new Professor(nomeProfessor);

		if (professor.incluirProfessor()) {
			response.sendRedirect("cadastraProfessor.jsp?pmensagem=Professor cadastrado com sucesso!");
		} else {
			response.sendRedirect("cadastraProfessor.jsp?pmensagem=Problemas ao cadastrar professor!");
		}
	}
}
