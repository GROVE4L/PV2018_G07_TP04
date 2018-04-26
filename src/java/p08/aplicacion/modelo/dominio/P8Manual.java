/*
Punto 08: Desarrolle una aplicación que permita registrar un conjunto de P8Manual. Por cada libro
a registrar debe almacenar su ISBN, título, autor y precio. Cada vez que registre un nuevo libro
visualícelo en una tabla en conjunto con los libros registrados anteriormente. Use ArrayList.
 */
package p08.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Ignacio
 */
public class P8Manual implements Serializable{
    private long isbn;
    private String titulo;
    private String autor;
    private double precio;    

    public P8Manual() {
    }

    public P8Manual(long isbn, String titulo, String autor, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    /**
     * @return the isbn
     */
    public long getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
}
