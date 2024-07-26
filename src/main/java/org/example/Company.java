package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if (giro >= 0) {
            this.giro = giro;
        } else {
            this.giro = 0;
            System.out.println("Giro cannot be less than 0. Setting giro to 0.");
        }
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index >= 0 && index < developerNames.length) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
                System.out.println(name + " added at index " + index);
            } else {
                System.out.println("Index " + index + " is already occupied by " + developerNames[index]);
            }
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro >= 0) {
            this.giro = giro;
        } else {
            System.out.println("Giro cannot be less than 0.");
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }


}
