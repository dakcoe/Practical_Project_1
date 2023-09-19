/*package com.mycom.word;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn = null;

    public static Connection getConnection() {
        if(conn == null){
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:wordDB.db");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(){
        if(conn !=null)
            try {
                conn.close;
            } catch (SQLException e){
                e.printStackTrace();
            }
    }
}
*/