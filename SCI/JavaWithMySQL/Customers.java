package JavaWithMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customers {
	public static void main(String[] args) throws SQLException {
		//TO create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sci","root","root");
		
		///To create a statement/query
		Statement stmt = con.createStatement();

		String s1 = "insert into customers values('Swaroop', 24, '151122223333', '123356789', 'Delhi')";
		String s2 = "insert into customers values('Venkatesh', 40, '113342223333', '1239999789', 'Andhra Pradesh')";
		String s3 = "insert into customers values('Rohit', 36, '113372223333', '3344557788', 'Rajasthan')";
		String s4 = "insert into customers values('Smith', 56, '111125623333', '9876543214', 'Karnataka')";
		  
		//To execute a statement/query
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		stmt.execute(s4);
		  
		//To close the connection
		con.close();
		System.out.println("Query executed");
		 
		//To retrieve the data
		String s5 = "select NAME from customers where ADDRESS = ('Delhi')";
		ResultSet rs = stmt.executeQuery(s5); while (rs.next()) { String name =
		rs.getString("NAME"); System.out.println(name + "         ");
		}
		con.close();
	}
}