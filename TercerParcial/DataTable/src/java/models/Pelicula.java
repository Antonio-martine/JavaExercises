
package models;

/*
 * @author Antonio
 */
public class Pelicula {
    private int idPelicula;
    private String titulo;
    private String genero;
    private int añoEstreno;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, String titulo, String genero, int añoEstreno) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.genero = genero;
        this.añoEstreno = añoEstreno;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
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

