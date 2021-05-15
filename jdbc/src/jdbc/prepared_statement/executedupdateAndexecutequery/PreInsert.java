package jdbc.prepared_statement.executedupdateAndexecutequery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class PreInsert {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement ps=connection.prepareStatement("insert into student values(?,?,?,?)");
			
			ps.setInt(1, 5);
			ps.setInt(2, 42345);
			ps.setString(3, "c");
			ps.setFloat(4, 71.4f);
		
			
			int i=ps.executeUpdate();
			System.out.println(i);
			

			connection.close();

		}  catch (Exception e) {
			System.out.println(e);
		}

	}

}
