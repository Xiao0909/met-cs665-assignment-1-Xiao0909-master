package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestMain {
    /**
     * 
     */
    @Test
    public void testMain() {
        Main main = new Main();
        // test for coffee
        String[] args = {"coffee", "espresso", "2", "1"};
        main.main(args);
        // assert statements to verify the output of the program
        // test for tea
        args = new String[]{"tea", "green tea", "1", "2"};
        main.main(args);
        // assert statements to verify the output of the program
        // test for invalid beverage type
        args = new String[]{"juice", "orange juice", "1", "1"};
        main.main(args);
        // assert statements to verify the output of the program
    }    

    
    
}



