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
public class DatosBens {

    private String nombre, sexo, municipio,mensaje;
    private int edad;
    private int ayudaEconomica;
    
    public DatosBens() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAyudaEconomica() {
        if("Mujer".equals(getSexo())){
            if(getEdad()>=18 && getEdad()<=45){    
                ayudaEconomica = 2500;
            }
            if(getEdad()>=46){
                ayudaEconomica = 5000;
            }
        }
        if("Hombre".equals(getSexo())){
            if(getEdad()>=16 && getEdad()<=50){
                ayudaEconomica = 2000;
            }
            if(getEdad()>=51){
                ayudaEconomica = 4500;
            }
        }
        if("sanjuandelrio".equals(getMunicipio()) && ayudaEconomica >0){
            ayudaEconomica = ayudaEconomica+500;
        }
        return ayudaEconomica;
    }

    public void setAyudaEconomica(int ayudaEconomica) {
        this.ayudaEconomica = ayudaEconomica;
    }

    public String getMensaje() {
        if(getAyudaEconomica() == 0){
            mensaje = "La edad no corresponde a ningun nivel de ayuda ";
        }
        if(getAyudaEconomica() > 0){
            if("sanjuandelrio".equals(getMunicipio())){
                mensaje = "Datos exitosos, se agregaron $500 pesos adicionales por ser de San Juan del Río";
            }
            else{
            mensaje = "Datos exitosos ";
            }
        }
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
    
}
