package Config;

//https://stackoverflow.com/questions/20085965/java-not-connecting-to-ms-access-database-using-eclipse

import java.sql.*;


public class AccessConnect {


        public AccessConnect() {
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                System.out.println("DriverLoaded");
                String url = "jdbc:odbc:instance";
                Connection con = DriverManager.getConnection(url);
                System.out.println("Connection Established Successfully");
            } catch(Exception e) {
                e.printStackTrace();
                System.out.println("Could Not Connect to Database");
            }
        }

        public static void main (String args[]) {
            AccessConnect dbcon = new AccessConnect();
        }
    }
