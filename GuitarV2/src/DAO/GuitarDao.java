package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Domain.Guitar;


public class GuitarDao {
	
	public Guitar getGuitarByInfo(String Info) {

		Connection conn=DBconn.getConnection();
		Statement stmt = null;
		Guitar guitar = null;
		
		try {
	    stmt = conn.createStatement();
	      
	    ResultSet rs = stmt.executeQuery( "SELECT * FROM Guitar where SerialNumber='"+Info+"' or Price='"+Info+"' or Builder='"+Info+"' or Model='"+Info+"' or Type='"+Info+"' or BackWood='"+Info+"' or TopWood='"+Info+"'" );
	      

	      while ( rs.next() ) {
	    	 String serialNumber = rs.getString("SerialNumber");
	         String price = rs.getString("Price");
	         String builder = rs.getString("Builder");
	         String model = rs.getString("Model");
	         String type = rs.getString("Type");
	         String backWood = rs.getString("BackWood");
	         String topWood = rs.getString("TopWood");        
	 		
	         guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
	         
	         System.out.println(serialNumber);
	      }
	      
	      rs.close();
	      stmt.close();
	      conn.close();
	      System.out.println("Opened database successfully");
	      
		}catch (Exception e) {
			System.out.println("open db error" + e.getMessage());
			e.printStackTrace();
		}
		return guitar;
	}
	
}

