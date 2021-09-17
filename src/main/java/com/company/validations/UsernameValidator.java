package com.company.validations;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "com.company.validations.UsernameValidator")
public class UsernameValidator implements Validator<String> {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, String username) throws ValidatorException {
        if (username == null) return;

        if (!Character.isAlphabetic(username.charAt(0))){
            FacesMessage message = new FacesMessage("username should start with alphabetic");

            throw new ValidatorException(message);
        }
    }
}
