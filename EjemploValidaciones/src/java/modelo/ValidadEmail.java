/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("modelo.ValidadEmail")

public class ValidadEmail implements Validator{

    private final String PATRON_EMAIL=
            "^[_A-Za-z0-9-]+(\\."
            + "[_A-Za-z0-9-]+)*@[A-Za-z0-9]"
            + "+(\\.[A-Za-z0-9]+)*"
            + "(\\.[A-Za-z]{2,})$";
    
    private Pattern patron;
    private Matcher matcher;

    public ValidadEmail() {
        patron = Pattern.compile(PATRON_EMAIL);
    }
    
    @Override
    public void validate(FacesContext fc, UIComponent uic, Object value){
        matcher = patron.matcher(value.toString());
       
       //Validamos
       if(!matcher.matches()){
           FacesMessage mensaje = new FacesMessage("Debes teclear un correo valido");
           
           throw new ValidatorException(mensaje);
       }
    }
    
}
