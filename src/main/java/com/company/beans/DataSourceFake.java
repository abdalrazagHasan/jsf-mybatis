package com.company.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ManagedBean
public class DataSourceFake {

    private List<String> levels;

    public DataSourceFake(){
        levels = new ArrayList<>();
        levels.add("junior");
        levels.add("mid");
        levels.add("senior");
        levels.add("team leader");
    }

    public List<String> getLevels() {
        return levels;
    }

    public void setLevels(List<String> levels) {
        this.levels = levels;
    }

    public void addLevel(String level){
        levels.add(level);
    }

    @Override
    public String toString() {
        return "DataSourceFake{" +
                "levels=" + levels +
                '}';
    }
}
