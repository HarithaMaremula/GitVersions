import java.sql.*;

public class ConnectionToSql {
	public static void main(String args[])
	{
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Haritha","root","Root123@");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getInt(2));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		System.out.println("Hello");
	}

}

