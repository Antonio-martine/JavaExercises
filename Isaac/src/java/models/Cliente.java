/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author personas
 */


public class Cliente {
    
    //ATRIBUTOS
    private int idClientes;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    
    
    //COSNTRUCTOR VACIO
    public Cliente(){
    }
    
    //CONSTRUCTOR CON ARGUMENTOS
    public Cliente(int idClientes, String nombre, String apellidos, String email, String telefono) {
        this.idClientes = idClientes;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }
    
    //MÉTODOS DE ACCESO (GETTER AND SETTERS)

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
