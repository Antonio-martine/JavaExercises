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
public class DatosBoletosBeans {

    private String nombre, zona, evento, mensaje;
    private int boleto;
    
    
    public DatosBoletosBeans() {
    }

    public String getNombre() {
        if(getBoleto() < 1){
            nombre = "";
        }
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBoleto() {
        return boleto;
    }

    public void setBoleto(int boleto) {
        this.boleto = boleto;
    }

    public String getZona() {
        if(getBoleto() < 1){
            zona="";
        }
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }  

    public String getEvento() {
        if(getBoleto()<1){
            evento = "";
        }
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
   
    public String getMensaje() {
        if(getBoleto() < 1){
            mensaje = "Error, no se puede realizar su compra, intente de nuevo";
        }
        else{
            if("preferente".equals(getZona())){
                if("futbol".equals(getEvento())){
                    mensaje = "Su total es de: $"+getBoleto()*250;
                }
                if("concierto".equals(getEvento())){
                    mensaje = "Su total es de: $"+getBoleto()*900;
                }
                if("baile".equals(getEvento())){
                    mensaje = "Su total es de: $"+getBoleto()*120;
                }
            }
            if("general".equals(getZona())){
                if("futbol".equals(getEvento())){
                    mensaje = "Su total es de: $"+getBoleto()*150;
                }
                if("concierto".equals(getEvento())){
                    mensaje = "Su total es de: $"+getBoleto()*500;
                }
                if("baile".equals(getEvento())){
                    mensaje = "Su total es de: $"+getBoleto()*80;
                }
            }
        }
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}
