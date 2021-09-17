package com.company.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ManagedBean
@ApplicationScoped
public class DataSourceFake {

    private Set<String> levels;
    private Set<String> cities;
    private Set<String> tags;
    private Set<UserBean> userBeans;
    private Set<String> userTypes;


    public DataSourceFake(){
        initLevels();
        initCities();
        initTags();
        initUserTypes();
        userBeans = new HashSet<>();
    }

    private void initLevels(){
        levels = new HashSet<>();
        levels.add("junior");
        levels.add("mid");
        levels.add("senior");
        levels.add("team leader");
    }


    private void initCities(){
        cities = new HashSet<>();
        cities.add("Amman");
        cities.add("Irbid");
        cities.add("Aqaba");
        cities.add("AL-Zarqa");
    }

    private void initTags(){
        tags = new HashSet<>();
        tags.add("sport");
        tags.add("health");
        tags.add("movies");
        tags.add("news");
        tags.add("since");
    }

    private void initUserTypes(){
        userTypes = new HashSet<>();
        userTypes.add("doctor");
        userTypes.add("patient");
    }

    public Set<String> getCities() {
        return cities;
    }

    public void setCities(Set<String> cities) {
        this.cities = cities;
    }

    public Set<String> getLevels() {
        return levels;
    }

    public void setLevels(Set<String> levels) {
        this.levels = levels;
    }

    public void addLevel(String level){
        levels.add(level);
    }

    public void addCity(String city){
        cities.add(city);
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag){
        this.tags.add(tag);
    }

    public Set<UserBean> getUserBeans() {
        return userBeans;
    }

    public void setUserBeans(Set<UserBean> userBeans) {
        this.userBeans = userBeans;
    }

    public Set<String> getUserTypes() {
        return userTypes;
    }

    public void setUserTypes(Set<String> userTypes) {
        this.userTypes = userTypes;
    }

    @Override
    public String toString() {
        return "DataSourceFake{" +
                "levels=" + levels +
                '}';
    }
}
