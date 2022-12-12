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
    
    private String nombre,domicilio, password, genero,estadoprocedencia;
    private String[] lenguaje; //Arreglo
    
    public DatosBeans() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoprocedencia() {
        return estadoprocedencia;
    }

    public void setEstadoprocedencia(String estadoprocedencia) {
        this.estadoprocedencia = estadoprocedencia;
    }

    public String[] getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String[] lenguaje) {
        this.lenguaje = lenguaje;
    }
 
    //Método para extraer los metodos de lenguaje para imprimir
   public String getLenguajesString(){
       String lenguaje = "";
       for(int i=0;i<this.lenguaje.length;i++){
           lenguaje += this.lenguaje[i]+", ";
       }
       return lenguaje;
       
   }
    
}
