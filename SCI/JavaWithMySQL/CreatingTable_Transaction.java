package JavaWithMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTable_Transaction {
	public static void main(String[] args) throws SQLException {
	
		//TO create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sci","root","root");
			
		//To create a statement/query
		Statement stmt = con.createStatement();
		String sql = "CREATE TABLE TRANSACTION " +
	                "(ID VARCHAR(30), " +
	                " AADHARNO VARCHAR(15), " + 
	                " TXNTIME VARCHAR(10), " +
	                " STATUS VARCHAR(20))"; 

	    stmt.executeUpdate(sql);
	    System.out.println("Table Created Successfully");
	}
}