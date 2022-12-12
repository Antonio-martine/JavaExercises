/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

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

    private Pelicula[] listPeliculas = {
        new Pelicula(1, "Wakanda Forever", "Accion", 2022),
        new Pelicula(2, "Start Wars", "Ciencia ficción", 1977),
        new Pelicula(3, "El padrino", "Drama", 1973),
        new Pelicula(4, "Volver al futuro", "Ciencia ficción", 1985),
        new Pelicula(5, "Hereditary", "Terror", 2018),
    };
    
    public PeliculaBeans() {
    }

    public Pelicula[] getListPeliculas() {
        return listPeliculas;
    }

    public void setListPeliculas(Pelicula[] listPeliculas) {
        this.listPeliculas = listPeliculas;
    }
    
    
}
