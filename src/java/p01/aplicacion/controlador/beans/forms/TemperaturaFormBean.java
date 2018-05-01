/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import p01.aplicacion.modelo.dominio.Temperatura;

/**
 *
 * @author Ignacio
 */
@ManagedBean 
@ViewScoped
public class TemperaturaFormBean implements Serializable{
    private double gradoIngresado;
    private char nombreIngresadoI;
    private char nombreIngresadoF;
    private Temperatura temp;

    public TemperaturaFormBean() {
    }

    public char getNombreIngresadoI() {
        return nombreIngresadoI;
    }

    public void setNombreIngresadoI(char nombreIngresadoI) {
        this.nombreIngresadoI = nombreIngresadoI;
    }

    public char getNombreIngresadoF() {
        return nombreIngresadoF;
    }

    public void setNombreIngresadoF(char nombreIngresadoF) {
        this.nombreIngresadoF = nombreIngresadoF;
    }

    public Temperatura getTemp() {
        return temp;
    }

    public void setTemp(Temperatura temp) {
        this.temp = temp;
    }
    
    public double getGradoIngresado() {
        return gradoIngresado;
    }
    
    public void setGradoIngresado(double gradoIngresado) {
        this.gradoIngresado = gradoIngresado;
    }
    
    public double convertir(){
        double resultado=0;
        temp = new Temperatura();
        if(nombreIngresadoI == 'C' && nombreIngresadoF == 'C'){
            resultado = gradoIngresado;
        }
        if(nombreIngresadoI == 'C' && nombreIngresadoF == 'F'){
            resultado = temp.deCaF();
        }
        if(nombreIngresadoI == 'C' && nombreIngresadoF == 'K'){
            resultado = temp.deCaK();
        }
        if(nombreIngresadoI == 'F' && nombreIngresadoF == 'F'){
            resultado = gradoIngresado;
        }
        if(nombreIngresadoI == 'F' && nombreIngresadoF == 'K'){
            resultado = temp.deFaK();
        }
        if(nombreIngresadoI == 'F' && nombreIngresadoF == 'C'){
            resultado = temp.deFaC();
        }
        if(nombreIngresadoI == 'K' && nombreIngresadoF == 'F'){
            resultado = temp.deKaF();
        }
        if(nombreIngresadoI == 'K' && nombreIngresadoF == 'C'){
            resultado = temp.deKaC();
        }
        if(nombreIngresadoI == 'K' && nombreIngresadoF == 'K'){
            resultado = gradoIngresado;
        }
        return resultado;
    }
    
}    

