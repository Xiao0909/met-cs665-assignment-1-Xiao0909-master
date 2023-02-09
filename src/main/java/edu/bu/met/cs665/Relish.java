package edu.bu.met.cs665;

public class Relish {
    int milkUnits;
    int sugarUnits;

    public Relish(int milkUnits, int sugarUnits) {
        if (milkUnits >= 0 && milkUnits <= 3 && sugarUnits >= 0 && sugarUnits <= 3) {
            this.milkUnits = milkUnits;
            this.sugarUnits = sugarUnits;
        } else {
            System.out.println("Invalid relish units. Milk and sugar units must be between 0 and 3.");
        }
    }
}
