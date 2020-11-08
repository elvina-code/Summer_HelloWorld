package oop;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
public class RectangleTest {

    @Test
    public void testCalculateArea(){
        Rectangle r1 = new Rectangle();

        float area = r1.calculateArea();
        assertNotNull(r1);
        assertEquals(1.0,area, 0.0);

    }


}
