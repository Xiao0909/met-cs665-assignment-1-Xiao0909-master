package edu.bu.met.cs665;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class TestMain {
    @Test
    public void testMain() {
        String input = "1\n1\n3\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        Main.main(null);
        String expectedOutput = "Welcome to the Fully Automatic Beverage Vending Machine\n" +
                "1. Coffee\n" +
                "2. Tea\n" +
                "Please select your drink: 1. Espresso\n" +
                "2. Americano\n" +
                "3. Latte Macchiato\n" +
                "Please select your coffee: Please enter the number of units of sugar (0-3): Please enter the number of units of milk (0-3): Your drink is ready.\n";
        assertEquals(expectedOutput, out.toString());
    }
    
}

