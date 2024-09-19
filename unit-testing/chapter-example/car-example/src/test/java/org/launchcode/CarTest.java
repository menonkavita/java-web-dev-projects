package org.launchcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }

    Car test_car;

    @BeforeEach
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        //Car test_car = new Car("Toyota", "Prius", 10, 50);

        // checks for equality with the difference mentioned as last parameter
        //assertEquals(10, test_car.getGasTankLevel(), .001);

        // assertTrue & assertFalse -
        // strict comparison that passes if the first argument is boolean false
        assertFalse((test_car.getGasTankLevel() <= 0 ), "Does constructor set initial GasTankLevel properly");
        //assertTrue((test_car.getGasTankLevel() >= 0 ), "Does constructor set initial GasTankLevel properly");
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasLevelWithinTankRange(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasLevelExceedingTankRange(){
        test_car.drive(500);
        assertEquals( test_car.getGasTankLevel(), 0,.001);
    }



    //TODO: can't have more gas than tank size, expect an exception
    @Test
    public void testGasOverfillException(){
        assertThrows(IllegalArgumentException.class, () -> test_car.addGas(5), "Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }

}