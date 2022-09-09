package com.company;

public class Samsung extends Phone implements Printable {
    private String model;

    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Samsung " + model);
    }
}
