/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package areaCirculoBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jesus
 */
@ManagedBean
@RequestScoped
public class AreaBean {
    /*Atributos*/
    double pi,radio,total;
    
    public AreaBean() {
        
    }

    public double getPi() {
        pi=3.1416;
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getTotal() {
        total=pi*(radio*radio);
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
