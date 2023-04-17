package ua.lviv.iot.algo.part1.lab2;

import junit.framework.TestCase;
import org.junit.Test;

public class UltrabookTest extends TestCase {
    AbstractLaptop Ultrabook = new Ultrabook(1.2,14);
    AbstractLaptop ultrabook = new Ultrabook();

    @Test
    public void testReplaceBatttery() {
        var Ultrabook = new Ultrabook("Huawei", 16, 13, 1.2, 12);
        Ultrabook.getWheight();
        Ultrabook.getThickness();
        Ultrabook.toString();
        Ultrabook.setThickness(13.0);

        assertEquals("In Ultrabooks replacing of battery is never used ", Ultrabook.replaceBatttery(5));
    }
}
