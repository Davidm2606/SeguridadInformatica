/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author David Teran
 */
public class Conexion {
    
        Connection connect = null;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/ciberseguridad", "root", "");
           //JOptionPane.showMessageDialog(null, "Feliciontaciones estas conectado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error....." + ex);
        }
        return connect;
    }
    
 
}
