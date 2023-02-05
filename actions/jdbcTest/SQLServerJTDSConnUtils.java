package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerJTDSConnUtils {
	public static Connection getSQLServerConnection() {
		String hostName = "localhost";
		//String sqlInstanceName = "";
		String database = "automationtest";
		String userName = "";
		String password = "";
		return getSQLServerConnection(hostName, database, userName, password);
		
	}
	private static Connection getSQLServerConnection(String hostName, String database, String userName,String password) {
		Connection conn = null;
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			String connectionURL = "jdbc:jtds:sqlserver://"+hostName+":1433/" + database ;
			conn = DriverManager.getConnection(connectionURL, userName, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	

}
