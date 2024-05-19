package pkg_tcs;

import java.sql.*;

public class Conn {
   Connection c;
	Statement s;

	public Conn() {
		try {
			
			c=DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem","root","Harsh2206");
			s=c.createStatement();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
    
}


