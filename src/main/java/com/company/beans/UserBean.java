package com.company.beans;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String level;
    private String city;
    private String phoneNumber;
    private String userType;
    private Set<String> favorites;
    private DataSourceFake sourceFake;

    public UserBean() {
        this.sourceFake = new DataSourceFake();
        this.favorites = new HashSet<>();
    }

    public void setSourceFake(DataSourceFake sourceFake) {
        this.sourceFake = sourceFake;
    }

    public DataSourceFake getSourceFake() {
        return sourceFake;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(Set<String> favorites) {
        this.favorites = favorites;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getView(){
        if (userType.equals("doctor")) return "dashboard";
        return "whatever";
    }


}
