/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import p01.aplicacion.modelo.dominio.Temperatura;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ignacio
 */
@ManagedBean
@ViewScoped
public class TemperaturaFormBean implements Serializable{
    private Temperatura temperatura;
    private String nombreGrado;
    private double gradoIngresado;

    public String getNombreGrado() {
        return nombreGrado;
    }

    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
    }

    public double getGradoIngresado() {
        return gradoIngresado;
    }

    public void setGradoIngresado(double gradoIngresado) {
        this.gradoIngresado = gradoIngresado;
    }
    
    public void TemperaturaFormBean(){
        temperatura = new Temperatura();
    }
    
    public double conversor(){
        temperatura.asiganarGrado(getGradoIngresado());
        temperatura.asignarNombreGrado(getNombreGrado());
        return temperatura.calcularConversion();
    }
}    

