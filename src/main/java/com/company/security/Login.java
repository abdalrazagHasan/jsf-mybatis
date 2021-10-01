package com.company.security;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class Login {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String check(){
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("xr#33")){
            return "success";
        }
        return "fuiler";
    }

}
