package jdbc.statement.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Second_ExecuteUpdateDemo {

	public static void main(String[] args) {
		
		try {
			//1. load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//get Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
			//create statement
			Statement statement=con.createStatement();
			
			//execute query
		
//insert
			
//		int i=statement.executeUpdate("insert into student values(1,12345,'sonu',33),(3,12347,'lonu',33)");	
//		System.out.println("total insert: "+i);	
		
//update		
//		int i=statement.executeUpdate("update student set name='jokar',marks='90' where roll=1");
//		System.out.println("total update: "+i);

			
//delete
//			int i=statement.executeUpdate("delete from student where roll=1");
//			System.out.println("total update: "+i);	
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
