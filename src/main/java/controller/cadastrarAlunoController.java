package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entity.Aluno;

/**
 * Servlet implementation class cadastrarAlunoController
 */
@WebServlet("/cadastrarAlunoController")
public class cadastrarAlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public cadastrarAlunoController() {
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

		String nomeAluno = request.getParameter("nomeAluno");
		String cpfAluno = request.getParameter("cpfAluno");
		String dataNascimento = request.getParameter("dataNascimento");
		String nomePai = request.getParameter("nomePai");
		String nomeMae = request.getParameter("nomeMae");
		String responsavel = request.getParameter("responsavel");
		String foneResponsavel = request.getParameter("foneResponsavel");

		Date dataNasc = null;
		try {
			dataNasc = new SimpleDateFormat("yyyy-MM-dd").parse(dataNascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Aluno aluno = new Aluno();
		aluno.setNomeAluno(nomeAluno);
		aluno.setCpfAluno(cpfAluno);
		aluno.setDataNascimento(dataNasc);
		aluno.setNomePai(nomePai);
		aluno.setNomeMae(nomeMae);
		aluno.setResponsavel(responsavel);
		aluno.setFoneResponsavel(foneResponsavel);

		if (aluno.incluirAluno()) {
			response.sendRedirect("cadastraAluno.jsp?pmensagem=Aluno cadastrado com sucesso!");
		} else {
			response.sendRedirect("cadastraAluno.jsp?pmensagem=Problemas ao cadastrar aluno!");
		}
	}

}
