package testClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ImportDataFromDataBase {
	public static void main(String[] args) throws Exception {
//    	mysql driver class- com.mysql.jdbc.Driver 
		Class.forName("com.mysql.jdbc.Driver");// MySql driver initiated
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/amandb1", "root", "admin");
			System.out.println("Connection is successfull");
			Statement stmt = connection.createStatement();
			String[][] arr=new String[3][3];
			ResultSet rs = stmt.executeQuery("select* from amandb1.emptable");
			while (rs.next()) {
				int i=0;
				System.out.println(rs.getString("uname")+":"+rs.getInt("pwd"));
			}

		} catch (Exception e) {
			throw new Exception("Database not available");
		}

		finally {
			connection.close();
		}

	}
}
