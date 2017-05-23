/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Bean.Form;

import Aplicacion.modelo.datos.ColeccionCirculo;
import Aplicacion.modelo.dominio.Circulo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class CirculoFormBean implements Serializable{
    private ColeccionCirculo circ;
    private double radio;
    private Circulo circulo;
    

    /**
     * Creates a new instance of CirculoFormBean
     */
    public CirculoFormBean() {
        circ = new ColeccionCirculo();
    }

  
   
    public void agregarCirculo(){
        circulo = new Circulo(getRadio());
        circ.agregarCirculo(circulo);
    }
  public CirculoFormBean(ColeccionCirculo circ, double radio, Circulo circulo) {
        this.circ = circ;
        this.radio = radio;
        this.circulo = circulo;
    }
    /**
     * @return the Circ
     */
    public ColeccionCirculo getCirc() {
        return circ;
    }

    /**
     * @param Circ the Circ to set
     */
    public void setCirc(ColeccionCirculo Circ) {
        this.circ = Circ;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the circulo
     */
    public Circulo getCirculo() {
        return circulo;
    }

    /**
     * @param circulo the circulo to set
     */
    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }
    

    
}
