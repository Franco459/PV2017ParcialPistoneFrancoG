/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.modelo.datos;

import Aplicacion.modelo.dominio.Circulo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ColeccionCirculo implements Serializable{
    private ArrayList<Circulo> circ;

    public ColeccionCirculo() {
        circ = new ArrayList();
    }
    
    public void agregarCirculo(Circulo unCirculo){
        getCirc().add(unCirculo);
    }

   
    /**
     * @return the circ
     */
    public ArrayList<Circulo> getCirc() {
        return circ;
    }

    /**
     * @param circ the circ to set
     */
    public void setCirc(ArrayList<Circulo> circ) {
        this.circ = circ;
    }
    
    
    
}
