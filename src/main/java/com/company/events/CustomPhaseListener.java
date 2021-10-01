package com.company.events;

import javax.faces.component.UIComponentBase;
import javax.faces.component.UIInput;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class CustomPhaseListener implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println("after "+phaseEvent.getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        System.out.println("before "+phaseEvent.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
