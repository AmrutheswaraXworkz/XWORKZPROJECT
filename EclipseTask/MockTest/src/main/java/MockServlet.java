import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/mock",loadOnStartup = 2)
public class MockServlet extends HttpServlet {
	
	
	public MockServlet() {
		System.out.println("running MockServlet");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String type=req.getParameter("type");
		String price=req.getParameter("price");
		
		Integer cost=Integer.parseInt(price);
		if(type.equals("Cloth")) {
			double discount=cost-(cost*10/100);
			req.setAttribute("name", name);
			req.setAttribute("type", type);
			req.setAttribute("price",price);
			req.setAttribute("discount", discount);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("MockRes.jsp");
			dispatcher.forward(req, res);
		}
		else if(type.equals("Book")) {
			double discount=cost-(cost*15/100);
			req.setAttribute("name", name);
			req.setAttribute("type", type);
			req.setAttribute("price",price);
			req.setAttribute("discount", discount);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("MockRes.jsp");
			dispatcher.forward(req, res);
		}
		else if(type.equals("Electric")) {
			double discount=cost-(cost*7/100);
			req.setAttribute("name", name);
			req.setAttribute("type", type);
			req.setAttribute("price",price);
			req.setAttribute("discount", discount);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("MockRes.jsp");
			dispatcher.forward(req, res);
		}
		else {
			double discount=cost-(cost*5/100);
			req.setAttribute("name", name);
			req.setAttribute("type", type);
			req.setAttribute("price",price);
			req.setAttribute("discount", discount);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("MockRes.jsp");
			dispatcher.forward(req, res);
		}
		
		
		
	}

}
