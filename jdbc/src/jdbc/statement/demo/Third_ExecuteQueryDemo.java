package jdbc.statement.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Third_ExecuteQueryDemo {

	
	//for fetching purpose  
	public static void main(String[] args) {
		try {
			//1. load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//get Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
			//create statement
			Statement statement=con.createStatement();
			
			//execute query
		
			
	//getting value from single row		
//	ResultSet rs=statement.executeQuery("select * from student where roll=2");
//	while (rs.next()) {
//		System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
//	}
	
			
	//getting value all from table		
//	ResultSet rs=statement.executeQuery("select * from student");
//	while (rs.next()) {
//		System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
//	}

	
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
