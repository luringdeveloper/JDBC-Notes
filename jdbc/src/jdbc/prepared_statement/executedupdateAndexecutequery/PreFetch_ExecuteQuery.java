package jdbc.prepared_statement.executedupdateAndexecutequery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class PreFetch_ExecuteQuery {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
			//for get all
			//PreparedStatement ps=connection.prepareStatement("select * from student");
			
//			PreparedStatement ps=connection.prepareStatement("select name,mobile from student where roll=?");
//			ps.setInt(1, 1);
//			ResultSet rs=ps.executeQuery();
//			while(rs.next())
//			{
//				System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
//			}
			
			//for get custom information
			PreparedStatement ps=connection.prepareStatement("select name,mobile from student where roll=?");
			ps.setInt(1, 1);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
			}
			

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
