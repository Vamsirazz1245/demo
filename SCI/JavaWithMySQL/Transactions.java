package JavaWithMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactions {

	public static void main(String[] args) throws SQLException {
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sci", "root", "root");

		Statement stmt1 = con1.createStatement();

		String s1 = "insert into transaction values(1, '111122223333', '06:32:45', 'Confirmed')";
		String s2 = "insert into transaction values(2, '151122223333', '12:45:00', 'Not Confirmed')";
		String s3 = "insert into transaction values(3, '113342223333', '01:23:04', 'Confirmed')";
		String s4 = "insert into transaction values(4, '113372223333', '06:00:32', 'Confirmed')";

		stmt1.execute(s1);
		stmt1.execute(s2);
		stmt1.execute(s3);
		stmt1.execute(s4);

		con1.close();

		System.out.println("Query executed");
	}

}
