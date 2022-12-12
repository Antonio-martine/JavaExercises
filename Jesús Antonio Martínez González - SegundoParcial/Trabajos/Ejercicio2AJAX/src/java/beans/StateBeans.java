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
public class StateBeans {

    private String city, americanFutbol,baseball;
    
    public StateBeans() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAmericanFutbol() {
        if("California".equals(getCity())){
            americanFutbol = "° San Francisco";
        }
        if("Texas".equals(getCity())){
            americanFutbol = "° Houston Astros";
        }
        if("Arizona".equals(getCity())){
            americanFutbol = "° Arizona Cardinals";
        }
        
        return americanFutbol;
    }

    public void setAmericanFutbol(String americanFutbol) {
        this.americanFutbol = americanFutbol;
    }

    public String getBaseball() {
        if("California".equals(getCity())){
            baseball = "° Los Angeles Dodgers";
        }
        if("Texas".equals(getCity())){
            baseball = "° The Rangers";
        }
        if("Arizona".equals(getCity())){
            baseball = "° Arizona Diamondbacks";
        }
        return baseball;
    }

    public void setBaseball(String baseball) {
        this.baseball = baseball;
    }
    
    
}
