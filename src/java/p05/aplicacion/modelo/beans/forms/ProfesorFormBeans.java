package p05.aplicacion.modelo.beans.forms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import p05.aplicacion.modelo.dominio.Profesor;


/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class ProfesorFormBeans implements Serializable{

    private ArrayList<Profesor> listaProfesor;
    private String nombreIngresado;
    private String apellidoIngresado;
    private String materiaIngresada;    
    private String emailIgresado;
    
    public void validarEmail(FacesContext context, UIComponent component, Object value)throws ValidatorException{
            Pattern pattern;
            String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            pattern = Pattern.compile(EMAIL_PATTERN);
            if(value == null) {
                    return;
            }
            if(!pattern.matcher(value.toString()).matches()) {
                    throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de validacion", 
                                value + " No es un email valido;"));
            }
    }
    
    public ProfesorFormBeans() {
        this.listaProfesor = new ArrayList<Profesor>();
    }
    
    public int cantidadProfesores() {
        return this.listaProfesor.size();
    }
    public void agregarProfesor() {
        Profesor aux = new Profesor(this.nombreIngresado, this.apellidoIngresado, this.materiaIngresada, this.emailIgresado);
        this.listaProfesor.add(aux);
                
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Felicidades",  "Añadido correctamente") );
    }

    public ArrayList<Profesor> getListaProfesor() {
        return listaProfesor;
    }

    public String getEmailIgresado() {
        return emailIgresado;
    }

    public void setEmailIgresado(String emailIgresado) {
        this.emailIgresado = emailIgresado;
    }
    
    public void setListaProfesor(ArrayList<Profesor> listaProfesor) {
        this.listaProfesor = listaProfesor;
    }

    public String getNombreIngresado() {
        return nombreIngresado;
    }

    public void setNombreIngresado(String nombreIngresado) {
        this.nombreIngresado = nombreIngresado;
    }

    public String getApellidoIngresado() {
        return apellidoIngresado;
    }

    public void setApellidoIngresado(String apellidoIngresado) {
        this.apellidoIngresado = apellidoIngresado;
    }

    public String getMateriaIngresada() {
        return materiaIngresada;
    }

    public void setMateriaIngresada(String materiaIngresada) {
        this.materiaIngresada = materiaIngresada;
    }

    
    
    
    
}
