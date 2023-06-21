package ua.lviv.iot.algo.part1.lab2;

import junit.framework.TestCase;
import org.junit.Test;

public class GamingLaptopTest extends TestCase {
    AbstractLaptop GamingLaptop=  new GamingLaptop("Ryzen i7", 4,
            4);
    AbstractLaptop getGamingLaptop= new GamingLaptop();

    @Test
        public void testReplaceBatttery() {
            var GamingLaptop = new GamingLaptop("Asus", 32, 16, "MSI Radeon",
                    6, 4);
            GamingLaptop.getGraficProcessor();
            GamingLaptop.getCapacityInHours();
            GamingLaptop.getCountOfVentilators();
            GamingLaptop.toString();
            GamingLaptop.setGraficProcessor("Gforce RTX");

            assertEquals("Laptop with new battery can work " + 4, GamingLaptop.replaceBatttery(4));
        }
}