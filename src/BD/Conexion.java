/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexion {
    private static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/biometrico";
    private static final String USER="root";
    private static final String PASS="";
    private static Driver driver =null;
    
    public static synchronized Connection getConexion() throws SQLException{
    try{
        Class driverClass = Class.forName(DRIVER_CLASS);
        driver = (Driver)driverClass.newInstance();
        DriverManager.registerDriver(driver);    
    }catch(Exception ex){
        ex.printStackTrace();
    } 
    
    return DriverManager.getConnection(URL, USER, PASS);
}

   
 public static void close(Connection con){
    try{
        if(con!=null)con.close();
    }catch(SQLException ex){
        ex.printStackTrace();
    }
    
}       
  
public static void close(ResultSet rs){
    try{
        if(rs!=null) rs.close();
    }catch(SQLException ex){
        ex.printStackTrace();
    }
    
}

public static void close(PreparedStatement stmt){
    try{
        if(stmt!=null) stmt.close();
    }catch(SQLException ex){
     ex.printStackTrace();
    }
    
}

}
