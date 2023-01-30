package com.xworkz.republic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1,urlPatterns="/freedom")
public class FreedomFighters extends HttpServlet{
	
		
		public FreedomFighters(){
			System.out.println("creating FreedomFighters");
		}

	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  System.out.println("running doGet in FreedomFighter");
	String name=req.getParameter("flightername");
	String mode=req.getParameter("mode");
	String weapone=req.getParameter("weapone");
	String alive=req.getParameter("alive");
	
	System.out.println(name);
	System.out.println(mode);
	System.out.println(weapone);
	System.out.println(alive);
	
	PrintWriter  writer=resp.getWriter();

	writer.print("<html>");
	   writer.print("<body>");
	   writer.print("<h1>");
	   writer.print("<span style='color:red;'>");
	   writer.print("Fighter Name"+name+"is send successfull");
	   writer.print("</span>");
	   writer.print("</h1>");
	   writer.print("</body>");
	   writer.print("</html>");

    resp.setContentType("text/html");
	  }
	
	@Override
	public void destroy() {
	System.out.println("running destroye in freedomFlighter");
	}	

}
