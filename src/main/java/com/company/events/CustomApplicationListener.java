package com.company.events;

import javax.faces.application.Application;
import javax.faces.event.*;

public class CustomApplicationListener implements SystemEventListener {

    @Override
    public void processEvent(SystemEvent systemEvent) throws AbortProcessingException {
        if (systemEvent instanceof PreDestroyApplicationEvent) {
            System.out.println("PreDestroyApplicationEvent");
        }
        if (systemEvent instanceof PostConstructApplicationEvent){
            System.out.println("PostConstructApplicationEvent");
        }
        System.out.println(systemEvent.getSource());
    }

    @Override
    public boolean isListenerForSource(Object o) {
        return o instanceof Application;
    }
}
