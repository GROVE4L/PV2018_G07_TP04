package p02.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class ArregloNumeroFormBean implements Serializable{
    private ArrayList<Integer> listaNumeros;
    private int numeroIngresado;
    
    public ArregloNumeroFormBean() {
        listaNumeros = new ArrayList<Integer>();
    }

    public void agregarNumero() {
        this.listaNumeros.add(this.numeroIngresado);
    }
    
    public int tamanoArreglo() {
        return this.listaNumeros.size();
    }
    
    public int mayorNumero() {
        Iterator<Integer> iteradorNumeros = this.listaNumeros.iterator();
        int mayor=0,aux;
        boolean bandera=false;      
        while(iteradorNumeros.hasNext()) {
            aux = iteradorNumeros.next();
            if(!bandera) {
                bandera=true;
                mayor=aux;
            }
            else {
                if(aux>mayor) 
                    mayor=aux;
            }
        }        
        return mayor;
    }
    public int menorNumero() {
        Iterator<Integer> iteradorNumeros = this.listaNumeros.iterator();
        int mayor=0,aux;
        boolean bandera=false;      
        while(iteradorNumeros.hasNext()) {
            aux = iteradorNumeros.next();
            if(!bandera) {
                bandera=true;
                mayor=aux;
            }
            else {
                if(aux<mayor) 
                    mayor=aux;
            }
        }        
        return mayor;
    }
    public double promedioNumero() {
        int acumulador=0;
        Iterator<Integer> iteradorNumeros = this.listaNumeros.iterator();
        while(iteradorNumeros.hasNext()) {
            acumulador+=iteradorNumeros.next();
        }
        if(this.listaNumeros.isEmpty()) 
            return 0;
        else {
            double promedio = acumulador/(this.listaNumeros.size());
            return promedio;
        }
    }
    
    public int ultimo() {
        return this.listaNumeros.get(this.listaNumeros.size());
    }
    
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public int getNumeroIngresado() {
        return numeroIngresado;
    }

    public void setNumeroIngresado(int numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }
    
    
        
}

