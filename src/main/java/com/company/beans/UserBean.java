package com.company.beans;

import javax.faces.bean.ManagedBean;
import java.util.HashSet;
import java.util.Set;

@ManagedBean
public class UserBean {

    private String firstName;
    private String lastName;
    private String level;

    public UserBean() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
