package com.company.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ManagedBean
public class DataSourceFake {

    private Set<String> levels;
    private Set<String> cities;


    public DataSourceFake(){
        initLevels();
        initCities();
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

    @Override
    public String toString() {
        return "DataSourceFake{" +
                "levels=" + levels +
                '}';
    }
}
