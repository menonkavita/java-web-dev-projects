package technology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartPhoneTest {

    @Test
    public void setsSuperIDInFirstConstructor(){
        SmartPhone sm = new SmartPhone(1, 3);
        assertEquals(1, sm.getID());
    }

    @Test
    public void setsNumberOfCameraInFirstConstructor(){
        SmartPhone sm = new SmartPhone("A15 Bionic chip",1, 3);
        assertEquals(3, sm.getNumberOfCamera());
    }

    @Test
    public void checksMultiSim(){
        SmartPhone sm = new SmartPhone(1, 4, false);
        assertEquals("Smart Phone does not have multiple Sim Card option", sm.checkSim());
    }
}
