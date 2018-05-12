/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.datos.AutoLista;
import aplicacion.modelo.Auto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author CX
 */
@ManagedBean
@ViewScoped
public class AutoFormBean implements Serializable{
    private AutoLista autoLista;
    private Auto auto;
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    
    public void agregarAuto(){
        auto=new Auto(getPatente(),getMarca(),getModelo(),getColor(),getCombustible());
        autoLista.agregarAutos(auto);
    }
    
    public void establecerAuto(Auto unAuto){
        setAuto(unAuto);
    }
    
    public void modificarAuto(){
        autoLista.modificarAutos(auto);
    }
    
    public void eliminarAuto(){
        autoLista.eliminarAutos(auto);
    }
    
    /**
     * Creates a new instance of AutoFormBean
     */
    public AutoFormBean() {
       autoLista= new AutoLista();
       auto=new Auto();
    }

    /**
     * @return the auto
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * @param auto the auto to set
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the autoLista
     */
    public AutoLista getAutoLista() {
        return autoLista;
    }

    /**
     * @param autoLista the autoLista to set
     */
    public void setAutoLista(AutoLista autoLista) {
        this.autoLista = autoLista;
    }
    
}
