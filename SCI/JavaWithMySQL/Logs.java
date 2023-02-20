package JavaWithMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logs {
	static Logger log = Logger.getLogger(Logs.class.getName());
	public static void main(String[] args) throws SQLException {
		int num = 5;
		BasicConfigurator.configure();
		Connection con = null;
		if (num < 10) {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sci", "root", "root");
			log.info("Connected Successfully");
			} else {
				log.error("error");
			}
			
		int num1 = 6;
			  Statement stmt = con.createStatement();
			  //String a = "insert into customers values('Subramanyam',58,'156411342311','9345478855','Chennai')";
			  String a = "UPDATE customers SET NAME = 'Kiran' WHERE AGE = 56";
				if (num1 < 10) {
					stmt.execute(a);
					log.info("Data Inserted Successfully");
				} else {
					log.error("Data Not Inserted");
				}
			
			con.close();
			 
		}
}