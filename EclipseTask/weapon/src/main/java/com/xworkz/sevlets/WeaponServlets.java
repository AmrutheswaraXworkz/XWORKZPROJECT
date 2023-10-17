package com.xworkz.sevlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/save",loadOnStartup = 2)
public class WeaponServlets extends HttpServlet {
	public WeaponServlets() {
		System.out.println("running WeaponServlets");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String made=req.getParameter("madeBy");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		int cost=Integer.parseInt(price);
		
		System.out.println("Name of the gun is:"+name);
		System.out.println("Made By:"+made);
		System.out.println("Price of the gun is:"+cost);
		System.out.println("Type of the gun is:"+type);
		
		
		res.setContentType("text/html");
		PrintWriter print=res.getWriter();
		print.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Xworkz</title>\r\n"
				+ "<link\r\n"
				+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n"
				+ "	rel=\"stylesheet\"\r\n"
				+ "	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n"
				+ "	crossorigin=\"anonymous\">\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n"
				+ "	<div class=\"container-fluid\">\r\n"
				+ "		<a class=\"navbar-brand\" href=\"#\">Weapon Information</a>\r\n"
				+ "		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n"
				+ "			data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\"\r\n"
				+ "			aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "			<span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "		</button>\r\n"
				+ "		<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
				+ "			<ul class=\"navbar-nav\">\r\n"
				+ "				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
				+ "					aria-current=\"page\" href=\"index.html\">Home</a></li>\r\n"
				+ "				<li class=\"nav-item\"><a class=\"nav-link active aria-current=\"page\"\" href=\"weapon.html\">Weapon</a>\r\n"
				+ "				</li>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "			</ul>\r\n"
				+ "		</div>\r\n"
				+ "	</div>\r\n"
				+ "</nav>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n");
				print.println("<br>Name:"+name);
				print.println("<br>Made By:"+made);
				print.println("<br>Price:"+cost);
				print.println("<br>Type of the gun:"+type);
				print.println("<br> <span style='color:green;'>Is succesfully Saved!!!!!</span>");
				
				print.println(
			      "	<script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "		integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}
}
