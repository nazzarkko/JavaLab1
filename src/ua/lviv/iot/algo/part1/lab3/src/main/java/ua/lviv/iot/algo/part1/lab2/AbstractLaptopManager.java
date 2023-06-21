package ua.lviv.iot.algo.part1.lab2;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class AbstractLaptopManager {
    public static final List<AbstractLaptop> laptops = new LinkedList<>();

    public static void addLaptop(AbstractLaptop laptop) {
        laptops.add(laptop);
    }

    public List<AbstractLaptop> chooseLaptopWithRam(int ram) {
        return laptops.stream()
                .filter(laptop -> laptop.getRam() == ram)
                .collect(Collectors.toList());
    }

    public List<AbstractLaptop> findLaptopWithmoreScreenSize(int minimalScreenSize) {
        return laptops.stream()
                .filter(laptop -> laptop.getScreenSizeInch() > minimalScreenSize)
                .collect(Collectors.toList());
    }

}

