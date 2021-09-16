package com.company.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ManagedBean
public class UserBean {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String level;
    private String city;
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
}
