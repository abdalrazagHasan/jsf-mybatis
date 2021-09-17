package com.company.validations;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.company.validations.EmailValidator")
public class EmailValidator implements Validator<String> {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, String email) throws ValidatorException {
        if (email == null) return;

        if (!Character.isAlphabetic(email.charAt(0))){
            FacesMessage message = new FacesMessage("email should start with alphabetic");

            throw new ValidatorException(message);
        }
    }
}
