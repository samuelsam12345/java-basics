import java.sql.*;

public class getproduct {

	public void get() throws Exception {
		 String url = "jdbc:mysql://127.0.0.1:3306/ecommerence" ;
		 String username = "root";
		 String password = "sam123";
		 String Query = " select *from product  ";
		 Connection con = DriverManager.getConnection(url, username,password);
		 Statement smt = con.createStatement();
		 ResultSet rs=smt.executeQuery(Query);
		 while(rs.next()) {
		System.out.println("product id :"+rs.getInt(1));
		System.out.println("product name :"+rs.getString(2));
		System.out.println("product price :"+rs.getInt(3));
		System.out.println("product model :"+rs.getString(4));
		System.out.println("product color :"+rs.getString(5));
		 }
		 con.close();
		 
		 
		}
		public static void main(String[]args)throws Exception {
			getproduct obj = new getproduct();
			obj.get();
			
}
}