import java.sql.*;
import org.sqlite.JDBC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class doSearch
 */
@WebServlet("/doSearch")
public class doSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        
	    Connection conn = null;
	    Statement stmt = null;
	    
	    String info=request.getParameter("info");
        
	    try {
	        
	      Class.forName("org.sqlite.JDBC");
	      conn = DriverManager.getConnection("jdbc:sqlite://C:/sqlite/GuitarDB.db");
	      
	      stmt = conn.createStatement();
	      
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM Guitar where SerialNumber='"+info+"' or Price='"+info+"' or Builder='"+info+"' or Model='"+info+"' or Type='"+info+"' or BackWood='"+info+"' or TopWood='"+info+"'" );
	      while ( rs.next() ) {
	    	 String serialNumber = rs.getString("SerialNumber");
	         String price = rs.getString("Price");
	         String builder = rs.getString("Builder");
	         String type = rs.getString("Type");
	         String backWood = rs.getString("BackWood");
	         String topWood = rs.getString("TopWood");
	         

	         out.println("<html>");  
	         out.println("<head>");  
	         out.println("<title>²éÑ¯½á¹û</title>");  
	         out.println("</head>");  
	         out.println("<body>");  
	         out.println("<table border='1'>"); 
	         
	         out.println("<td>"+serialNumber+"</td>&nbsp;");
	         out.println("<td>"+price+"</td>&nbsp;"); 
	         out.println("<td>"+builder+"</td>&nbsp;"); 
	         out.println("<td>"+type+"</td>&nbsp;"); 
	         out.println("<td>"+backWood+"</td>&nbsp;"); 
	         out.println("<td>"+topWood+"</td>&nbsp;"); 
	         
	         out.println("</tr>");
	         
	         out.println("</table>");
	         out.println("</body>");  
	         out.println("</html>"); 
 


	      } 
	      rs.close();

	      stmt.close();
	      conn.close();
	      
	 	
	      
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Opened database successfully");
	}

}
