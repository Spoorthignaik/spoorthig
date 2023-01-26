package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/series")
public class WebSeries extends HttpServlet {
	
	public WebSeries() {
		System.out.println("created default constructor of webseries");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	System.out.println("running init..... ");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get");
		
	      String name=req.getParameter("SeriesName");
	      String lang=req.getParameter("lang");
	      String episode=req.getParameter("episode");
	      String ott=req.getParameter("ott");
	      String budget=req.getParameter("budget");
	      System.out.println(name);
	      System.out.println(lang);
	      System.out.println(episode);
	      System.out.println(ott);
	      System.out.println(budget);
	      
	      PrintWriter writer= resp.getWriter();
	      writer.print("sereies name "+name+"sent");
	      writer.print("language is :"+lang+"sent");
	      writer.print("number of episode is  "+episode+"sent");
	      writer.print("ott is "+ott+"sent");
	      writer.print("budget is "+budget+"sent");
	      resp.setContentType("text/plain");
	      
	}

}
