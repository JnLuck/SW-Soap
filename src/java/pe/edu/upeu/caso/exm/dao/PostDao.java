/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.caso.exm.dao;

import java.util.List;
import pe.edu.upeu.caso.exm.model.Post;

/**
 *
 * @author Jhoselyn
 */
public interface PostDao {
    int create(Post post);
    int update(Post post);
    int delete(int id);
    Post read(int id);
    List<Post> readAll();
}
