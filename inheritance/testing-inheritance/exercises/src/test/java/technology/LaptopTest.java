package technology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LaptopTest {

    @Test
    public void setsSuperSuperInFirstConstructor(){
        Laptop laptopOne = new Laptop(1);
        assertEquals(1, laptopOne.getID());
    }

    @Test
    public void superSetsScreenSizeInFirstConstructor(){
        Laptop laptopOne = new Laptop(1);
        assertEquals(0, laptopOne.getScreenSize());
    }

    @Test
    public void constructorSetsNumberOfUSBPorts(){
        Laptop laptopOne = new Laptop(3, "i5", 14.5F, 1);
        assertEquals(3, laptopOne.getNumberOfUSBPorts());
    }

}
