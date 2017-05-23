/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Bean.Form;

import Aplicacion.modelo.dominio.ArregloNumeros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable{
    private ArregloNumeros numero;
    private int ingresaU;
    private int menor;
    private double promedio;

    public NumeroFormBean() {
        numero = new ArregloNumeros();
    }
    
    public void agregar(){
        getNumero().agregar(getIngresaU());
    }
    
    public void menYprom(){
        setMenor(getNumero().menor());
        setPromedio(getNumero().prom());
}

    /**
     * @return the numero
     */
    public ArregloNumeros getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(ArregloNumeros numero) {
        this.numero = numero;
    }

    /**
     * @return the ingresaU
     */
    public int getIngresaU() {
        return ingresaU;
    }

    /**
     * @param ingresaU the ingresaU to set
     */
    public void setIngresaU(int ingresaU) {
        this.ingresaU = ingresaU;
    }

    /**
     * @return the menor
     */
    public int getMenor() {
        return menor;
    }

    /**
     * @param menor the menor to set
     */
    public void setMenor(int menor) {
        this.menor = menor;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
}