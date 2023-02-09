package edu.bu.met.cs665;

public class Tea {
    String type;
    Relish relish;

    public Tea(String type, Relish relish) {
        this.type = type;
        this.relish = relish;
    }

    public void brew() {
        System.out.println("Brewing " + type + " tea with " + relish.milkUnits + " milk units and " + relish.sugarUnits + " sugar units.");
    }
}
