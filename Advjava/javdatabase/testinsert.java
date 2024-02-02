package javdatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class testinsert {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		String cname="advjava2";
		String coursecode="csa2003";
	    int  credits=3;
		String levell="highh";
		//loading your driver
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//2.register the driver
		//3.create connection object
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca051","root","Veena1234");
		//4.prepare statement object
		Statement stmt=con.createStatement();
		//5.prepare qery
		String q1="insert into subs values('"+cname+"','"+coursecode+"','"+credits+"','"+levell+"')";
		int x=stmt.executeUpdate(q1);
		if(x>0) {
			System.out.println("successfully executed");
		}
		else {
			System.out.println("insert failed");
		}
		con.close();
		

	}

}
