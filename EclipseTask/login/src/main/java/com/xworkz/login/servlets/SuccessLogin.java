package com.xworkz.login.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/loginSuccess",loadOnStartup = 2)
public class SuccessLogin extends HttpServlet{
	
	public SuccessLogin() {
		System.out.println("running SuccessLogin");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String address=req.getParameter("address");
		String number=req.getParameter("number");
		String state=req.getParameter("state");
		String city=req.getParameter("city");
		String country=req.getParameter("country");
		LoginDTO loginDTO=new LoginDTO(address, number, state, city, country);

	
//		req.setAttribute("address", address);
//		req.setAttribute("number", number);
//		req.setAttribute("state", state);
//		req.setAttribute("city", city);
//		req.setAttribute("country", country);
		
		req.setAttribute("save", loginDTO);
		RequestDispatcher dispatcher1=req.getRequestDispatcher("Success.jsp");
		dispatcher1.forward(req, resp);
	}

}
