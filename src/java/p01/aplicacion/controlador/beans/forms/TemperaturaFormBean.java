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
    
    private String nombreGrado;
    private double gradoIngresado;
    
    public void TemperaturaFormBean(){        
    
    }
    
    public void conversor(){
        Temperatura temperatura = new Temperatura();
        temperatura.asiganarGrado(gradoIngresado);
        temperatura.asignarNombreGrado(nombreGrado);
        temperatura.convertirGrados();
    }
    
}    

