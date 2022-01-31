/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lobsang
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String user = "root";
    private static final String password = "123456";
    private static final String url = "jdbc:mysql://localhost:3306/tienda";
    
    
    
    public static Connection getConnexion(){
    
        Connection con = null;
        
        try {
            //Class.forName("com.mysql.jdvc.Driver");
            con = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error en la conexion a la base de datos!");
        }
        return con; 
        
        
    }
    
    public static void main(String args[]) {

      try{
            Connection con = DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null,"Conectado");      
        }catch (SQLException e){
           JOptionPane.showMessageDialog(null,"Error en la conexion"+e);
        }
    }
}
