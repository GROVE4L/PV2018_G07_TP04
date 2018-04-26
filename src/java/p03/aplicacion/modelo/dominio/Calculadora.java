package p03.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Rojas, Guido G.
 */
public class Calculadora implements Serializable{    

    public Calculadora() {        
    }
    
    public double sumarNumeros(double n1, double n2) {
        return n1+n2;
    }
    public double restarNumeros(double n1, double n2) {
        return n1-n2;
    }
    public double multiplicarNumeros(double n1, double n2) {
        return n1*n2;
    }
    public double dividirNumeros(double n1, double n2) {
        return (n2==0) ? 0 : n1/n2;
    }
    public double potenciarNumeros(double n1, double n2) {
        return Math.pow(n1, n2);
    }  
}
