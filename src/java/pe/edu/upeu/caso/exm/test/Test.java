/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.caso.exm.test;
import com.google.gson.Gson;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.caso.exm.config.Conexion;
import pe.edu.upeu.caso.exm.dao.PostDao;
import pe.edu.upeu.caso.exm.dao.UsuarioDao;
import pe.edu.upeu.caso.exm.daolmpl.PostDaoImpl;
import pe.edu.upeu.caso.exm.daolmpl.UsuarioDaoImpl;
import pe.edu.upeu.caso.exm.model.Usuario;

/**
 *
 * @author Jhoselyn
 */
public class Test {
    static Gson gson = new Gson();
    static UsuarioDao p = new UsuarioDaoImpl();
  

    public static void main(String[] args) {
            // TODO code application logic here
            if(Conexion.getConexion()!=null){
                System.out.println("Conectado");
            }else{
                System.out.println("No conectado");
            }
            System.out.println(gson.toJson(p.readAll()));

            
            
    
    }
    
    
}
