package com.xworkz.login.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/login" , loadOnStartup = 2)
public class LoginServlets extends HttpServlet {
	
	
	public LoginServlets() {
		System.out.println("running LoginServlets");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getParameter("user");
		String password=req.getParameter("password");	
	
		
		
		if(user.equals("admin") && password.equals("secret")) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.forward(req, resp);
			req.setAttribute("user", user);
			
		}
		else {
			req.setAttribute("error", "Credential not matching");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
			dispatcher.forward(req, resp);
		}
		

		
		
		
	
	
	
	}
	
	
	
	

}
