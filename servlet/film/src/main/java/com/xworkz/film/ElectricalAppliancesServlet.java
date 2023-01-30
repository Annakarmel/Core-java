package com.xworkz.film;

    import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet(loadOnStartup = 1, urlPatterns = "/appliances")
	public class ElectricalAppliancesServlet extends HttpServlet {
		
		public ElectricalAppliancesServlet() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running doGet method in ElectricalAppliancesServlet...");
			
			String name = req.getParameter("name");
			String brand = req.getParameter("brand");
			String price = req.getParameter("price");
			String color = req.getParameter("color");
			String capacity = req.getParameter("capacity");
			String location = req.getParameter("location");
			String appName = req.getParameter("appName");
			String voltage = req.getParameter("voltage");
			String power = req.getParameter("power");
			String weight = req.getParameter("weight");
			String manufactureDate = req.getParameter("manufactureDate");
			String shopName = req.getParameter("shopName");
			String sensor = req.getParameter("sensor");
			String managerName = req.getParameter("managerName");
			String buyerName = req.getParameter("buyerName");
			String warranty = req.getParameter("warranty");
			String ratings = req.getParameter("ratings");
			String hotWash = req.getParameter("hotWash");
			String material = req.getParameter("material");
			String height = req.getParameter("height");
			String types = req.getParameter("types");
			
			System.out.println(name);
			System.out.println(brand);
			System.out.println(price);
			System.out.println(color);
			System.out.println(capacity);
			System.out.println(location);
			System.out.println(appName);
			System.out.println(voltage);
			System.out.println(power);
			System.out.println(weight);
			System.out.println(manufactureDate);
			System.out.println(shopName);
			System.out.println(sensor);
			System.out.println(managerName);
			System.out.println(buyerName);
			System.out.println(warranty);
			System.out.println(ratings);
			System.out.println(hotWash);
			System.out.println(material);
			System.out.println(height);
			System.out.println(types);
			
			PrintWriter writer = resp.getWriter();
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h1>");
			writer.print("<span style = 'color : brown';>");
			writer.print("Electrical appliances information send successfullly.........");
			writer.print("</span>");
			writer.print("</h1>");
			writer.print("</body>");
			writer.print("</html>");
			
		}



}
