/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author antonio
 */
@ManagedBean
@RequestScoped
public class DatosIngresoBeans {

    private double ingreso;
    private int puntosIngreso,puntosHijos,puntosEstudio,total,monto;
    private String hijos,estudios;
    
    public DatosIngresoBeans() {
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public int getPuntosIngreso() {
        if(getIngreso() < 1){
            puntosIngreso = 0;
        }
        if(getIngreso() > 0 && getIngreso() <= 1000){
            puntosIngreso = 50; 
        }
        if(getIngreso() > 1000 && getIngreso() <= 5000){
            puntosIngreso = 25; 
        }
        if(getIngreso() > 5000 ){
            puntosIngreso = 10; 
        }
        return puntosIngreso;
    }

    public void setPuntosIngreso(int puntosIngreso) {
        this.puntosIngreso = puntosIngreso;
    }

    public String getHijos() {
        return hijos;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

    public int getPuntosHijos() {
        if("1".equals(getHijos())){
            puntosHijos = 10;
        }
        if("2".equals(getHijos())){
            puntosHijos = 25;
        }
        if("+3".equals(getHijos())){
            puntosHijos = 50;
        }
        return puntosHijos;
    }

    public void setPuntosHijos(int puntosHijos) {
        this.puntosHijos = puntosHijos;
    }

    public int getPuntosEstudio() {
        if("primaria".equals(getEstudios())){
            puntosEstudio = 50;
        }
        if("secundaria".equals(getEstudios())){
            puntosEstudio = 25;
        }
        if("bachillerato".equals(getEstudios())){
            puntosEstudio = 10;
        }
        if("licenciatura".equals(getEstudios())){
            puntosEstudio = 5;
        }
        return puntosEstudio;
    }

    public void setPuntosEstudio(int puntosEstudio) {
        this.puntosEstudio = puntosEstudio;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
    
    public int getTotal() {
        total = getPuntosIngreso()+getPuntosHijos()+getPuntosEstudio();
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getMonto() {
        if(getTotal() < 25){
            monto = 0;
        }
        if(getTotal() > 24 && getTotal() < 50){
            monto = 1000;
        }
        if(getTotal() > 49 && getTotal() < 100){
            monto = 3000;
        }
        if(getTotal() > 99 && getTotal() < 151){
            monto = 5000;
        }
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    
    
    
}
