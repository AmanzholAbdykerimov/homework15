package com.company;

public class Singer extends Person{
    public Singer(String name, String designation,String organizatsiya) {
        super(name, designation,organizatsiya);
    }
    void singing(){
        System.out.print("Bakyt kyrgyzcha tilinde yrdait  ");
    }
    void playGuitar(){
        System.out.println("Gitarada cherte alat");
    }
}
