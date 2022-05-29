/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.caso.exm.daolmpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.caso.exm.config.Conexion;
import pe.edu.upeu.caso.exm.dao.UsuarioDao;
import pe.edu.upeu.caso.exm.model.Usuario;

/**
 *
 * @author Jhoselyn
 */
public class UsuarioDaoImpl implements UsuarioDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Usuario user) {
        int x = 0;
        String SQL="insert into usuarios(username, password, idpersona, idrol, fechacreacion, estado) VALUES(?,?,?,?,now(),true)";
        try{
            cx = Conexion.getConexion();
            ps = cx.prepareStatement (SQL);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getIdpersona());
            ps.setInt(4, user.getIdrol());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }
    

    @Override
    public int update(Usuario user) {
        
        int x = 0;
        String SQL="update usuarios set username=?, password=?, idpersona=?, idrol=? where idusuario=?";
        try{
            cx = Conexion.getConexion();
            ps = cx.prepareStatement (SQL);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getIdpersona());
            ps.setInt(4, user.getIdrol());
            ps.setInt(5, user.getIdusuario());
            
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
        
    }

    @Override
    public int delete(int id) {
        int x = 0;
        String SQL="delete from usuarios where idusuario=?";
        try{
            cx = Conexion.getConexion();
            ps = cx.prepareStatement (SQL);
            ps.setInt(1, id);
            x = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public Usuario read(int id) {
        Usuario u = new Usuario();
        String SQL = "select *from usuarios where idusuario=?";
        try{
            cx = Conexion.getConexion();
            ps = cx.prepareStatement (SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()){
                u.setIdusuario(rs.getInt("idusuario"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setIdpersona(rs.getInt("idpersona"));
                u.setIdrol(rs.getInt("idrol"));
                u.setFecha(rs.getString("fechacreacion"));
                u.setEstado(rs.getBoolean("estado"));
            }
        } catch (SQLException e){
            System.out.println("Error: "+e);
        }
        return u;
    }

    @Override
    public List<Usuario> readAll() {
        List<Usuario> lista = new ArrayList<>();
        String SQL = "select *from usuarios";
        try{
            cx = Conexion.getConexion();
            ps = cx.prepareStatement (SQL);
            rs = ps.executeQuery();
            while(rs.next()){
            Usuario u = new Usuario();
            u.setIdusuario(rs.getInt("idusuario"));
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
            u.setIdpersona(rs.getInt("idpersona"));
            u.setIdrol(rs.getInt("idrol"));
            u.setFecha(rs.getString("fechacreacion"));
            u.setEstado(rs.getBoolean("estado"));
            lista.add(u);
            }
        } catch (SQLException e){
            System.out.println("Error: "+e);
        }
        return lista;
    }

    
    

    
    
}
