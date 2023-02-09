package edu.bu.met.cs665;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter beverage type (coffee/tea):");
        String beverageType = sc.nextLine();
        System.out.println("Enter beverage sort (espresso/americano/latte macchiato/black tea/green tea/yellow tea):");
        String beverageSort = sc.nextLine();
        System.out.println("Enter number of milk units:");
        int milkUnits = sc.nextInt();
        System.out.println("Enter number of sugar units:");
        int sugarUnits = sc.nextInt();

        Relish relish = new Relish(milkUnits, sugarUnits);

        if (beverageType.equals("coffee")) {
            Coffee coffee = new Coffee(beverageSort, relish);
            coffee.brew();
        } else if (beverageType.equals("tea")) {
            Tea tea = new Tea(beverageSort, relish);
            tea.brew();
        } else {
            System.out.println("Invalid beverage type.");
        }
    }
}





