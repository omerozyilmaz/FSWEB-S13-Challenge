package org.example;

public class Company {
    private int id ;
    private String name;
    private double giro;
    private String[] developerNames;
    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro < 0 ? 0 : giro;
        this.developerNames = developerNames;
    }
    //Getter
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getGiro() {
        return this.giro = giro < 0 ? 0 : giro;
    }
    public String[] getDeveloperNames() {
        return developerNames;
    }
    //Setter

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGiro(double giro) {
        this.giro = giro;
    }
    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
    public void addEmployee(int index, String name) {
        if (index < 0 || index > developerNames.length) {
            System.out.println("Index out of bounds");
        } else if (developerNames[index]==null) {
            developerNames[index] = name;
        }else {
            System.out.println("Index " + index + " is already occupied by " + developerNames[index]);
        }
    }

}
