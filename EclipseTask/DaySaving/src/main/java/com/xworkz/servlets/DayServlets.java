package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/days",loadOnStartup = 2)
public class DayServlets extends HttpServlet{
	public DayServlets() {
		System.out.println("running DayServlets");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String date=req.getParameter("date");
		String month=req.getParameter("month");
		String year=req.getParameter("year");
		String day=req.getParameter("day");
		
		req.setAttribute("date", date);
		req.setAttribute("month", month);
		req.setAttribute("year", year);
		req.setAttribute("day", day);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("DayDisplay.jsp");
		dispatcher.forward(req, resp);
		
	}

}
