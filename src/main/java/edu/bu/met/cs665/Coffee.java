package edu.bu.met.cs665;

public class Coffee {
    String type;
    Relish relish;

    public Coffee(String type, Relish relish) {
        this.type = type;
        this.relish = relish;
    }

    public void brew() {
        System.out.println("Brewing " + type + " coffee with " + relish.milkUnits + " milk units and " + relish.sugarUnits + " sugar units.");
    }
}
