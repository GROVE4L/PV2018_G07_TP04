package p02.aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rojas, Guido G.
 */
public class ArregloNumero implements Serializable{
    private ArrayList<Integer> listaNumeros = new ArrayList<Integer>();    
    public ArregloNumero() {
    }    
    
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    public void addNumero(int numero) {
        listaNumeros.add(numero);
    }
    public int tamanoArreglo() {
        return listaNumeros.size();
    }
    
}
