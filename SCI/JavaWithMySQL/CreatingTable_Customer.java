package JavaWithMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTable_Customer {
	
	public static void main(String[] args) throws SQLException {
		//TO create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sci","root","root");
		
		///To create a statement/query
		Statement stmt = con.createStatement();
		String sql = "CREATE TABLE CUSTOMERS " +
                "(NAME VARCHAR(50), " +
                " AGE VARCHAR(5), " + 
                " AADHARNO VARCHAR(12), " + 
                " MOBILENO VARCHAR(25), " +
                " ADDRESS VARCHAR(75))"; 

      try {
		stmt.executeUpdate(sql);
		System.out.println("Table Created Successfully");
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
}