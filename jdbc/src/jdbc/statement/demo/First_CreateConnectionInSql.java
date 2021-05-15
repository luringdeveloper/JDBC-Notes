package jdbc.statement.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;







public class First_CreateConnectionInSql {
	
	public static void main(String[] args) {
		
		try{
			//1) Load Driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//2) Get Connection
			//DriverManager.getconnection("url","username","password");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			
			//3) Create Statement
			Statement statement=connection.createStatement();
			
			//4) Execute Query
			boolean status=statement.execute("insert into student values(7,1134567886,'onu',80)");
			
			System.out.println(status);
			//5) Close Connection
			connection.close();
			
			}catch(Exception e){
			 System.out.println(e);
			}
		
		
	}
	
}
