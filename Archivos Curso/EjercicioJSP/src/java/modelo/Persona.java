/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Persona {

    String nombre;    
    int edad, faltantes;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFaltantes() {
        faltantes = 100 - edad;
        return faltantes;
    }

    public void setFaltantes(int faltantes) {
        this.faltantes = faltantes;
    }
    
    

}
