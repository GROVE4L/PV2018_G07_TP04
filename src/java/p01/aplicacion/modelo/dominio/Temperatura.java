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
    private double grado;
    private String nombreGrado;


    public String getNombreGrado() {
        return nombreGrado;
    }
    
    public double getGrado() {
        return grado;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }
    
    public void asiganarGrado(double xGrado){
        grado=xGrado;
    }
    
    public void asignarNombreGrado(String xNombreI){
        nombreGrado=xNombreI;
    }

    public double calcularConversion(){
        if(getNombreGrado().equalsIgnoreCase("Ke"))
            return grado+273.15;
        else
            if(getNombreGrado().equalsIgnoreCase("Fa"))
                return grado*1.8000+32;
            else
                return grado;
    }
    
}
    