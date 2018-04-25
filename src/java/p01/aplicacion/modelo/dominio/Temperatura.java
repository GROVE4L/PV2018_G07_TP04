/*
Desarrollar una aplicación que ingrese una temperatura, y permite seleccionar el
tipo de escala (Grados Fahrenheit, Celsius o Kelvin). El programa debe poder visualizar su
equivalente en la escala seleccionada.
 */
package p01.aplicacion.modelo.dominio;

/**
 *
 * @author Ignacio
 */
public class Temperatura {
    private double grado;
    
    public double obtenerGradoCel(){
        return grado;
    }

    public double getGrado() {
        return grado;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }
    
}
