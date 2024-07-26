package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private int id;
    private String name;
    Plan plan;
    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Plan getPlan() {
        return plan;
    }
    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

}
