package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send", loadOnStartup = 2)
public class SalesServlets extends HttpServlet {
	public SalesServlets() {
		System.out.println("running SalesServlets");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String type=req.getParameter("type");
		String price1=req.getParameter("price");
		String brand=req.getParameter("brand");
		String quantity1=req.getParameter("quantity");
		
		int price=Integer.parseInt(price1);
		int quantity=Integer.parseInt(quantity1);
		int total=price*quantity;
		
		SalesDto dto=new SalesDto(name, type, price1, brand, quantity1);
		req.setAttribute("dto", dto);
		req.setAttribute("total", total);
		RequestDispatcher dispatcher=req.getRequestDispatcher("SalesSuccess.jsp");
		dispatcher.forward(req, resp);
		
	}

}
