package ua.lviv.iot.algo.part1.lab2;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AbstractLaptopManagerTest extends TestCase {
AbstractLaptopManager Laptops=new AbstractLaptopManager();
@Test
    public void testChooseLaptopWithRam() {
    Laptops.addLaptop(new GamingLaptop("HP", 16, 16, "Nvidia Geforce RTX 3060",
            4, 5));
    Laptops.addLaptop(new GamingLaptop("Asus", 32, 16, "MSI Radeon", 6,
            4));
    Laptops.addLaptop(new Ultrabook("Xiaomi", 8, 13, 1.0,
            10));
    Laptops.addLaptop(new Ultrabook("Huawei", 16, 13, 1.2,
            12));
    Laptops.addLaptop(new BussinesLaptop("Dell", 32, 16, 3,
            "Windows 11 PRO", true));
    Laptops.addLaptop(new BussinesLaptop("Dell", 32, 15, 4,
            "Windows 10 HOME", false));
    Laptops.addLaptop(new MacBook("MacBook Air", 16, 13, 4,
            "Intel i9", "IOS 15.7"));
    Laptops.addLaptop(new MacBook("MacBook PRO M1", 32, 15, 5,
            "M1", "IOS 16"));
    List<AbstractLaptop> neededLaptops= new ArrayList<>();
            neededLaptops.add(new GamingLaptop("HP", 16, 16, "Nvidia Geforce RTX 3060",
                    4, 5));
            neededLaptops.add(new Ultrabook("Huawei", 16, 13, 1.2,
                    12));
            neededLaptops.add(new MacBook("MacBook Air", 16, 13, 4, "Intel i9",
                    "IOS 15.7"));
            assertEquals(neededLaptops.size(), Laptops.chooseLaptopWithRam(16).size());
    }
@Test
    public void testFindLaptopWithmoreScreenSize() {

    List<AbstractLaptop> neededLaptops= new ArrayList<>();
    neededLaptops.add(new GamingLaptop("HP", 16, 16, "Nvidia Geforce RTX 3060",
            4, 5));
    neededLaptops.add(new GamingLaptop("Asus", 32, 16, "MSI Radeon", 6,
            4));
    neededLaptops.add(new BussinesLaptop("Dell", 32, 16, 3,
            "Windows 11 PRO",
            true));
    neededLaptops.add(new BussinesLaptop("Dell", 32, 15, 4,
            "Windows 10 HOME",
            false));
    neededLaptops.add(new MacBook("MacBook PRO M1", 32, 15, 5, "M1",
            "IOS 16"));
    assertEquals(neededLaptops.size(), Laptops.findLaptopWithmoreScreenSize(14).size());
    }
}