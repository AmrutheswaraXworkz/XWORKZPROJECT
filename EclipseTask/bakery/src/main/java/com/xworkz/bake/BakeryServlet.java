package com.xworkz.bake;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/bake", loadOnStartup = 2)
public class BakeryServlet extends HttpServlet {

	public BakeryServlet() {
		System.out.println("running BakeryServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String price1 = req.getParameter("price");
		int price = Integer.parseInt(price1);
		String quantity1 = req.getParameter("quantity");
		int quantity = Integer.parseInt(quantity1);
		String discount1 = req.getParameter("discount");
		float discount =Float.parseFloat(discount1);
		String gst = req.getParameter("gst");
		String mDate = req.getParameter("manfDate");
		String eDate = req.getParameter("expDate");
		
		
		
		
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		
		req.setAttribute("date", date);
		req.setAttribute("time", time);
		float total1 = price * quantity;
		
		
		float total = total1 -(total1*discount/100);
		
		req.setAttribute("total", total);

		BakeryDto bakeryDto = new BakeryDto(name, price1, quantity1, discount1, gst, mDate, eDate);
		req.setAttribute("dto", bakeryDto);
		
		RequestDispatcher out=req.getRequestDispatcher("BakerySuccess.jsp");
		out.forward(req, resp);

	}

}
