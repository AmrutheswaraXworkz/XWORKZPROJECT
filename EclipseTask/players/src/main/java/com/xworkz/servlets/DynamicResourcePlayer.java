package com.xworkz.servlets;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/player", loadOnStartup = 1)
public class DynamicResourcePlayer extends HttpServlet {
	
	public DynamicResourcePlayer() {
		System.out.println("DynamicResourcePlayer is running");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Data Received");
		String name=req.getParameter("name");
		String sports=req.getParameter("sports");
		String place=req.getParameter("place");
		String exp=req.getParameter("exp");
		System.out.println("Name is:"+name);
		System.out.println("Sports playing:"+sports);
		System.out.println("Place:"+place);
		System.out.println("Expirience:"+exp);
		
		res.setContentType("text/plain");
		
		PrintWriter out=res.getWriter();
		out.println(name+","+sports+","+place+","+exp+": is Saved");
		
	}
	
	
	
	
	

}
