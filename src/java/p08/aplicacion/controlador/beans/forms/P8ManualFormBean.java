package p08.aplicacion.controlador.beans.forms;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import p08.aplicacion.modelo.dominio.P8Manual;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class P8ManualFormBean {
    private ArrayList<P8Manual> listaManual;
    
    private long isbnIngresado;
    private String autorIngresado;
    private String tituloIngresado;
    private double precioIngresado;
    
    private String tituloBuscado;
    
    public P8ManualFormBean() {
        this.listaManual = new ArrayList<P8Manual>();
    }
    public boolean buscarTitulo() {
        for(P8Manual i: this.listaManual) {
            if(i.getAutor().compareToIgnoreCase(this.tituloBuscado) == 0)
                return true;
        }
        return false;
    }
    
    public void agregarManual() {
        P8Manual aux = new P8Manual(isbnIngresado, tituloIngresado, autorIngresado, precioIngresado);
        this.listaManual.add(aux);
    }
    
    public ArrayList<P8Manual> getListaManual() {
        return listaManual;
    }

    public void setListaManual(ArrayList<P8Manual> listaManual) {
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

    public String getTituloBuscado() {
        return tituloBuscado;
    }

    public void setTituloBuscado(String tituloBuscado) {
        this.tituloBuscado = tituloBuscado;
    }
    
    
}
