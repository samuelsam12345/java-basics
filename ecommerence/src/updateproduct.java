import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class updateproduct {
	public void delete() throws Exception {
		 String url = "jdbc:mysql://127.0.0.1:3306/ecommerence" ;
		 String username = "root";
		 String password = "sam123";
		 String Query = " update product set productprice = '6000' where productid = 1 ";
		 Connection con = DriverManager.getConnection(url, username,password);
		 PreparedStatement pst = con.prepareStatement(Query);
		 pst.executeUpdate();
		 con.close();
		 
		 
		}
		public static void main(String[]args)throws Exception {
			updateproduct obj = new updateproduct();
			obj.delete();
			
}
}