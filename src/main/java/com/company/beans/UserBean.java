package com.company.beans;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ManagedBean
public class UserBean {

    private String firstName;
    private String lastName;
    private String level;
    private DataSourceFake sourceFake;

    public UserBean() {
        this.sourceFake = new DataSourceFake();
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
}
