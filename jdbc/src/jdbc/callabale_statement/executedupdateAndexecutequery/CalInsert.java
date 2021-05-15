package jdbc.callabale_statement.executedupdateAndexecutequery;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class CalInsert {
	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			CallableStatement cs=connection.prepareCall("call myinsert(?,?,?,?)");
			
			cs.setInt(1, 02);
			cs.setInt(2, 1234);
			cs.setString(3, "Ajay");
			cs.setFloat(4, 72.4f);
		
			int i=cs.executeUpdate();
			System.out.println(i);

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
