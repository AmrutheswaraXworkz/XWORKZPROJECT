package com.xworkz;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/contact",loadOnStartup = 2)
public class ContactServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String number=req.getParameter("number");
		String comment=req.getParameter("message");
		
		ContactDTO dto=new ContactDTO(name, email, number, comment);
		req.setAttribute("dto", dto);
		RequestDispatcher out=req.getRequestDispatcher("ContactSuccess.jsp");
		out.forward(req, resp);
	}

}
