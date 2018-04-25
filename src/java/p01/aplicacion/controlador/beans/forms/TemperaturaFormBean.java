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
    private String grado;
    private double fr;
    private double cl;
    private double kl;
            
            
    public void convertirGrados(){
        if (grado.equalsIgnoreCase("Fr")){
            fr=Integer.parseInt(grado);
            kl=(Integer.parseInt(grado)+459.67)*5/9;
            cl=(Integer.parseInt(grado)-32)*5/9;
            }
        else{
            if(grado.equalsIgnoreCase("Cl")){
                fr=Integer.parseInt(grado)+32;
                cl=Integer.parseInt(grado);
                kl=Integer.parseInt(grado)+273.15;
            }
            else{
                if(grado.equalsIgnoreCase("Kl")){
                    fr=1.8*(Integer.parseInt(grado)-273)+32;
                    cl=Integer.parseInt(grado)-273.15;
                    kl=Integer.parseInt(grado);
                }
            }
        }
    }
    
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }
    
    public TemperaturaFormBean() {
        temperatura = new Temperatura();
    }
    
    
    
}
