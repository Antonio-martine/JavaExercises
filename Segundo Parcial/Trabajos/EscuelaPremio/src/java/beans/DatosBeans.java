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

    private String name,institution,municipality,ageMenssage,serviceMenssage,municipalityMenssage;
    private int edad,service;
    
    public DatosBeans() {
    }

    /*Age*/
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /*Service*/
    public int getService() {
        if(getEdad() < 19 || getEdad()> 69){
            service = 0;
        }
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }
    
    /*Name*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /*Institution*/
    public String getInstitution() {
        institution = "Escuela Ronaldo Calles";
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
    
    /*Municipality*/
    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    /*AgeMessange*/
    public String getAgeMenssage() {
        if(getEdad() < 19 || getEdad() > 69){
            ageMenssage = "° Error de edad, no podrias estar registrado en la institución como maestro";   
        }
        if(getEdad() > 50 && getEdad() < 70){
            ageMenssage = "° Felicidade! Ganaste un bono de $5000";
        }
        return ageMenssage;
    }

    public void setAgeMenssage(String ageMenssage) {
        this.ageMenssage = ageMenssage;
    }

    /*ServiceMenssage*/

    public String getServiceMenssage() {
        /*Checar*/
        if(getService() < 1){
            serviceMenssage = "";
        }
        if(getService() >= getEdad()){
            serviceMenssage = "°Error, la edad no puede ser menor o igual al servicio";
        }else{
            if(getService() >0 && getService() < 41){
            serviceMenssage = "° Tu bono por tu servicio es de: $"+getService()*1000;
            }
            if(getService() > 40){
            serviceMenssage = "° Error, no puedes tener mas de 40 años de servicio";
            }
        }
        return serviceMenssage;
    }

    public void setServiceMenssage(String serviceMenssage) {
        this.serviceMenssage = serviceMenssage;
    }
    
    /*municipalityMenssage*/

    public String getMunicipalityMenssage() {
        if("San Juan del Rio".equals(getMunicipality()) && getService() > 0 || "Tequisquiapan".equals(getMunicipality()) && getService() > 0){
            municipalityMenssage = "° Felicidades tienes un bono extra de: $1000";
        }
        return municipalityMenssage;
    }

    public void setMunicipalityMenssage(String municipalityMenssage) {
        this.municipalityMenssage = municipalityMenssage;
    }
    
}

