/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author jesus
 */
public class Pelicula {
    
    private int idPeliculas;
    private String titulo;
    private String genero;
    private int añoEstreno;
    
    /*Constructor Vacio*/
    public Pelicula() {
    }

    public Pelicula(int idPeliculas, String titulo ,String genero ,int añoEstreno ) {
        this.idPeliculas = idPeliculas;
        this.titulo = titulo;
        this.genero = genero;
        this.añoEstreno = añoEstreno;
    }

    public int getIdPeliculas() {
        return idPeliculas;
    }

    public void setIdPeliculas(int idPeliculas) {
        this.idPeliculas = idPeliculas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }


    
}
