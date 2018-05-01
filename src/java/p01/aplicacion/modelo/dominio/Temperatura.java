/*
Desarrollar una aplicación que ingrese una temperatura, y permite seleccionar el
tipo de escala (Grados Fahrenheit, Celsius o Kelvin). El programa debe poder visualizar su
equivalente en la escala seleccionada.
 */
package p01.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Ignacio
 */
public class Temperatura implements Serializable{
    private double nroGrado;
    private String nombreGradoI;
    private String nombreGradoF;

    public Temperatura() {
    }

    public double getNroGrado() {
        return nroGrado;
    }

    public void setNroGrado(double nroGrado) {
        this.nroGrado = nroGrado;
    }

    public String getNombreGradoI() {
        return nombreGradoI;
    }

    public void setNombreGradoI(String nombreGradoI) {
        this.nombreGradoI = nombreGradoI;
    }

    public String getNombreGradoF() {
        return nombreGradoF;
    }

    public void setNombreGradoF(String nombreGradoF) {
        this.nombreGradoF = nombreGradoF;
    }
    
    public void asignarNroGrado(double xNroGrado){
        nroGrado = xNroGrado;
    }
    
    public double deCaF(){
        return nroGrado+32;
    }
    
    public double deCaK(){
        return nroGrado+273.15;
    }
    
    public double deFaC(){
        return  (nroGrado-32)*5/9;
    }
    
    public double deFaK(){
        return (nroGrado+459.67)*5/9;
    }

    public double deKaF(){
        return nroGrado*9/5-459.67;
    }

    public double deKaC(){
        return nroGrado-273.15;
    }
    
}
    