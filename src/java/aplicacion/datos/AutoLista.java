/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.modelo.Auto;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CX
 */
public class AutoLista implements Serializable{
    private ArrayList<Auto> autos;

    public AutoLista(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public AutoLista() {
        autos=new ArrayList();
    }
    
    public void agregarAutos (Auto unAuto){
        getAutos().add(unAuto);
    }

    public void modificarAutos(Auto unAuto){
        for (Auto a: autos){
            if (a.getPatente()== unAuto.getPatente()){
                getAutos().set(autos.indexOf(a), unAuto);
                break;
            }
            
        }
    }
    
    public void eliminarAutos(Auto unAuto){
        for(Auto a:autos){
            if(a.getPatente()==unAuto.getPatente()){
                autos.remove(autos.indexOf(a));
                break;
            }
        }
    }
    
    
    
    /**
     * @return the autos
     */
    public ArrayList<Auto> getAutos() {
        return autos;
    }

    /**
     * @param autos the autos to set
     */
    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
}
