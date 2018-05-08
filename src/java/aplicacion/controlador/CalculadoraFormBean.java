/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author CX
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable {
    private String mantisa;
    private Calculadora calculadora;

    public CalculadoraFormBean(String mantisa, Calculadora calculadora) {
        this.mantisa = mantisa;
        this.calculadora = calculadora;
    }
    /**
     * Creates a new instance of CalculadoraFormBean
     */
    public CalculadoraFormBean() {
        mantisa= new String ();
        calculadora= new Calculadora(); //tamos creando las variables
    }
    public void realizarOperacion(){
        int n1=0;
        int n2=0;
        if(mantisa.charAt(0)=='/'||mantisa.charAt(0)=='*'){
            setMantisa(new String());
            mantisa="Sintax Error";
        }
        else{
        char operadorSeleccionado=' ';
        for (int i=0;i<mantisa.length();i++){
            char caracterExtraido= mantisa.charAt(i);
            if((caracterExtraido=='+'&&i!=0)||(caracterExtraido=='-'&&i!=0)||caracterExtraido=='*'||caracterExtraido=='/'){
                n1= Integer.parseInt(mantisa.substring(0,i)); //cortandp y transformando a int
                n2= Integer.parseInt(mantisa.substring(i+1));
                operadorSeleccionado= caracterExtraido;
            }
        }
        int resultadoOperacion=0;
        switch (operadorSeleccionado){
            case '+': {
                resultadoOperacion= calculadora.sumar(n1, n2);
                break;
            }
            case '-': {
                resultadoOperacion= calculadora.restar(n1, n2);
                break;}
            case '*': {
                resultadoOperacion= calculadora.multuplicar(n1, n2);
                break;}
            case '/': {
                resultadoOperacion= calculadora.dividir(n1, n2);
                break;}
            
            }
            mantisa = mantisa + "="+resultadoOperacion;}
        }
    public void registrarValorBoton (){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String valorSeleccionado= facesContext.getExternalContext().getRequestParameterMap().get("valorPresionado");
        mantisa= mantisa + valorSeleccionado;
    }
    public void borrarDatos(){
        calculadora=new Calculadora();
        setMantisa(new String());
    }    
    
    

    /**
     * @return the mantisa
     */
    public String getMantisa() {
        return mantisa;
    }

    /**
     * @param mantisa the mantisa to set
     */
    public void setMantisa(String mantisa) {
        this.mantisa = mantisa;
    }

    /**
     * @return the calculadora
     */
    public Calculadora getCalculadora() {
        return calculadora;
    }

    /**
     * @param calculadora the calculadora to set
     */
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    
}
