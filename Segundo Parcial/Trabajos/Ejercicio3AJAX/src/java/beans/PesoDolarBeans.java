/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jesus
 */
@ManagedBean
@RequestScoped
public class PesoDolarBeans {
    
    private String peso,dolar,peso1,dolar1;
    
    public PesoDolarBeans() {
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getDolar() {
        return dolar;
    }

    public void setDolar(String dolar) {
        double d = 0;
        try{
            d = Double.parseDouble(dolar);
        } catch(NumberFormatException e){
            peso = "";
        }
        if(d > -1){
            double p = (d) * (20.13);
            peso = String.valueOf(p);
        }
        if(d < 0){
            peso = "Error, no se puede convertir este valor";
        }
        this.dolar = dolar;
    }

    public String getPeso1() {
        return peso1;
    }

    public void setPeso1(String peso1) {
        double p1 = 0;
        try{
            p1 = Double.parseDouble(peso1);
        } catch(NumberFormatException e){
            dolar1 = "";
        }
        if(p1 > -1){
            double d1 = (p1) / (20.13);
            dolar1 = String.valueOf(d1);
        }
        if(p1 < 0){
            dolar1 = "Error, no se puede convertir este valor";
        }
        this.peso1 = peso1;
    }

    public String getDolar1() {
        return dolar1;
    }

    public void setDolar1(String dolar1) {
        this.dolar1 = dolar1;
    }
    
    
     
}
