package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send", loadOnStartup = 2)
public class ProductServlet extends HttpServlet {
	public ProductServlet() {
		System.out.println("running ProductServlet");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String price1 = req.getParameter("price");
		String brand = req.getParameter("brand");
		String quantity1 = req.getParameter("quantity");
		
		


		
		int quantity = Integer.parseInt(quantity1);
		

		if (price1 != null && !price1.isEmpty()) {
			int price = Integer.parseInt(price1);
			int total = price * quantity;
			if (price > 0) {

				ProductDTO productDTO = new ProductDTO(name, type, price1, brand, quantity1);
				req.setAttribute("dto", productDTO);
				req.setAttribute("total", total);
				RequestDispatcher dispatcher = req.getRequestDispatcher("ProductSuccess.jsp");
				dispatcher.forward(req, resp);
			} else {
				RequestDispatcher dispatcher = req.getRequestDispatcher("ProductUn.jsp");
				dispatcher.forward(req, resp);
			}

		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("ProductUn.jsp");
			dispatcher.forward(req, resp);
	}
	}
}
