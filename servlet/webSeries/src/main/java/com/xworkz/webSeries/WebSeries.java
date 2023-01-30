package com.xworkz.webSeries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/web")
public class WebSeries extends HttpServlet{
	
	public WebSeries() {
		System.out.println("creating webseries");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init in webseries");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in WebSeries");
		String name=req.getParameter("name");
		String language=req.getParameter("language");
		String episode=req.getParameter("episode");
		
		String ott=req.getParameter("ott");
		String budjet=req.getParameter("budjet");
		
		System.out.println(name);
		System.out.println(language);
		System.out.println(episode);
		System.out.println(ott);
		System.out.println(budjet);
		
		
         PrintWriter writer=resp.getWriter();
         
         
         writer.print("<html>");
         writer.print("<body>");
         writer.print("<h1>");
         writer.print("<span>");
         writer.print("sending "+name+"successfully");
         writer.print("</span>");
         writer.print("</h1>");
         writer.print("</body>");
         writer.print("</html>");
         
         resp.setContentType("text/html");
		
	}
	
	
}