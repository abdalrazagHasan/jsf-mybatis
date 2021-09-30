package com.company.beans;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class StudentBean implements Serializable {

    private String opinion;
    private boolean isAccepted;

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public List<String> autoComplete(String text){
        List<String> list = new ArrayList<>();
        list.add("good");
        list.add("bad");
        list.add("terrible");
        list.add("horrible");
        list.add("great");
        list.add("brellent");
        return list;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public void acceptTerms(){
        String details = isAccepted ? "accepted" : "not accepted";
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(details));
    }

    public void addMessage(){
        FacesContext.getCurrentInstance()
                .addMessage(null,new FacesMessage(isAccepted?"write it in the box" : "great"));
    }
}
