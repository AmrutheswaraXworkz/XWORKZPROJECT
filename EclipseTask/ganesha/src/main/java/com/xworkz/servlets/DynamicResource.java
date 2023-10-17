package com.xworkz.servlets;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello", loadOnStartup = 1)
public class DynamicResource extends HttpServlet {

	public DynamicResource() {
		System.out.println("running DynamicResource......");
	}
		
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Service method in DynamicResource");
		String name=req.getParameter("name"); 	
		String color=req.getParameter("color");
		String size=req.getParameter("size");
		String idealFor=req.getParameter("idealFor");
		String price=req.getParameter("price");
		String quantity=req.getParameter("quantity");
		System.out.println("name is:"+name);
		System.out.println("color is:"+color);
		System.out.println("size is:"+size);
		System.out.println("Ideal for:"+idealFor);
		System.out.println("price is:"+price);
		System.out.println("quantity is:"+quantity);
	}

}
