package p05.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Rojas, Guido G.
 */
public class Profesor implements Serializable{
    private String nombre;
    private String apellido;
    private String materia;
    private String email;

    public Profesor() {        
    }
    
    public Profesor(String nombre, String apellido, String materia, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.email = email;
    }   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
}
