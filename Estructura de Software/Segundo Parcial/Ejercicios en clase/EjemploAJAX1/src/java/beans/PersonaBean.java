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
public class PersonaBean {
private String nombrePersona;
    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    /*Retorna un saludo*/
    public String verSaludo(){
        if ("".equals(nombrePersona) || nombrePersona==null){
            return "";
        }else{
            return "Hola "+nombrePersona; 
        }
    }
    
    
}
