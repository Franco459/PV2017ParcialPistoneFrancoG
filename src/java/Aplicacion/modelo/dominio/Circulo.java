/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.modelo.dominio;

/**
 *
 * @author Alumno
 */
public class Circulo{
  private double radio;
  private double per;
  private double sup;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.per = 2*radio;
        this.sup = (radio*radio)*3.14;
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
     * @return the per
     */
    public double getPer() {
        return per;
    }

    /**
     * @param per the per to set
     */
    public void setPer(double per) {
        this.per = per;
    }

    /**
     * @return the sup
     */
    public double getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(double sup) {
        this.sup = sup;
    }
  
  
    
}
