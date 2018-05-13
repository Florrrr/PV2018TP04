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
public class Ahorcado implements Serializable{
    private String palabraAdivinar;
    private char[] palabraAhorcado;
    private int intentos;
    private String imagen;

    public Ahorcado(String palabraAdivinar, char[] palabraAhorcado, int intentos, String imagen) {
        this.palabraAdivinar = palabraAdivinar;
        this.palabraAhorcado = palabraAhorcado;
        this.intentos = intentos;
        this.imagen = imagen;
    }

    public Ahorcado() {
        //palabraAdivinar="";
        palabraAdivinar=new String();
        palabraAhorcado=new char[10];
        intentos=5;
        imagen="/images/Ahorcado0.png";
    }

    public void empezarJuego(String palabra){
        setPalabraAdivinar(palabra);
        setImagen("/images/Ahorcado0.png");
    }
    
    public ArrayList<String> getPalabraAhorcadoFormato(){
        ArrayList<String> caracteresPalabra=new ArrayList();
        for(int i=0;i<getPalabraAdivinar().length();i++){
            caracteresPalabra.add(String.valueOf(getPalabraAhorcado()[i]));
        }
        return caracteresPalabra;
    }
    
    public boolean buscarLetra(char c){
        boolean encontrado=false;
        for(int i=0;i<getPalabraAdivinar().length();i++){
            if(c==getPalabraAdivinar().charAt(i)){
                encontrado=true;
                palabraAhorcado[i]=c;
            }
        }
        if(encontrado==false){
            setIntentos(getIntentos()-1);
            switch(getIntentos()){
                case 4:{
                    setImagen("/images/Ahorcado1.png");
                    break;
                }
                case 3:{
                    setImagen("/images/Ahorcado2.png");
                    break;
                }
                case 2:{
                    setImagen("/images/Ahorcado3.png");
                    break;
                }
                case 1:{
                    setImagen("/images/Ahorcado4.png");
                    break;
                }
                case 0:{
                    setImagen("/images/Ahorcado5.jpg");
                    break;
                }
            }
        }
        //Sigue switch
        //En este lugar va la seleccion de la imagen
        return encontrado;
    }
    
    public boolean juegoGanado(){
        boolean ganador=true;
        for(int i=0;i<getPalabraAdivinar().length();i++){
            if(getPalabraAdivinar().charAt(i)!=getPalabraAhorcado()[i]){
                ganador=false;
            }
        }
        return ganador;
    }
    
    /**
     * @return the palabraAdivinar
     */
    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    /**
     * @param palabraAdivinar the palabraAdivinar to set
     */
    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    /**
     * @return the palabraAhorcado
     */
    public char[] getPalabraAhorcado() {
        return palabraAhorcado;
    }

    /**
     * @param palabraAhorcado the palabraAhorcado to set
     */
    public void setPalabraAhorcado(char[] palabraAhorcado) {
        this.palabraAhorcado = palabraAhorcado;
    }

    /**
     * @return the intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
