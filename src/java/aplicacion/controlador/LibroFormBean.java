/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import aplicacion.modelo.Libro;
import aplicacion.datos.ListaLibro;

//hola
/**
 *
 * @author CX
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{
    private Libro libro;
    private ListaLibro listaLibro;
    private int isbn;
    private String tit;
    private String aut;
    private double pre;
    
    public void registrarLibro(){
        setLibro(new Libro(getIsbn(),getTit(),getAut(),getPre()));
        getListaLibro().getListadoLibro().add(getLibro());
    }

    public LibroFormBean(Libro libro, ListaLibro listaLibro, int isbn, String tit, String aut, double pre) {
        this.libro = libro;
        this.listaLibro = listaLibro;
        this.isbn = isbn;
        this.tit = tit;
        this.aut = aut;
        this.pre = pre;
    }
    
    /**
     * Creates a new instance of LibroBean
     */
    public LibroFormBean() {
        listaLibro=new ListaLibro();
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return the listaLibro
     */
    public ListaLibro getListaLibro() {
        return listaLibro;
    }

    /**
     * @param listaLibro the listaLibro to set
     */
    public void setListaLibro(ListaLibro listaLibro) {
        this.listaLibro = listaLibro;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the tit
     */
    public String getTit() {
        return tit;
    }

    /**
     * @param tit the tit to set
     */
    public void setTit(String tit) {
        this.tit = tit;
    }

    /**
     * @return the aut
     */
    public String getAut() {
        return aut;
    }

    /**
     * @param aut the aut to set
     */
    public void setAut(String aut) {
        this.aut = aut;
    }

    /**
     * @return the pre
     */
    public double getPre() {
        return pre;
    }

    /**
     * @param pre the pre to set
     */
    public void setPre(double pre) {
        this.pre = pre;
    }
    
}
