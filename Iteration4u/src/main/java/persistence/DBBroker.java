package persistence;

import java.sql.*;

public class DBBroker {
	
	private Connection connection;
	private static DBBroker instance = null;
	
	public DBBroker(){		
		try {
		   Class.forName("com.mysql.jdbc.Driver");
		   connection = DriverManager.getConnection ("jdbc:mysql://localhost/multas","root", "CONTRASEÑA");		   	   
		} catch (Exception e)	{
		   e.printStackTrace();
		} 
	}

	public static DBBroker GetInstance() {
		if(instance == null){
			try {
				instance = new DBBroker();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
	
	public int change(String sql){
		int rs = 0;
		try {
			Statement s = connection.createStatement();
			rs = s.executeUpdate(sql);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet read(String sql){
		Statement s = null;
		ResultSet rs = null;
		try {
			s = connection.createStatement();
			rs = s.executeQuery(sql);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}

