package com.company;

public class Xiaomi extends Phone implements Printable {
    private int year;

    public Xiaomi(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Xiaomi " + year);

    }
}

