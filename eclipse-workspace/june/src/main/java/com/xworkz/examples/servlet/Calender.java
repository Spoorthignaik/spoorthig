package com.xworkz.examples.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/work")
public class Calender extends HttpServlet {

	public Calender() {
		System.out.println("created default constructor");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get method");
		String data="displaying the do get method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do post");
		String data="displaying the do post method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do delete method");
		String data="displaying the do delete method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do head method");
		String data="displaying the do head method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do options method");
		String data="displaying the do options method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do put method");
		String data="displaying the do put method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do trace method");
		String data="displaying the do trace method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	
	
	

}
