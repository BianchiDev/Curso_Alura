package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//o1
@WebServlet(urlPatterns = "/oi")
public class OiMundoSevlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws IOException{
		
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo você escreveu o primeiro servlets.");
		out.println("<body>");
		out.println("<html>");
		
		System.out.println("O sevlet oiMundoSevlet foi chamado");
	}

}
