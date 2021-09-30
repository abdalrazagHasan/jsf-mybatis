package com.company.beans;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean
public class Tracker implements Serializable {

    public String redirect(){
        return "home";
    }

}
