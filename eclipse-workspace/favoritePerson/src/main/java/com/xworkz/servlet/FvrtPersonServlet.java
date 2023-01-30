package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/person")
public class FvrtPersonServlet extends HttpServlet {
	
	public FvrtPersonServlet() {
		System.out.println("creaated defalt constructor of fvrt person"); 
	}
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init method in fovorite person");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do post method");
		
		
		String name=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String gender=req.getParameter("gender");
		String reason=req.getParameter("reason");
		String address=req.getParameter("address");
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
		req.setAttribute("firstName", name);
		req.setAttribute("lastName", lastName);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);
		dispatcher.forward(req, resp);
		
		
	}

}
