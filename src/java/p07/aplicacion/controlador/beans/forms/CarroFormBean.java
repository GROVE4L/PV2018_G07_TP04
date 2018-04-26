package p07.aplicacion.controlador.beans.forms;

import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import p07.aplicacion.modelo.dominio.Carro;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class CarroFormBean {

    private ArrayList<Carro> listaAutos;    
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipoCombustible;      
     
    public CarroFormBean() {
        this.listaAutos = new ArrayList<Carro>();
        this.agregarAutos();
    }
    public void agregarAutos() {
        Carro objAuto = new Carro("AB 324 OJ", "FORD", "2009", "GRIS", "DIESEL");
        listaAutos.add(objAuto);
        objAuto = new Carro("LN 749 PA", "BMW", "2018", "ROJO", "SUPER");
        listaAutos.add(objAuto);
        objAuto = new Carro("BD 307 ZR", "TOYOTA", "2017", "BLANCO", "SUPER");
        listaAutos.add(objAuto);
        objAuto = new Carro("AA 174 DF", "LEXUS", "2018", "VERDE OSCURO", "SUPER");
        listaAutos.add(objAuto);
    }
    
    public ArrayList<Carro> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ArrayList<Carro> listaAutos) {
        this.listaAutos = listaAutos;
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
    
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Auto Editado", ((Carro) event.getObject()).getPatente());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Calenado Edicion", ((Carro) event.getObject()).getPatente());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
