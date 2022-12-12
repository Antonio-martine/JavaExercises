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
public class ButtonBeans {
    
    private int contador = -2;
    private String resultado, borrar="borrar";
    
    public ButtonBeans() {
    }

    public int getContador() {
        contador = contador + 1;
        return contador;
    }

    public void setContador(int contador) {       
        this.contador = contador;
    }

    public String getResultado() {
        resultado = "Has presionado el botón "+getContador()+" veces";
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getBorrar() {
        return borrar;
    }

    public void setBorrar(String borrar) {
        this.borrar = borrar;
    }
    
    
    
    
    
    
}
