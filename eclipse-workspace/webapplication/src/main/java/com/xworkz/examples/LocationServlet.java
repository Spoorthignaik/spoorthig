package com.xworkz.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/location")
public class LocationServlet extends HttpServlet {

	public LocationServlet() {
		System.out.println("creating default constructor... LocationServlet ");
		
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init method in location");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get method in location");
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String startPoint=req.getParameter("startPoint");
		String destination=req.getParameter("destination");
		String gender=req.getParameter("gender");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);
		
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if(name.length()>3) {
			writer.print("<span style='color:green;'>");
			writer.print("sign succesfully "+name);
		}else {
			writer.print("<span style='color:red;'>");
			writer.print("sign failed invalid name "+name);
		}
		
		if(startPoint.length()>1) {
			writer.print("<span style='color:green;'>");
			writer.print("sign succesfully startPoint"+startPoint);
		}else {
			writer.print("<span style='color:red;'>");
			writer.print("sign failed invalid startPoint  "+startPoint);
		}
		writer.print("</span>");
		
		writer.print("<pre>");
		writer.println("<a href='Location.html'> location sign up page");
		writer.println("</a>");
		writer.print("</pre>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
	}
	
}
