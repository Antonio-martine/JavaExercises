/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package bens;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 *
 * @author jesus
 */
@ManagedBean
@RequestScoped
public class EmpleadoBens {
    private String idEmpleado; //Debe tener 5 caracteres
    private String nombreEmpleado; //Debe ser solo letras y espacios
    private double sueldo; //Debe ser mayor ...
    private int mesesContratados; // Debe ser mayor a 3
    private String gmail; //Correo valido
    
    private final double SUELDOMINIMO = 1000.00;
            
    public EmpleadoBens() {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String empleado) {
        this.idEmpleado = empleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getMesesContratados() {
        return mesesContratados;
    }

    public void setMesesContratados(int mesesContratados) {
        this.mesesContratados = mesesContratados;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    
    public void validarSueldo(FacesContext context, UIComponent componet, Object value){
        double sueldo = Double.valueOf((Double) value);
        
        if(sueldo < SUELDOMINIMO){
            FacesMessage mensaje = new FacesMessage("El tanto del sueldo " + "no puede ser a: " + SUELDOMINIMO);
        }
        
    } 
}
