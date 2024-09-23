package technology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    @Test
    public void inheritsSuperInFirstConstructor(){
        Computer comp = new Computer(1);
        assertEquals(1, comp.getID());
    }

    @Test
    public void inheritsDefaultScreenInSecondConstructor(){
        Computer comp = new Computer("Intel Pentium i5 Core Quad", 1);
        assertEquals(0, comp.getScreenSize(), 0.001);
    }

    @Test
    public void setterSetsTypeOfOs(){
        Computer comp = new Computer(1);
        comp.setTypeofOS("Windows");
        assertEquals("Windows", comp.getTypeofOS());
    }
}
