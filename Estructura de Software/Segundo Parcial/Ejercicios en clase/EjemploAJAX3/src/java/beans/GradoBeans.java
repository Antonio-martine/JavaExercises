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
public class GradoBeans {

    private String f = "";
    private String c = "";
    
    public GradoBeans() {
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        double f1= -500;
        try{
            f1 = Double.parseDouble(f);
        } catch(NumberFormatException e){
            c = "";
        }
        if(f1 >= -459.4){
            double c1 = (f1-32) * (5.0/9.0);
            c = String.valueOf(c1);
        }
        this.f = f;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
    
    
}
