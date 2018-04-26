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
    private String nombreGrado;

    public String getNombreGrado() {
        return nombreGrado;
    }

    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
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
    
    public void asignarNombreGrado(String xNombre){
        nombreGrado=xNombre;
    }
    
    public void convertirGrados(){
        if(nombreGrado.equalsIgnoreCase("Fr")){
            System.out.println("Farenheit: " + grado);
            System.out.println("Celsius: " + ((grado-32)/1.8));
            System.out.println("Kelvin: " + ((grado+459.67)*5/9));
        }
        else{
            if(nombreGrado.equalsIgnoreCase("Kl")){
                System.out.println("Farenheit: "+(grado*9/5-459.67));
                System.out.println("Kelvin: "+grado);
                System.out.println("Celsius: "+(grado-273.15));
            }
            else{
                System.out.println("Farenheit: "+ (grado*9/5 + 32));
                System.out.println("Kelvin: "+ (grado+273.15));
                System.out.println("Celsius: "+grado);
            }
        }
    }
}
