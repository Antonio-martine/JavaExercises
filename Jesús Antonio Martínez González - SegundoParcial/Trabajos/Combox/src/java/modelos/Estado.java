/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import javax.faces.model.SelectItem;

/**
 *
 * @author jesus
 */
public class Estado {
//atributos
    private String estado;
    private SelectItem[] municipios;
//constructor
    public Estado(String estado, SelectItem... municipios) {
    this.estado = estado;
    this.municipios = municipios;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public SelectItem[] getMunicipios() {
        return municipios;
    }

    public void setMunicipios(SelectItem[] municipios) {
        this.municipios = municipios;
    }  
    
    /*checar*/
 //variable para asignar datos
    private static Estado[] municipiosEstado =
        {new Estado("Querétaro",
            new SelectItem("SJR","San Juan del Río"),
            new SelectItem("TX","Tequisquiapan"),
            new SelectItem("EM","Ezequiel Montes")),
        new Estado("Guanajuato",
            new SelectItem("CE","Celaya"),
            new SelectItem("LE","León"),
            new SelectItem("IR","Irapuato"),
            new SelectItem("GT","Guanajuato")),
        new Estado("Michoacán",
        new SelectItem("MO","Morelia"),
        new SelectItem("PA","Patzcuaro"))
    };
    
    public static Estado[] getMunicipiosEstado() {
        return municipiosEstado;
    }
}
