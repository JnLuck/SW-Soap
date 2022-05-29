package pe.edu.upeu.caso.exm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
/**
 *
 * @author Jhoselyn
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Post {
    private int idpost;
    private String titulo;
    private String descripcion;
}
