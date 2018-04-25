package p02.aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Rojas, Guido G.
 */
public class ArregloNumero implements Serializable{
    private ArrayList<Integer> listaNumeros;
    public ArregloNumero() {
        listaNumeros = new ArrayList<Integer>();
    }    
    
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    public void agregarNumero(int numero) {
        listaNumeros.add(numero);
    }
    public int tamanoArreglo() {
        return listaNumeros.size();
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
        if(this.listaNumeros.size() == 0) return 0;
        else {
            double promedio = acumulador/(this.listaNumeros.size());
            return promedio;
        }
    }
    
}
