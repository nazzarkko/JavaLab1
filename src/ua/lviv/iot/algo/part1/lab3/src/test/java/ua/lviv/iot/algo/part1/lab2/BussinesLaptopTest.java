package ua.lviv.iot.algo.part1.lab2;

import junit.framework.TestCase;
import org.junit.Test;

public class BussinesLaptopTest extends TestCase {
    AbstractLaptop  BussinesLaptop=  new BussinesLaptop(5, "Windows 10 PRO",
            true);
    AbstractLaptop  bussinesLaptop=  new BussinesLaptop();

@Test

    public void testReplaceBatttery() {
    var BussinesLaptop = new BussinesLaptop("Dell", 32, 16, 3,
            "Windows 11 PRO", true);
    BussinesLaptop.getCapacityInHours();
    BussinesLaptop.getVersionOfWindows();
    BussinesLaptop.getScreenSizeInch();
    BussinesLaptop.toString();
    BussinesLaptop.setVersionOfWindows("Windows 95");
    assertEquals("Laptop with new battery can work " + 4, BussinesLaptop.replaceBatttery(4));

} }
