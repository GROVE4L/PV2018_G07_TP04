/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01.aplicacion.controlador.beans.forms;

import p01.aplicacion.modelo.dominio.Temperatura;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ignacio
 */
@ManagedBean
@ViewScoped
public class TemperaturaFormBean {
    private Temperatura temperatura;
    private String nombreGrado;
    private double gradoIngresado;
    
    public void TemperaturaFormBean(){        
        temperatura = new Temperatura();
    }
    
    public void conversor(){
        temperatura.asiganarGrado(gradoIngresado);
        temperatura.asignarNombreGrado(nombreGrado);
        temperatura.convertirGrados();
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

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
    
}    

