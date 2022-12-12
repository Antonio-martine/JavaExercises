/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import models.Pelicula;

/**
 *
 * @author jesus
 */
@ManagedBean
@RequestScoped
public class PeliculaBeans {

    private Pelicula[] listaPeliculas = {
        new Pelicula(1,"Wakanda Forever","Accion",2022),
        new Pelicula(2,"Start Wars","Ciencia ficción",1977),
        new Pelicula(3,"El padrino","Drama",1973),
        new Pelicula(4,"Volver al fututo","Ciencia ficción",1985),
        new Pelicula(5,"Hereditary","Terror",2018)
    };
    
    
    public PeliculaBeans() {
    }

    public Pelicula[] getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(Pelicula[] listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }   
}
