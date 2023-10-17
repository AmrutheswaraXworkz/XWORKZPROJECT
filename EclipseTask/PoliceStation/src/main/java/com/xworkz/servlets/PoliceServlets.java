package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/save",loadOnStartup = 2)
public class PoliceServlets extends HttpServlet{
	
	public PoliceServlets(){
		System.out.println("running in PoliceServlets");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String location=req.getParameter("location");
		String inspector=req.getParameter("inspectorName");
		String siName=req.getParameter("siName");
		String headCons=req.getParameter("constableName");
		String assitantcomm=req.getParameter("assistantComm");
		String noCells=req.getParameter("noCells");
		String noCases=req.getParameter("noCases");
		String paint=req.getParameter("paint");
		
		System.out.println(name);
		System.out.println(location );
		System.out.println(inspector);
		System.out.println(siName);
		System.out.println(headCons);
		System.out.println(assitantcomm);
		System.out.println(noCells);
		System.out.println(noCases);
		System.out.println(paint);
		
		int newCells=Integer.parseInt(noCells);
		int newCases=Integer.parseInt(noCases);
		
		
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		out.println("<!DOCTYPE html>\r\n"
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
				+ "<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\r\n"
				+ "	<div class=\"container-fluid\">\r\n"
				+ "		<a class=\"navbar-brand\" href=\"#\">Police Station Information</a>\r\n"
				+ "		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n"
				+ "			data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\"\r\n"
				+ "			aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "			<span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "		</button>\r\n"
				+ "		<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
				+ "			<ul class=\"navbar-nav\">\r\n"
				+ "				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
				+ "					aria-current=\"page\" href=\"index.html\">Home</a></li>\r\n"
				+ "				<li class=\"nav-item\"><a class=\"nav-link active aria-current=\"page\" href=\"police.html\">Police Station</a>\r\n"
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
				
				
				out.println("<br>Name is:"+name);
				out.println("<br>Location :"+location);
				out.println("<br>Inspector Name:"+inspector);
				out.println("<br>SI Name:"+siName);
				out.println("<br>Head Constable Name:"+headCons);
				out.println("<br>Assitant Commissioiner Name:"+assitantcomm);
				out.println("<br>No of Cells:"+newCells);
				out.println("<br>No of cases:"+newCases);
				out.println("<br>Painted:"+paint);
				out.println("<br> Successfully Stored!!!");
				if(newCases>100) {
					out.println("<br><span style='color:red;'>Too Many Cases Pending!!!</span>");
				}
				else {
					out.println("<br><span style='color:green;'>Less Cases Pending!!!</span>");
				}
				
				if(newCells>5) {
					out.println("<br><span style='color:green;'>Big Police Station!!!</span>");
				}
				else {
					out.println("<br><span style='color:red;'>Small Police Station!!!</span>");

				}
				if(paint.equals("Yes")) {
					out.println("<br><span style='color:green;'>Police station is Clean</span>");
				}
				else {
					out.println("<br><span style='color:red;'>Police station is Dirty</span>");
				}
				out.println(
				 " <script\r\n"
				+ "		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "		integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n"
				+ "		crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

}
