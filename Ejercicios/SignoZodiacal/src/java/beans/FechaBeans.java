/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jesus
 */
@ManagedBean
@RequestScoped
public class FechaBeans {

    private int dia,mes,año;
    private String validacionFecha, signo;
    
    public FechaBeans() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getValidacionFecha() {
        /*Febrero*/
        if(getMes()==2 && getDia()>28){
            validacionFecha = "Error de fecha";
        }
        /*Abril - Junio - Septiembre - Noviembre*/
        if(getMes()==4 && getDia()==31 || getMes()==6 && getDia()==31 || getMes()==9 && getDia()==31 || getMes()==11 && getDia()==31){
            validacionFecha = "Error de fecha";
        }
        return validacionFecha;
    }

    public void setValidacionFecha(String validacionFecha) {
        this.validacionFecha = validacionFecha;
    }

    public String getSigno() {
        /*Validacion*/ 
        if("Error de fecha".equals(getValidacionFecha())){
            signo = "";
        }
        else{
            /* Acuario */ 
            if(getMes() == 1 && getDia()>19 || getMes() == 2 && getDia()<19){
                signo = "Tu signo zodiacal es ACUARIO";
            }
            /* Pisis */
            if(getMes() == 2 && getDia()>18 || getMes() == 3 && getDia()<20){
                signo = "Tu signo zodiacal es PISIS";
            }
            /* Aries */
            if(getMes() == 3 && getDia()>19 || getMes() == 4 && getDia()<19){
                signo = "Tu signo zodiacal es ARIES";
            }
            /* Tauro */
            if(getMes() == 4 && getDia()>18 || getMes() == 5 && getDia()<20){
                signo = "Tu signo zodiacal es TAURO";
            }
            /* Gemenis */
            if(getMes() == 5 && getDia()>19 || getMes() == 6 && getDia()<20){
                signo = "Tu signo zodiacal es GEMINIS";
            }
            /* Cancer */
            if(getMes() == 6 && getDia()>19 || getMes() == 7 && getDia()<22){
                signo = "Tu signo zodiacal es CANCER";
            }
            /* Leo */
            if(getMes() == 7 && getDia()>21 || getMes() == 8 && getDia()<22){
                signo = "Tu signo zodiacal es LEO";
            }
            /* Virgo */
            if(getMes() == 8 && getDia()>21 || getMes() == 9 && getDia()<22){
                signo = "Tu signo zodiacal es VIRGO";
            }
            /* Libra */
            if(getMes() == 9 && getDia()>21 || getMes() == 10 && getDia()<23){
                signo = "Tu signo zodiacal es LIBRA";
            }
            /* Escorpion */
            if(getMes() == 10 && getDia()>22 || getMes() == 11 && getDia()<21){
                signo = "Tu signo zodiacal es ESCORPION";
            }
            /* Sagitario */
            if(getMes() == 11 && getDia()>20 || getMes() == 12 && getDia()<21){
                signo = "Tu signo zodiacal es SAGITARIO";
            }
            /* Capricornio */
            if(getMes() == 12 && getDia()>20 || getMes() == 1 && getDia()<20){
                signo = "Tu signo zodiacal es CAPRICORNIO";
            }
        }
        
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
    
    
    
}
