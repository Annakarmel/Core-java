package com.xworkz.king;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/bajju")
public class King extends HttpServlet{
	
	public King() {
		System.out.println("create "+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String region=req.getParameter("region");
		String queens=req.getParameter("queens");
		String dob=req.getParameter("dateOf");
		String dod=req.getParameter("dateOf");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(queens);
		System.out.println(dob);
		System.out.println(dod);
		
	
		PrintWriter writer =resp.getWriter();
		writer.print("sending "+name+"succefully");
		resp.setContentType("text/plain");
		
		
			}

}
