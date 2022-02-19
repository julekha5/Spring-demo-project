package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCConnection {
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.username}")
	private String userName;
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.driver}")
	private String driver;
	
	
	public void display() {
		System.out.println(userName + " " + url + " " + password + " " + driver);
	}
	
	public void getJDBCConnection () throws Exception{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection successful " +  con);		
	}
	
	
	public static void main(String[] args) throws Exception {		   
		ApplicationContext  context = new ClassPathXmlApplicationContext("studentInfo.xml");
		JDBCConnection connect = context.getBean("jdbc", JDBCConnection.class);
		connect.display();		
		connect.getJDBCConnection();
	}	
}
