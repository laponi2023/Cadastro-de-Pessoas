/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ConexaoDAO {
    
    /**
     *
     * @return
     * @throws ClassNotFoundException
     */
    public Connection ConectaBD () throws ClassNotFoundException {
    Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           conexao = DriverManager.getConnection("jdbc:mysql://localhost/cadastro", "root", ""); 
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage()); 
            
            }
            return conexao;  
     
     }
     
}

