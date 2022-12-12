/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;
import modelos.Estado;

public class EstadoBean {

    //atributos
    private String estado,municipio;
    private boolean deshabilitarMunicipio=true;
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        this.deshabilitarMunicipio=false;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public boolean isDeshabilitarMunicipio() {
        return deshabilitarMunicipio;
    }

    public void setDeshabilitarMunicipio(boolean deshabilitarMunicipio) {
        this.deshabilitarMunicipio = deshabilitarMunicipio;
    }
    
   //método para llenar el combo de estados
    public List<SelectItem> getEstados(){
        List<SelectItem> estados=new ArrayList<SelectItem>();
        estados.add(new SelectItem("--Selecciona un estado--"));
        for(Estado datos:Estado.getMunicipiosEstado()){
            estados.add(new SelectItem(datos.getEstado()));
        }
        return estados;
    }
    
    public SelectItem[] getMunicipios(){
        SelectItem[] municipios={new SelectItem("--Selecciona un municipio--")};
        if(!isDeshabilitarMunicipio() && estado!=null){
            for(Estado datos:Estado.getMunicipiosEstado()){
                if(estado.equals(datos.getEstado())){
                    municipios=datos.getMunicipios();
                    break;
                }
            }
        }
        return municipios;
    }
    
}
