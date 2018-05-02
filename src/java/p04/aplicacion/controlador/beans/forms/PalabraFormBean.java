/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p04.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import p04.aplicacion.modelo.dominio.Palabra;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class PalabraFormBean implements Serializable{
    private Palabra palabra;
    private int vida;
    private char letraIngresada;    
    
    public PalabraFormBean() {
        String arrayPalabras[] = new String[8];
        arrayPalabras[0] = "sillita";
        arrayPalabras[1] = "mesa";
        arrayPalabras[2] = "celular";
        arrayPalabras[3] = "programar";
        arrayPalabras[4] = "visual";
        arrayPalabras[5] = "abandonar";
        arrayPalabras[6] = "arpia";
        arrayPalabras[7] = "buscar";
        
        Random rnd = new Random();
        int alea = rnd.nextInt(8);
        
        this.palabra = new Palabra(arrayPalabras[alea]);
        this.vida = 3;
    }
    
    public void menosVida() {
        String aux=palabra.getPalabritaEncriptada();        
        this.letraIngresada = Character.toLowerCase(this.letraIngresada);
        palabra.asignarLetra(this.letraIngresada);
        palabra.compararLetras();
        
        if(this.vida != 0) {
            if(aux.compareToIgnoreCase(palabra.getPalabritaEncriptada()) == 0) 
                this.vida --;
        }
        else
            this.palabra.revelarPalabra();            
    }
    
    public String obtenerPalabraEncriptada() {
        return this.palabra.getPalabritaEncriptada();
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
        
    public String palabraEnc() {
        return palabra.getPalabritaEncriptada();
    }
    
    public Palabra getPalabra() {
        return palabra;
    }

    public void setPalabra(Palabra palabra) {
        this.palabra = palabra;
    }

    public char getLetraIngresada() {
        return letraIngresada;
    }

    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }
    
}
