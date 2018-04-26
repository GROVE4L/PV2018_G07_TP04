package p05.aplicacion.modelo.beans.forms;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import p05.aplicacion.modelo.dominio.Profesor;


/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class ProfesorFormBeans implements Serializable{

    private ArrayList<Profesor> listaProfesor;
    private String nombreIngresado;
    private String apellidoIngresado;
    private String materiaIngresada;    
    public ProfesorFormBeans() {
        this.listaProfesor = new ArrayList<Profesor>();
    }
    
    public int cantidadProfesores() {
        return this.listaProfesor.size();
    }
    public void agregarProfesor() {
        Profesor aux = new Profesor(this.nombreIngresado, this.apellidoIngresado, this.materiaIngresada);
        this.listaProfesor.add(aux);
    }

    public ArrayList<Profesor> getListaProfesor() {
        return listaProfesor;
    }

    public void setListaProfesor(ArrayList<Profesor> listaProfesor) {
        this.listaProfesor = listaProfesor;
    }

    public String getNombreIngresado() {
        return nombreIngresado;
    }

    public void setNombreIngresado(String nombreIngresado) {
        this.nombreIngresado = nombreIngresado;
    }

    public String getApellidoIngresado() {
        return apellidoIngresado;
    }

    public void setApellidoIngresado(String apellidoIngresado) {
        this.apellidoIngresado = apellidoIngresado;
    }

    public String getMateriaIngresada() {
        return materiaIngresada;
    }

    public void setMateriaIngresada(String materiaIngresada) {
        this.materiaIngresada = materiaIngresada;
    }

    
    
    
    
}
