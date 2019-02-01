package com.lyadev.Android_sqlite_db_create;
import java.sql.*;
public class DBLoad {
	public static ResultSet resSet;
	public static Statement statmt;
public static void main (String[] args) {
	try {
		Class.forName("org.sqlite.JDBC");
		//Connection co = DriverManager.getConnection("jdbc:sqlite:/home/leonid/Desktop/test");
		System.out.print("Connect");
		 ReadDB();
	}catch(Exception e)
	{
		System.out.print(e);
	}
}
public static void ReadDB() throws ClassNotFoundException, SQLException
{
	resSet = statmt.executeQuery("SELECT * FROM users");
	while(resSet.next())
	{
		int id = resSet.getInt("id");
		String  name = resSet.getString("name");
		String  phone = resSet.getString("phone");
      System.out.println( "ID = " + id );
      System.out.println( "name = " + name );
      System.out.println( "phone = " + phone );
      System.out.println();
	}	
	
	System.out.println("Таблица выведена");
 }
}
