package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Funcionario;


public class FuncionarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FuncionarioController() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Funcionario funcionario = new Funcionario();
		
			funcionario.setNome(request.getParameter("nome"));
			funcionario.setQtdMeses(Integer.valueOf(request.getParameter("qtdMeses")));
			funcionario.setSalarioBase(Float.valueOf(request.getParameter("salarioBase")));
		//abaixo joga a msg na tela em jsp
		request.setAttribute("msg", funcionario.toString());
		request.setAttribute("nomeObject", funcionario.getNome());
		request.setAttribute("salarioObject", funcionario.getSalarioBase());
		
//		PrintWriter out = response.getWriter();	
//		out.println(funcionario.toString());
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("cadastro.html").forward(request, response);
		
	}

}
