/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Modelo {
    LocalDate fActual,fCaducidad;
    Period diferencia; /* Calcula la direferencia para la fecha*/
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MMM/yyyy");/*Formato de la fecha*/

    public Modelo() {
    }

    public LocalDate getfActual() {
        return fActual;
    }

    public void setfActual(LocalDate fActual) {
        this.fActual = fActual;
    }

    public LocalDate getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(LocalDate fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

    public int diasRestantes() {
        diferencia = Period.between(fCaducidad, fActual);
        return diferencia.getDays();
    }
    
    public String finicialString() {
        return df.format(fActual);
    }

    public String fCaducidadString() {
        return df.format(fCaducidad);
    }
    
    
}
