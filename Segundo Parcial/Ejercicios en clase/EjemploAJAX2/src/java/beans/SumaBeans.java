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
public class SumaBeans {

    /*Atributos*/
    private int num1,num2,total;
    
    public SumaBeans() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    /*Metodo*/
    public String sumar(){
        if(num1 == 0 && num2 == 0){
        return "";
        }else{
            total = num1+num2;
        }
        return "El resultado es: "+total;
    }
}
