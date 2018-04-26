/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p03.aplicacion.controlador.beans.forms;

import p03.aplicacion.modelo.dominio.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{

    Calculadora cal;
    private double numero1;
    private double numero2;
    
    public CalculadoraFormBean() {
        cal = new Calculadora();
    }

    public double sumar() {
        return cal.sumarNumeros(this.numero1, this.numero2);
    }
    public double restar() {
        return cal.restarNumeros(this.numero1, this.numero2);
    }
    public double multiplicar() {
        return cal.multiplicarNumeros(this.numero1, this.numero2);
    }
    public double dividir() {
        return cal.dividirNumeros(this.numero1, this.numero2);
    }
    public double potencia() {
        return cal.potenciarNumeros(this.numero1, this.numero2);
    }
    public Calculadora getCal() {
        return cal;
    }

    public void setCal(Calculadora cal) {
        this.cal = cal;
    }
    
    
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
}
