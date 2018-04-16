package Model;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;






public class KETNOI_MOD {	
	 private static Connection con;
	    private static String url = "jdbc:mysql://localhost:3306/quanli_shop?useUnicode=true&characterEncoding=UTF-8";
	    private static String user="root";
	    private static String password ="";
	 
	    public static Connection getConnection() {
	        con = null;
	       
	            // driver register
	            try {
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            try {
					con = (Connection) DriverManager.getConnection(url, user, password);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        
	        return (con);
	    }
	 
	    public static void freeConnection() {
	        try {
	            con.close();
	        } catch (Exception ex) {
	        	System.out.println(ex);
	        }
	    }
	    public static void main(String[] args) {
	        Connection c = getConnection();
	        if (c == null) {
	            System.out.println("something wrong");
	        } else {
	            System.out.println("ok");
	        }
	}
	

	
}
