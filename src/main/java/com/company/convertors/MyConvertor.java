package com.company.convertors;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.validator.ValidatorException;

@FacesConverter("myConvertor")
public class MyConvertor implements Converter<String> {
    @Override
    public String getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s.length() < 5) {
            FacesMessage message = new FacesMessage();
            message.setSummary("less than 5 charecter");
            throw new ValidatorException(message);
        } else {
            return s.concat("");
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, String s) {
        return s;
    }
}
