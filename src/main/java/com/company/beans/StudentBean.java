package com.company.beans;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class StudentBean implements Serializable {

    private String opinion;

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

}
