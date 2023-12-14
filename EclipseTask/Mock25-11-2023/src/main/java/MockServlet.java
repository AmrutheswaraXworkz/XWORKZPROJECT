import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mock", loadOnStartup = 3)
public class MockServlet extends HttpServlet {
	
	public MockServlet() {
		System.out.println("running MockServlets!!!!");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String slNo=req.getParameter("slNo");
		String fName=req.getParameter("fName");
		String mName=req.getParameter("mName");
		String lName=req.getParameter("lName");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String mobile=req.getParameter("mobile");
		String area=req.getParameter("area");
		String district=req.getParameter("dist");
		String state=req.getParameter("state");
		String pin=req.getParameter("pin");
		
		MockDTO dto=new MockDTO(slNo, fName, lName, mName, email, gender, mobile, area, district, state, pin);
		req.setAttribute("dto", dto);
		RequestDispatcher out=req.getRequestDispatcher("MockSuccess.jsp");
		out.forward(req, resp);
		
	}

	
}
