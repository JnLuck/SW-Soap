/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.caso.exm.dao;

import java.util.List;
import java.util.Map;
import pe.edu.upeu.caso.exm.model.Usuario;

/**
 *
 * @author Jhoselyn
 */
public interface UsuarioDao {
    int create(Usuario user);
    int update(Usuario user);
    int delete(int id);
    Usuario read(int id);
    List<Usuario> readAll();
    
    //List<Map<String,Object>> readAll2();
}
