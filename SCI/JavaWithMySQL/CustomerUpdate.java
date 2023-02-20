package JavaWithMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerUpdate {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sci","root","root");
		Statement stat = con.createStatement();
		
		String s = "UPDATE customers SET NAME = 'Kiran' WHERE AGE = 56";
		int rowsaffected = stat.executeUpdate(s);
		System.out.println("Rows Affected: " + rowsaffected);
		
		System.out.println("Updated.....");
		
		con.close();
		
	}

}
