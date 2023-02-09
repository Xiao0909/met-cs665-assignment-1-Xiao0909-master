package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;
import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

// public class Main {

//   public static void main (String[] arg){
//     Main DrinkVenderMachine = new main()
//     getDrink();
//   }


//   public static void getDrink（）   {
//     Drink drink = new Coffee（）；

//   }
  
// }
// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Fully Automatic Beverage Vending Machine");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.print("Please select your drink: ");
        int drinkChoice = scanner.nextInt();
        Drink drink = null;
        if (drinkChoice == 1) {
            System.out.println("1. Espresso");
            System.out.println("2. Americano");
            System.out.println("3. Latte Macchiato");
            System.out.print("Please select your coffee: ");
            int coffeeChoice = scanner.nextInt();
            drink = new Coffee(coffeeChoice);
        } else if (drinkChoice == 2) {
            System.out.println("1. Black Tea");
            System.out.println("2. Green Tea");
            System.out.println("3. Yellow Tea");
            System.out.print("Please select your tea: ");
            int teaChoice = scanner.nextInt();
            drink = new Tea(teaChoice);
        }
        int sugarUnits = 0;
        int milkUnits = 0;
        while (sugarUnits < 0 || sugarUnits > 3) {
            System.out.print("Please enter the number of units of sugar (0-3): ");
            sugarUnits = scanner.nextInt();
        }
        while (milkUnits < 0 || milkUnits > 3) {
            System.out.print("Please enter the number of units of milk (0-3): ");
            milkUnits = scanner.nextInt();
        }
        drink.addRelish(new Relish(sugarUnits, milkUnits));
        System.out.println("Your drink is ready.");
    }
}

// Tea.java
public class Tea extends Drink {
    public Tea(int type) {
        super(type);
    }
}

// Relish.java
public class Relish {
    private int sugarUnits;
    private int milkUnits;

    public Relish(int sugarUnits, int milkUnits) {
        this.sugarUnits = sugarUnits;
        this.milkUnits = milkUnits;
    }
}

