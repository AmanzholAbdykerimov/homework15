package com.company;

public class Person {
    @Override
    public String toString(){
        return name +" "+ designation +" "+ organizatsiya+"      ";
    }
    private String name;
    private String designation;
    private String organizatsiya;
    public Person(String name, String designation, String organizatsiya) {
        this.name = name;
        this.designation = designation;
        this.organizatsiya=organizatsiya;
    }
}
