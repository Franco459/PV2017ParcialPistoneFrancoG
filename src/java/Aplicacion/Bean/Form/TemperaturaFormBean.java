/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Bean.Form;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class TemperaturaFormBean implements Serializable{
    private double ing;
    private String temp;
    private String conver;
    private ArrayList<String> tipo;

    public TemperaturaFormBean(double ing, String temp, String conver, ArrayList<String> tipo) {
        this.ing = ing;
        this.temp = temp;
        this.conver = conver;
        this.tipo = tipo;
    }
    
    
    public TemperaturaFormBean(){
        ing=0;
        temp="";
        tipo= new ArrayList();
        tipo.add("Fahrenheit");
        tipo.add("°F");
        tipo.add("Celsius");
        tipo.add("°C");
    }
    
    public void calculoFar(){
        if(getTemp().equals("Fahrenheit") || getTemp().equals("°F")){
                setConver("En Celsius: " + ((getIng()-32)/1.8));
        }
        else{if (getTemp().equals("Celsius") || getTemp().equals("°C")){
            setConver("En Fahrenheit: " + (1.8*(getIng()+32)));
        }        
        }    
    }
    

    /**
     * @return the ing
     */
    public double getIng() {
        return ing;
    }

    /**
     * @param ing the ing to set
     */
    public void setIng(double ing) {
        this.ing = ing;
    }

    /**
     * @return the temp
     */
    public String getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(String temp) {
        this.temp = temp;
    }

    /**
     * @return the conver
     */
    public String getConver() {
        return conver;
    }

    /**
     * @param conver the conver to set
     */
    public void setConver(String conver) {
        this.conver = conver;
    }

    /**
     * @return the tipo
     */
    public ArrayList<String> getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }
 
    
    
    
}
