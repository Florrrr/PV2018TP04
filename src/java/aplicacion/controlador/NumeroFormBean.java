/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.Numero;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author CX
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable{
    private Numero numero;
    private int mayor;
    private int menor;
    private int num;
    private int prom;
    private boolean deshabilitador;

    /**
     * Creates a new instance of NumeroFormBean
     */
    public NumeroFormBean() {
        numero=new Numero();
        deshabilitador=true;
    }
    
    public void ingresarNumero(){
        setDeshabilitador(false);
        getNumero().agregarNumeros(getNum());
    }
    
    public void buscarMayor(){
        setMayor(getNumero().comprobarMayor());
    }
    
    public void buscarMenor(){
        setMenor(getNumero().mostrarMenor());
    }
    
    public void calcularPromedio(){
        setProm(0);
        setProm(getNumero().calcularPromedio());
    }
    
    public void limpiar(){
        numero=new Numero();
        setMayor(0);
        setMenor(0);
        setProm(0);
        setDeshabilitador(true);
    }

    /**
     * @return the numero
     */
    public Numero getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    /**
     * @return the mayor
     */
    public int getMayor() {
        return mayor;
    }

    /**
     * @param mayor the mayor to set
     */
    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    /**
     * @return the menor
     */
    public int getMenor() {
        return menor;
    }

    /**
     * @param menor the menor to set
     */
    public void setMenor(int menor) {
        this.menor = menor;
    }
    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the prom
     */
    public int getProm() {
        return prom;
    }

    /**
     * @param prom the prom to set
     */
    public void setProm(int prom) {
        this.prom = prom;
    }

    /**
     * @return the deshabilitador
     */
    public boolean isDeshabilitador() {
        return deshabilitador;
    }

    /**
     * @param deshabilitador the deshabilitador to set
     */
    public void setDeshabilitador(boolean deshabilitador) {
        this.deshabilitador = deshabilitador;
    }
    
}
