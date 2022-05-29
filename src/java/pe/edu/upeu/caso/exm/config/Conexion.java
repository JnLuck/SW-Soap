/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.caso.exm.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Jhoselyn
 */
public class Conexion {
    private static final String URL ="jdbc:postgresql://ec2-34-230-153-41.compute-1.amazonaws.com:5432/dcl9is5q8pcgur";
    private static final String USER ="kifxpefgiagukl";
    private static final String PASS ="0705d3d694c1c5f3c757537439b19946613fe58c219ff44aa26d01606f28961c";
    private static final String DRIVER ="org.postgresql.Driver";
    private static Connection cx = null;
    
    public static Connection getConexion(){
        try{
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        }catch (ClassNotFoundException | SQLException e){
           System.out.println("Error:"+e);
        }
        return cx;
    }

}
