package org.example;

public class Employee {
    private  int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    // Constructor
    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    // Method to add a health plan to the healthPlans array
    public void addHealthPlan(int index, String plan) {
        if (index >= 0 && index < healthPlans.length) {
            if (healthPlans[index] == null) {
                healthPlans[index] = plan;
                System.out.println(plan + " added at index " + index);
            } else {
                System.out.println("Index " + index + " is already occupied by " + healthPlans[index]);
            }
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }

}
