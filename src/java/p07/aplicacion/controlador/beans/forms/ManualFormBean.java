package p07.aplicacion.controlador.beans.forms;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import p07.aplicacion.modelo.dominio.Manual;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class ManualFormBean {
    private ArrayList<Manual> listaManual;
    
    private long isbnIngresado;
    private String autorIngresado;
    private String tituloIngresado;
    private double precioIngresado;
    
    public ManualFormBean() {
        this.listaManual = new ArrayList<Manual>();
    }

    public void agregarManual() {
        Manual aux = new Manual(isbnIngresado, tituloIngresado, autorIngresado, precioIngresado);
        this.listaManual.add(aux);
    }
    
    public ArrayList<Manual> getListaManual() {
        return listaManual;
    }

    public void setListaManual(ArrayList<Manual> listaManual) {
        this.listaManual = listaManual;
    }    

    public long getIsbnIngresado() {
        return isbnIngresado;
    }

    public void setIsbnIngresado(long isbnIngresado) {
        this.isbnIngresado = isbnIngresado;
    }

    public String getAutorIngresado() {
        return autorIngresado;
    }

    public void setAutorIngresado(String autorIngresado) {
        this.autorIngresado = autorIngresado;
    }

    public String getTituloIngresado() {
        return tituloIngresado;
    }

    public void setTituloIngresado(String tituloIngresado) {
        this.tituloIngresado = tituloIngresado;
    }

    public double getPrecioIngresado() {
        return precioIngresado;
    }

    public void setPrecioIngresado(double precioIngresado) {
        this.precioIngresado = precioIngresado;
    }
    
    
}
