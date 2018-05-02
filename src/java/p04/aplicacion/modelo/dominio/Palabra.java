/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p04.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Rojas, Guido G.
 */
public class Palabra implements Serializable{
    
    private String palabrita;
    private String palabritaEncriptada;
    private char letra;
    
    
    public Palabra() {        
    }
    public Palabra(String palabrita) {
        this.palabrita = palabrita;
        this.palabritaEncriptada = this.palabrita;
        this.palabritaEncriptada = this.palabritaEncriptada.replaceAll("(?s).", "#");        
    }
    public String getPalabrita() {
        return palabrita;
    }

    public void revelarPalabra() {
        this.palabritaEncriptada = this.palabrita;
    }
    
    public String getPalabritaEncriptada() {
        return palabritaEncriptada;
    }

    public void setPalabritaEncriptada(String palabritaEncriptada) {
        this.palabritaEncriptada = palabritaEncriptada;
    }

    public void setPalabrita(String palabrita) {
        this.palabrita = palabrita;
    }
    
    public int cantidadLetras() {
        return palabrita.length();
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public void asignarLetra(char xLetra){
        this.letra=xLetra;
    }  
    public void compararLetras() {
        for(int i=0; i<this.cantidadLetras(); i++) {
            if(this.letra == this.palabrita.charAt(i)) {
                this.palabritaEncriptada = this.palabritaEncriptada.substring(0,i)+this.letra+this.palabritaEncriptada.substring(i+1);
            }                
        }
    }    
}
