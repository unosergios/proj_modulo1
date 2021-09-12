package br.com.alura.livraria.servlet;

import java.io.IOException;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.livraria.dao.TransacaoDao;
import br.com.alura.livraria.factory.GeraConexaoBco;
import br.com.alura.livraria.modelo.Autores;

@WebServlet("/autores")
public class AutoresServlet extends HttpServlet {

	private TransacaoDao conexaodb;

	public AutoresServlet() {

		this.conexaodb = new TransacaoDao(new GeraConexaoBco().getConexaoComBco());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setAttribute("listatopagina", conexaodb.listar());
		req.getRequestDispatcher("WEB-INF/jsp/autores.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		LocalDate data = LocalDate.parse(req.getParameter("dtnasc"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String mcurr = req.getParameter("mcurr");

		Autores a1 = new Autores(nome, email, data, mcurr);

		conexaodb.cadastrar(a1);

		resp.sendRedirect("autores");
	}

}
