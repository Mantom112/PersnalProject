

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.Employee;
import util.UtilDB;

/**
 * Servlet implementation class ServletPersonalProjectNelson
 */
@WebServlet("/ServletPersonalProjectNelson")
public class ServletPersonalProjectNelson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPersonalProjectNelson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UtilDB.createEmployees("first","last","user","402-111-1111","123 red st. omaha Nebraska","test@gmail.com");
		
		// #2
		retrieveDisplayData(response.getWriter());
		
		
	}
	void retrieveDisplayData(PrintWriter out) {
	      String title = "Database Result";
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + //
	            "transitional//en\">\n"; //
	      out.println(docType + //
	            "<html>\n" + //
	            "<head><title>" + title + "</title></head>\n" + //
	            "<body bgcolor=\"#f0f0f0\">\n" + //
	            "<h1 align=\"center\">" + title + "</h1>\n");
	      out.println("<ul>");
	      List<Employee> listEmployees = UtilDB.listEmployees();
	      for (Employee employee : listEmployees) {
	         System.out.println("[DBG] " + employee.getId() + ", " //
	               + employee.getName() + ", " //
	               + employee.getPhone() + ", " //
	               + employee.getEmail());

	         out.println("<li>" + employee.getId() + ", " //
	               + employee.getName() + ", " //
	               + employee.getPhone() + ", " //
	               + employee.getEmail() + "</li>");
	      }
	      out.println("</ul>");
	      out.println("</body></html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
