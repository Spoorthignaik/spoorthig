package com.xworkz.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {

	public ContactServlet() {
		System.out.println("created default constructor..ContactServlet");
		
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init method in contact");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get method in do get");
		
		String name=req.getParameter("userName");
		String email=req.getParameter("userEmail");
		String mobileNumber=req.getParameter("mobileNumber");
		String comments=req.getParameter("comments");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobileNumber);
		System.out.println(comments);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if(name.length()>3) {
			writer.print("<span style='color:green;'>");
			writer.println("sign succesfully "+name);
		}else {
			writer.print("<span style='color:red;'>");
			writer.println("sign failed invalid comments "+name);
		}
		
		if(comments.length()>20) {
			writer.print("<span style='color:green;'>");
			writer.println("sign succesfully "+comments);
		}else {
			writer.print("<span style='color:red;'>");
			writer.println("sign failed invalid comments "+comments);
		}
		writer.print("</span>");
		writer.print("</h1>");
		
		writer.print("<h2>");
		writer.println("<pre>");
		writer.println("<a href='Contact.html'> contact sign up page");
		writer.println("</a>");
		writer.println("</pre>");
		
		writer.print("</h2>");
		writer.print("</body>");
		writer.print("</html>");
		
		
	}
}
