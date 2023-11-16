/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hola;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Eliza
 */
public class conexion {
    Connection con;
    
    public conexion(){
    
   try
 { 
     Class.forName("com.mysql.cj.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost/registro","root","");
     System.out.print("se ha conectado a la base de datos");
    }catch (Exception e)
    {
     System.err.print("No se pudo conectar a la base de datos");
    }
    }
    public Connection getConnection(){
    return con;
    
    }
}
