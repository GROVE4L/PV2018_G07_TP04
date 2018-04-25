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
    private int numeroIngresado;
    
    public void agregarNumero() {
        listaNumeros.agregarNumero(this.numeroIngresado);
        
    }
    
    public ArregloNumeroFormBean() {
        listaNumeros = new ArregloNumero();
        
    }

    public int getNumeroIngresado() {
        return numeroIngresado;
    }

    public void setNumeroIngresado(int numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
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

