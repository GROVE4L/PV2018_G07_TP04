package p07.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Rojas, Guido G.
 */
public class Carro implements Serializable{
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipoCombustible;

    //Inicio Constructores
    public Carro(){        
    }
    public Carro(String patente, String marca, String modelo, String color, String tipoCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
    }
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    public void mostrarCarro() {
        System.out.println("--------------");
        System.out.println("Marca: "+this.marca+" - Patente: "+this.patente+" - Modelo: "+this.modelo+"\nColor: "+this.color+" - Tipo Combustible: "+this.tipoCombustible);
    }    
}
