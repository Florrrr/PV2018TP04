/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.Grado;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author CX
 */
@ManagedBean
@ViewScoped
public class GradoFormBean implements Serializable{
    private Grado grado;
    private double gradoIngresado;
    private String nombreGrado;
    private double res;
    private boolean des;
    private boolean c;
    private boolean f;
    private boolean k;
    private String aux;
    
    /**
     * Creates a new instance of GradoFormBean
     */
    public GradoFormBean() {
        grado=new Grado();
        nombreGrado=new String();
        des=true;
        c=true;
        k=true;
        f=true;
    }
    
    public void empezarConvertidor(){
        getGrado().iniciarConversion(getGradoIngresado());
        setAux(String.valueOf(getGradoIngresado()));
        setDes(false);
    }
    
    public void seleccionarGrados(int a){
        switch(a){
            case 1:{
                setNombreGrado("°C");
                setAux(getAux()+" °C");
                setF(false);
                setK(false);
                break;
            }
            case 2:{
                setNombreGrado("°F");
                setAux(getAux()+" °F");
                setC(false);
                setK(false);
                break;
            }
            case 3:{
                setNombreGrado("K");
                setAux(getAux()+" K");
                setC(false);
                setF(false);
                break;
            }
        }
    }
    
    public void convertirGrados(int a){
        switch(a){
            case 1:{
                if("°F".equals(getNombreGrado())){
                    setRes(getGrado().convertirFahrenheitCelcius());
                    setNombreGrado("°C");
                }
                else{
                    setRes(getGrado().convertirKelvinCelcius());
                    setNombreGrado("K");
                }
                break;
            }
            case 2:{
                if("°C".equals(getNombreGrado())){
                    setRes(getGrado().convertirCelciusFahrenheit());
                    setNombreGrado("°F");
                }
                else{
                    setRes(getGrado().convertirKelvinFahrenheit());
                    setNombreGrado("K");
                }
                break;
            }
            case 3:{
                if("°C".equals(getNombreGrado())){
                    setRes(getGrado().convertirCelciusKelvin());
                    setNombreGrado("K");
                }
                else{
                    setRes(getGrado().convertirFahrenheitKelvin());
                    setNombreGrado("K");
                }
                break;
            }
        }
    }
    
    public void reiniciar(){
        setRes(0);
        setNombreGrado("");
        setDes(true);
        setC(true);
        setF(true);
        setK(true);
        setAux("");
    }

    /**
     * @return the grado
     */
    public Grado getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    /**
     * @return the gradoIngresado
     */
    public double getGradoIngresado() {
        return gradoIngresado;
    }

    /**
     * @param gradoIngresado the gradoIngresado to set
     */
    public void setGradoIngresado(double gradoIngresado) {
        this.gradoIngresado = gradoIngresado;
    }

    /**
     * @return the nombreGrado
     */
    public String getNombreGrado() {
        return nombreGrado;
    }

    /**
     * @param nombreGrado the nombreGrado to set
     */
    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
    }

    /**
     * @return the res
     */
    public double getRes() {
        return res;
    }

    /**
     * @param res the res to set
     */
    public void setRes(double res) {
        this.res = res;
    }

    /**
     * @return the des
     */
    public boolean isDes() {
        return des;
    }

    /**
     * @param des the des to set
     */
    public void setDes(boolean des) {
        this.des = des;
    }

    /**
     * @return the aux
     */
    public String getAux() {
        return aux;
    }

    /**
     * @param aux the aux to set
     */
    public void setAux(String aux) {
        this.aux = aux;
    }

    /**
     * @return the c
     */
    public boolean isC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(boolean c) {
        this.c = c;
    }

    /**
     * @return the f
     */
    public boolean isF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(boolean f) {
        this.f = f;
    }

    /**
     * @return the k
     */
    public boolean isK() {
        return k;
    }

    /**
     * @param k the k to set
     */
    public void setK(boolean k) {
        this.k = k;
    }
    
}
