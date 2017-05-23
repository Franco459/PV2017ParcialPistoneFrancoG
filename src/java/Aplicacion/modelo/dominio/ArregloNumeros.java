/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ArregloNumeros implements Serializable {
    private ArrayList<Integer> numero;
    private String text;
   
    

    public ArregloNumeros() {
        numero = new ArrayList();
    }

    public ArregloNumeros(ArrayList<Integer> numero) {
        this.numero = numero;
    }
    
    public void agregar(int num){
        getNumero().add(num);
        setText(getNumero().toString());
    }
    
    public double prom() {
    int i;
    double promedio;
    promedio = 0;
        for (i=0;i< getNumero().size();i++){
            promedio = promedio+ getNumero().get(i);
    }
        promedio=promedio/numero.size();
    return promedio;
}
    public int menor(){
        int i=0;
        int menor = numero.get(i);
            for (i=0;i<getNumero().size();i++){
              if (getNumero().get(i)< menor) {
                  menor = getNumero().get(i);
              } 
        }
        return menor;
    }
    

    /**
     * @return the numero
     */
    public ArrayList<Integer> getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(ArrayList<Integer> numero) {
        this.numero = numero;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
  

    }

    
    
    
    

