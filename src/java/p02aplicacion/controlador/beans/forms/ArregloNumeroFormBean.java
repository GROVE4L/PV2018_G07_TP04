package p02aplicacion.controlador.beans.forms;

import p02.aplicacion.modelo.dominio.ArregloNumero;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class ArregloNumeroFormBean implements Serializable{
    private ArregloNumero listaNumeros ;

    public ArregloNumeroFormBean() {
        listaNumeros = new ArregloNumero();
        
    }
    
    public ArregloNumeroFormBean(ArregloNumero listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public ArregloNumero getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArregloNumero listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    
    
}

