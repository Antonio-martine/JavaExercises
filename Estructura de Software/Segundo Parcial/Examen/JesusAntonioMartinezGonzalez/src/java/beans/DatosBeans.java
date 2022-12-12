/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class DatosBeans {

    private double minuto_jugado;
    private int puntos_minuto,puntos_gol,asistencia,total;
    private String gol,premio;

    public DatosBeans() {
    }

    public double getMinuto_jugado() {
        return minuto_jugado;
    }

    public void setMinuto_jugado(double minuto_jugado) {
        this.minuto_jugado = minuto_jugado;
    }

    public int getPuntos_minuto() {
        if(getMinuto_jugado() < 1){
            puntos_minuto = 0;
        }
        if(getMinuto_jugado() > 0 && getMinuto_jugado() <= 500){
            puntos_minuto = 10; 
        }
        if(getMinuto_jugado() > 500 && getMinuto_jugado() <= 1000){
            puntos_minuto = 25; 
        }
        if(getMinuto_jugado() > 1000 ){
            puntos_minuto = 50; 
        }
        return puntos_minuto;
    }

    public void setPuntos_minuto(int puntos_minuto) {
        this.puntos_minuto = puntos_minuto;
    }

    public String getGol() {
        return gol;
    }

    public void setGol(String gol) {
        this.gol = gol;
    }

    public int getPuntos_gol() {
        if("10_o+".equals(getGol())){
            puntos_gol = 50;
        }
        if("5-9".equals(getGol())){
            puntos_gol = 25;
        }
        if("-5".equals(getGol())){
            puntos_gol = 10;
        }
        return puntos_gol;
    }

    public void setPuntos_gol(int puntos_gol) {
        this.puntos_gol = puntos_gol;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        if(asistencia < 0){
            asistencia = 0;
        }
        this.asistencia = asistencia;
    }

    public int getTotal() {
        total = getPuntos_minuto()+getPuntos_gol()+getAsistencia();
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getPremio() {
        if(getTotal() > 0 && getTotal() <= 20){
            premio = "Gallo de Bronce"; 
        }
        if(getTotal() > 20 && getTotal() <= 99){
            premio = "Gallo de plata"; 
        }
        if(getTotal() > 100 ){
            premio = "Gallo de Oro"; 
        }
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
    
}
