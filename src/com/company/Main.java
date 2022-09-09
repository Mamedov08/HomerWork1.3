package com.company;

import com.sun.source.tree.BreakTree;

public class Main {

    public static void main(String[] args) {
        Printable[] printable = {createObject("Samsung"), createObject("Nokia"),
                createObject("Xiaomi")};
        for (Printable print: printable) {
            print.print();
        }

    }


    public static Printable createObject(String classname) {
        switch (classname) {
            case "Samsung":
                return new Samsung(": A10");
            case "Nokia":
                return new Nokia(": Condition excellent");
            case "Xiaomi":
                return new Xiaomi( 2022);
        }


        return null;
    }
}