package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/school")
public class School extends HttpServlet {
	
	
	public School() {
		System.out.println("created default constructor...school");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init method in school");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get method in school");
		
		String name=req.getParameter("SchoolName");
		String type=req.getParameter("SchoolType");
		String noOfstudents=req.getParameter("noOfStudents");
		String noOfStaffs=req.getParameter("noOfStaffs");
		String establishedDate=req.getParameter("establishedDate");
		String startedDate=req.getParameter("startedDate");
		String principleAge=req.getParameter("principleAge");
		String sectionName=req.getParameter("sectionName");
		String medium=req.getParameter("medium");
		String lang=req.getParameter("language");
		String id=req.getParameter("studentID");
		String bestTeacher=req.getParameter("bestTeacher");
		String board=req.getParameter("boardName");
		String rollNo=req.getParameter("rollNo");
		String principleName=req.getParameter("principleName");
		String department=req.getParameter("department");
		String leader=req.getParameter("leader");
		String noOfSection=req.getParameter("noOfSection");
		String uniformColor=req.getParameter("uniformColor");
		String uniformSize =req.getParameter("uniformSize");
		
		
		System.out.println(name);
		System.out.println(type);
		System.out.println(noOfstudents);
		System.out.println(noOfStaffs);
		System.out.println(establishedDate);
		System.out.println(startedDate);
		System.out.println(principleAge);
		System.out.println(sectionName);
		System.out.println(medium);
		System.out.println(lang);
		System.out.println(id);
		System.out.println(bestTeacher);
		System.out.println(board);
		System.out.println(rollNo);
		System.out.println(principleName);
		System.out.println(department);
		System.out.println(leader);
		System.out.println(noOfSection);
		System.out.println(uniformColor);
		System.out.println(uniformSize);
		
		
		PrintWriter writer=resp.getWriter();
		writer.print("name of school is "+name+"sent successfully");
		writer.print("type of school is "+type+"sent successfully");
		writer.print("number of students is "+noOfstudents+"sent successfully");
		writer.print("no OfStaffs is "+noOfStaffs+"sent successfully");
		writer.print("establishedDate of school is "+establishedDate+"sent successfully");
		writer.print("startedDate is "+startedDate+"sent successfully");
		writer.print("principle age is "+principleAge+"sent successfully");
		writer.print("sectionName is "+sectionName+"sent successfully");
		writer.print("medium is "+medium+"sent successfully");
		writer.print("id is "+id+"sent successfully");
		writer.print("bestTeacher is "+bestTeacher+"sent successfully");
		writer.print("board "+board+"sent successfully");
		writer.print("rollNo is "+rollNo+"sent successfully");
		writer.print("principleName is "+principleName+"sent successfully");
		writer.print("department is "+department+"sent successfully");
		writer.print("leader is "+leader+"sent successfully");
		writer.print("noOfSection is "+noOfSection+"sent successfully");
		writer.print("uniformColor is "+uniformColor+"sent successfully");
		writer.print(" uniformSize is "+uniformSize+"sent successfully");
		resp.setContentType("text/plain");
	}

}
