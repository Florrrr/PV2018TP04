/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.Ahorcado;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author CX
 */
@ManagedBean
@ViewScoped
public class AhorcadoFormBean implements Serializable{
    private Ahorcado ahorcado;
    private char letraIngresada;
    private String palabraIngresada;
    private boolean componenteDeshabilitador;
    /**
     * Creates a new instance of AhorcadoFormBean
     */
    public AhorcadoFormBean() {
        ahorcado=new Ahorcado();
        componenteDeshabilitador=false;
    }

    public void empezarJuego(){
        getAhorcado().empezarJuego(palabraIngresada);
        setComponenteDeshabilitador(true);
        FacesContext facesContext=FacesContext.getCurrentInstance();
        //Captura los objetos de la vista desde la instancia actual
        facesContext.addMessage(null,new 
        FacesMessage(FacesMessage.SEVERITY_INFO,"Juego iniciado","Suerte"));//Muestra mensaje cde informacion, se cambia cacon el severity
    }
    
    public void controlarLetra(){
        boolean letraEncontrada=getAhorcado().buscarLetra(letraIngresada);
        FacesContext facesContext=FacesContext.getCurrentInstance();
        if(letraEncontrada==true){
            if(getAhorcado().juegoGanado()==true){
                facesContext.addMessage(null,new 
                FacesMessage(FacesMessage.SEVERITY_FATAL,"Fin del juego","Ganaste"));
            } 
        }
        else{
            if(getAhorcado().getIntentos()==0){
                facesContext.addMessage(null,new 
                FacesMessage(FacesMessage.SEVERITY_ERROR,"Fin del juego","Perdiste"));
                nuevoJuego();
            }
        }
    }
    
    public void nuevoJuego(){
        setComponenteDeshabilitador(false);
        setPalabraIngresada(new String());
        setAhorcado(new Ahorcado());
    }
    
    /**
     * @return the ahorcado
     */
    public Ahorcado getAhorcado() {
        return ahorcado;
    }

    /**
     * @param ahorcado the ahorcado to set
     */
    public void setAhorcado(Ahorcado ahorcado) {
        this.ahorcado = ahorcado;
    }

    /**
     * @return the letraIngresada
     */
    public char getLetraIngresada() {
        return letraIngresada;
    }

    /**
     * @param letraIngresada the letraIngresada to set
     */
    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }

    /**
     * @return the palabraIngresada
     */
    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    /**
     * @param palabraIngresada the palabraIngresada to set
     */
    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    /**
     * @return the componenteDeshabilitador
     */
    public boolean isComponenteDeshabilitador() {
        return componenteDeshabilitador;
    }

    /**
     * @param componenteDeshabilitador the componenteDeshabilitador to set
     */
    public void setComponenteDeshabilitador(boolean componenteDeshabilitador) {
        this.componenteDeshabilitador = componenteDeshabilitador;
    }
    
}
