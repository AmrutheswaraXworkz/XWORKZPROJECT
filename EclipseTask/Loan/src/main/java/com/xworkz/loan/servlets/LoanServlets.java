package com.xworkz.loan.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/apply", loadOnStartup = 2)
public class LoanServlets extends HttpServlet {
	public LoanServlets() {
		System.out.println("running LoanServlets");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String amount=req.getParameter("amount");
		String work=req.getParameter("work");
		String intrest=req.getParameter("intrest");
		String surety=req.getParameter("surety");
		String company=req.getParameter("company");
		String tenure=req.getParameter("tenure");
		String type=req.getParameter("type");
		String yes=req.getParameter("yes");
		
		
		
		req.setAttribute("name", name);
		req.setAttribute("amount",amount);
		req.setAttribute("work",work);
		req.setAttribute("intrest",intrest);
		req.setAttribute("surety",surety);
		req.setAttribute("company",company);
		req.setAttribute("tenure",tenure);
		req.setAttribute("type",type);
		req.setAttribute("yes", yes);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("LoanSuccess.jsp");
		dispatcher.forward(req, resp);
		
		
	}

}
