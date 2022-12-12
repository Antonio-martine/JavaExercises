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
public class DatosBeans {

    private String name,poliza,datos;
    private int cuota,cargo,edad;
    
    public DatosBeans() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public int getCuota() {
        if("A - Amplia".equals(getPoliza())){
            cuota = 1200;
        }
        if("B - Daños a terceros".equals(getPoliza())){
            cuota = 950;
        }
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public int getCargo() {
        if("Alcohol".equals(getDatos()) && getEdad()<=40){
            cargo = (int) (getCuota()*1.10);
        }
        if("Lentes".equals(getDatos()) && getEdad()<=40){
            cargo = (int) (getCuota()*1.05);
        }
        if("Enfermedad".equals(getDatos()) && getEdad()<=40){
            cargo = (int) (getCuota()*1.05);
        }
        if("Ninguno".equals(getDatos()) && getEdad()<=40){
            cargo = (int) (getCuota()*1.10);
        }
        if(getEdad()>40 && "Ninguno".equals(getDatos()) || getEdad()>40 && "Enfermedad".equals(getDatos()) || getEdad()>40 && "Lentes".equals(getDatos()) || getEdad()>40 && "Alcohol".equals(getDatos())){
            cargo = (int) (getCuota()*1.20);
        }
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
