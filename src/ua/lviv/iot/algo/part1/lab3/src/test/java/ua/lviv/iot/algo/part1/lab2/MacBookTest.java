package ua.lviv.iot.algo.part1.lab2;

import junit.framework.TestCase;
import org.junit.Test;

public class MacBookTest extends TestCase {
    AbstractLaptop MacBook = new MacBook(4, "Intel i9", "IOS 15.5");
    AbstractLaptop macBook = new MacBook();
  @Test
        public void testReplaceBatttery() {
            var MacBook = new MacBook("MacBook Air", 16, 13, 4,
                    "Intel i9", "IOS 15.7");
      MacBook.getVersionOfIOS();
      MacBook.getCapacityInHours();
      MacBook.getModelOfProcessor();
      MacBook.setModelOfProcessor("M1");
      MacBook.toString();
            assertEquals("Laptop with new battery can work " + 4, MacBook.replaceBatttery(4));
        }

}