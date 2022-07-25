package com.company;

public class Main {
    public static void main(String[] args) {
        Dancer dancer=new Dancer("Azamat","Biychi","Muras");
        Singer singer=new Singer("Bakyt","Yrchy","PBL");
        Programmer programmer=new Programmer("Zamir","Programist","AD");
        System.out.print(dancer.toString());
        dancer.dancing();
        System.out.print(programmer.toString());
        programmer.coding();
        System.out.print(singer.toString());
        singer.singing();
        singer.playGuitar();
    }}