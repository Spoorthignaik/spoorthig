package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/king")
public class King extends HttpServlet {
	
	public King() {
		System.out.println("created default constructor of king");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running intit method in king");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get method...king");
		
		String name=req.getParameter("kingName");
		String region=req.getParameter("region");
		String queen=req.getParameter("queens");
		String dob=req.getParameter("dateOfBirth");
		String dod=req.getParameter("dateOfDeath");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(queen);
		System.out.println(dob);
		System.out.println(dod);
		
		PrintWriter writer=resp.getWriter();
		writer.println("king name is "+name+"sent successfully");
		writer.println("region is "+region+"sent successfully");
		writer.println("number of queens is "+queen+"sent successfully");
		writer.println(" date of birth is "+dob+"sent successfully");
		writer.println(" date of death is "+dod+"sent successfully");
		resp.setContentType("text/plain");
	}
	
	
}
