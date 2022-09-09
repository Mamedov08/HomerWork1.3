package com.company;

public class Nokia extends Phone implements Printable {
    private String condition;

    public Nokia(String condition) {
        this.condition = condition;
    }

    @Override
    public void print() {
        System.out.println("Nokia " + condition);
    }
}
