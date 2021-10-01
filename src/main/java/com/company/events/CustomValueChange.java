package com.company.events;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class CustomValueChange implements ValueChangeListener {

    @Override
    public void processValueChange(ValueChangeEvent valueChangeEvent) throws AbortProcessingException {
        System.out.println(valueChangeEvent.getOldValue() + ":" + valueChangeEvent.getNewValue());
    }
}
