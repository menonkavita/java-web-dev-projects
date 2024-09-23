package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class HouseCatTest{

    @Test
    public void inheritsSuperInFirstConstructor() {

        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }


    // Check your understanding (Testing Inheritance)
    @Test
    public void inheritsDefaultCatInSecondConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertNotNull(keyboardCat.getWeight());    // Ans #2 Check your understanding
        //assertEquals(13, keyboardCat.getWeight(),1); // Will work with delta modification
    }

    // Check your understanding (Testing Inheritance)
    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertFalse(keyboardCat.isHungry());
        assertFalse(keyboardCat.isTired());
        keyboardCat.eat();
        assertTrue(keyboardCat.isTired());    // Ans #2 Check your understanding
    }

}