/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo;

import java.io.Serializable;

/**
 *
 * @author CX
 */
public class Grado implements Serializable{
    private double grado;
    
    public void iniciarConversion(double g){
        setGrado(g);
    }
    
    public double convertirCelciusFahrenheit(){
        return (getGrado()*1.8)+32;
    }
    
    public double convertirCelciusKelvin(){
        return getGrado()+273.15;
    }
    
    public double convertirFahrenheitCelcius(){
        return ((getGrado()-32)/(1.8));
    }
    
    public double convertirFahrenheitKelvin(){
        return ((getGrado()+459.67)*5/9);
    }
    
    public double convertirKelvinCelcius(){
        return getGrado()-273.15;
    }
    
    public double convertirKelvinFahrenheit(){
        return 1.8*(getGrado()-273)+32;
    }

    public Grado() {
    }

    public Grado(double grado) {
        this.grado = grado;
    }

    /**
     * @return the grado
     */
    public double getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(double grado) {
        this.grado = grado;
    }
    
}
