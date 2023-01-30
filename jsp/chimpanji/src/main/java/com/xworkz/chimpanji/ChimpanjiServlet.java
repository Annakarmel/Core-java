package com.xworkz.chimpanji;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,name="ChimpanjiServlet",urlPatterns="/chimpu")
public class ChimpanjiServlet extends HttpServlet{
	
	public ChimpanjiServlet() {
		System.out.println("create "+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running dopost in Chimpanji");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		
		System.out.println("fname"+fname);
		System.out.println("lname"+lname);
		System.out.println("email"+email);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("show.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("email", email);
		
		dispatcher.forward(req, resp);
		


		
	}

}