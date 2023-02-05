package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLconnUtils {
	public static Connection getMySQLConnection() {
		String hostName = "localhost";
		String dbName = "automationtest";
		String userName = "root";
		String password = "";
		return getMySQLConnection(hostName, dbName, userName, password);
		
	}
	private static Connection getMySQLConnection(String hostName,String dbName,String userName,String password) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String connectionURL = "jdbc:mysql://"+":3306/" +dbName;
			conn = DriverManager.getConnection(connectionURL, userName, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	

}
