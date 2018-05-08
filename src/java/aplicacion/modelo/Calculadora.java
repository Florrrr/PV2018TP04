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
public class Calculadora implements Serializable {

    public Calculadora() {
    }
    
    public int sumar (int n1, int n2){
        return n1+n2;
    }
    public int restar (int n1, int n2) {
        return n1-n2;
    }
    public int multuplicar (int n1, int n2) {
        return n1*n2;
    }
    public int dividir (int n1, int n2) {
        return n1/n2;
        
    }
}
