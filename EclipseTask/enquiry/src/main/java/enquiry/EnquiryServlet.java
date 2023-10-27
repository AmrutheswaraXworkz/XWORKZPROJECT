package enquiry;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/enq",loadOnStartup = 2)
public class EnquiryServlet extends HttpServlet{
	
	public EnquiryServlet() {
		System.out.println("running EnquiryServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String number=req.getParameter("number");
		String email=req.getParameter("email");
		String dob=req.getParameter("date");
		String location=req.getParameter("location");
		System.out.println(name);
		
		
		EnquirtDto dto=new EnquirtDto(name, number, email, dob, location);
		
		req.setAttribute("dto", dto);
		RequestDispatcher out=req.getRequestDispatcher("EnqSuccess.jsp");
		out.forward(req, resp);
	}

}
