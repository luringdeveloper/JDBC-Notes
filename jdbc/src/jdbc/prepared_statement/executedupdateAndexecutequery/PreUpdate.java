package jdbc.prepared_statement.executedupdateAndexecutequery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class PreUpdate {

public static void main(String[] args) {
	try {

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		PreparedStatement ps=connection.prepareStatement("update student set roll=?,name=? where roll=?");
		
		ps.setInt(1, 4);
		ps.setString(2, "pankaj");
		
		ps.setInt(3, 5);
		
	
		
		int i=ps.executeUpdate();
		System.out.println(i);
		

		connection.close();

	} catch (Exception e) {
		System.out.println(e);
	}
}
}

