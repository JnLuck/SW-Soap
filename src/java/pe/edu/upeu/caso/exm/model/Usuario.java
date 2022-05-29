package pe.edu.upeu.caso.exm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Jhoselyn
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Usuario {
    private int idusuario;
    private String username;
    private String password;
    private int idpersona;
    private int idrol;
    private String fecha;
    private boolean estado;

}
