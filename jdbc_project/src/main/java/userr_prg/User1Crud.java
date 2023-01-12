package userr_prg;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class User1Crud {
public Connection getConnection() throws Exception{
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	FileInputStream fileinputsream=new FileInputStream("dbconfig.properties");
	Properties properties=new Properties();
	properties.load(fileinputsream);
	Connection connection=DriverManager.getConnection(properties.getProperty("url"),
			properties.getProperty("username"),properties.getProperty("password"));
	return connection;
}
public void signUpUser(User1 user) throws Exception{
	Connection connection=getConnection();
	PreparedStatement preparedStatement=connection.prepareStatement("insert into userr values(?,?,?,?,?,?,?,?,?,?)");
	preparedStatement.setInt(1, user.getUserid());
	preparedStatement.setString(2, user.getUsername());
	preparedStatement.setString(3, user.getEmailid());
	preparedStatement.setString(4, user.getPassword());
	preparedStatement.setString(5, user.getAddress());
	preparedStatement.setString(6, user.getFbpassword());
	preparedStatement.setString(7, user.getInstapassword());
	preparedStatement.setString(8, user.getSnappassword());
	preparedStatement.setString(9, user.getTwitterpassword());
	preparedStatement.setString(10, user.getWhatsappassword());
	preparedStatement.execute();
	connection.close();
	System.out.println("signed");
}
public boolean loginUser(User1 user) throws Exception{
	Connection connection=getConnection();
	String query="select * from userr where emailid=?";
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	preparedStatement.setString(1,user.getEmailid());
	ResultSet resultset=preparedStatement.executeQuery();
	String password=null;
	while(resultset.next()){
		password=resultset.getString("password");
	}
	if(password.equals(user.getPassword())){
		return true;
	}
	return false;
}
public int signUpFacebok(String emailid,String facebokpassword) throws Exception{
	Connection connection=getConnection();
	PreparedStatement preparedStatement=connection.prepareStatement("update userr set facebokpassword=? where emailid=?");
	preparedStatement.setString(1, facebokpassword);
	preparedStatement.setString(2, emailid);
	int saved=preparedStatement.executeUpdate();
	connection.close();
	return saved;
}
public int signUpInsta(String emailid,String instapassword) throws Exception{
	Connection connection=getConnection();
	PreparedStatement preparedStatement=connection.prepareStatement("update userr set instapassword=? where emailid=?");
	preparedStatement.setString(1,instapassword);
	preparedStatement.setString(2, emailid);
	int saved=preparedStatement.executeUpdate();
	connection.close();
	return saved;
}
public int signUpSnap(String emailid,String snappassword) throws Exception{
	Connection connection=getConnection();
	PreparedStatement preparedStatement=connection.prepareStatement("update userr set snappassword=? where emailid=?");
	preparedStatement.setString(1,snappassword);
	preparedStatement.setString(2, emailid);
	int saved=preparedStatement.executeUpdate();
	connection.close();
	return saved;
}
public int signUpTwitter(String emailid,String twitterpassword) throws Exception{
	Connection connection=getConnection();
	PreparedStatement preparedStatement=connection.prepareStatement("update userr set twitterpassword=? where emailid=?");
	preparedStatement.setString(1,twitterpassword);
	preparedStatement.setString(2, emailid);
	int saved=preparedStatement.executeUpdate();
	connection.close();
	return saved;
}
public int signUpWhatsapp(String emailid,String whatsappassword) throws Exception{
	Connection connection=getConnection();
	PreparedStatement preparedStatement=connection.prepareStatement("update userr set whatsappassword=? where emailid=?");
	preparedStatement.setString(1,whatsappassword);
	preparedStatement.setString(2, emailid);
	int saved=preparedStatement.executeUpdate();
	connection.close();
	return saved;
}
}

