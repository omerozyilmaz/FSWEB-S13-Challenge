package org.example.enums;

public enum Plan {
    BASIC("Basic", 1000),
    STANDARD("Standard", 2000),;

    private  int price;
    private  String name;
    private Plan( String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
