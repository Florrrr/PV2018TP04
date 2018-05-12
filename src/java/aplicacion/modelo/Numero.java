/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CX
 */
public class Numero implements Serializable{
    private ArrayList<Integer> numeros;
    private int mayor;
    private int menor;
    private int promedio;

    public Numero(ArrayList<Integer> numeros, int mayor, int menor, int promedio) {
        this.numeros = numeros;
        this.mayor = mayor;
        this.menor = menor;
        this.promedio = promedio;
    }
    
    public Numero() {
        numeros=new ArrayList();
    }

    public void agregarNumeros(int unNumero){
        getNumeros().add(unNumero);
    }
    
    public int comprobarMayor(){
        setMayor(getNumeros().get(0));
        for(int i=0;i<getNumeros().size();i++){
            if(mayor<getNumeros().get(i))
                mayor=getNumeros().get(i);
        }
        return mayor;
    }
    
    public int mostrarMenor(){
        setMenor(getNumeros().get(0));
        for(int i=0;i<getNumeros().size();i++){
            if(menor>getNumeros().get(i))
                menor=getNumeros().get(i);
        }
        return menor;
    }
    
    public int calcularPromedio(){
        setPromedio(0);
        int i;
        for(i=0;i<getNumeros().size();i++){
            setPromedio(getPromedio() + getNumeros().get(i));
        }
        setPromedio(getPromedio()/i);
        return getPromedio();
    }

    /**
     * @return the numeros
     */
    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
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
     * @return the promedio
     */
    public int getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
}