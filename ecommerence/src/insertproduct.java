import java.sql.*;
public class insertproduct {
public void insert() throws Exception {
 String url = "jdbc:mysql://127.0.0.1:3306/ecommerence" ;
 String username = "root";
 String password = "sam123";
 String Query = " insert into product values(?,?,?,?,?)";
 Connection con = DriverManager.getConnection(url, username,password);
 PreparedStatement pst = con.prepareStatement(Query);
 pst.setInt(1, 1);
 pst.setString(2, "rog");
 pst.setInt(3,65000);
 pst.setString(4,"pro");
 pst.setString(5, "black");
 pst.executeUpdate();
 con.close();
 
 
}
public static void main(String[]args)throws Exception {
	insertproduct obj = new insertproduct();
	obj.insert();
	
}
}