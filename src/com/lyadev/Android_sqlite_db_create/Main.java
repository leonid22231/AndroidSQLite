package com.lyadev.Android_sqlite_db_create;

import java.awt.EventQueue;
import java.io.File;

public class Main{
/**
	 * 
	 */
	String test ;
public static File fileconf = new File(System.getProperty("user.dir") + "Android_DB.conf");


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if(fileconf.isFile() && !fileconf.isDirectory()) {
					System.out.println("test");	
					new Test().setVisible(true);
					}else {
						new Hello().setVisible(true);;
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
