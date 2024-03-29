package ua.lviv.iot.algo.part1.lab2;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class AbstractLaptopManager {
    public static final List<AbstractLaptop> LAPTOPS = new LinkedList<>();

    public static final void addLaptop(AbstractLaptop laptop) {
        LAPTOPS.add(laptop);
    }

    public final List<AbstractLaptop> chooseLaptopWithRam(int ram) {
        return LAPTOPS.stream()
                .filter(LAPTOP -> LAPTOP.getRam() == ram)
                .collect(Collectors.toList());
    }

    public final List<AbstractLaptop> findLaptopWithmoreScreenSize(int minimalScreenSize) {
        return LAPTOPS.stream()
                .filter(LAPTOP -> LAPTOP.getScreenSizeInch() > minimalScreenSize)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        AbstractLaptopManager laptopManager = new AbstractLaptopManager();
        AbstractLaptopManager.addLaptop(new GamingLaptop("HP", 16, 16,
                "Nvidia Geforce RTX 3060", 4, 5));
        AbstractLaptopManager.addLaptop(new GamingLaptop("Asus", 32, 16,
                "MSI Radeon", 6, 4));
        AbstractLaptopManager.addLaptop(new Ultrabook("Xiaomi", 8, 13, 1.0,
                10));
        AbstractLaptopManager.addLaptop(new Ultrabook("Huawei", 16, 13, 1.2,
                12));
        AbstractLaptopManager.addLaptop(new BussinesLaptop("Dell", 32, 16, 3,
                "Windows 11 PRO", true));
        AbstractLaptopManager.addLaptop(new BussinesLaptop("Dell", 32, 15, 4,
                "Windows 10 HOME", false));
        AbstractLaptopManager.addLaptop(new MacBook("MacBook Air", 16, 13, 4,
                "Intel i9", "IOS 15.7"));
        AbstractLaptopManager.addLaptop(new MacBook("MacBook PRO M1", 32, 15, 5,
                "M1", "IOS 16"));
        for (AbstractLaptop laptop : laptopManager.LAPTOPS) {
            System.out.println(laptop);
        }
        var laptopWithMoreScreenSize = laptopManager.findLaptopWithmoreScreenSize(13);
        System.out.println("Laptop with more screen size ");
        for (AbstractLaptop laptop : laptopWithMoreScreenSize) {
            System.out.println(laptop);
        }
        var laptopsWithChoosedRam = laptopManager.chooseLaptopWithRam(32);
        System.out.println("Laptops with choosed RAM");
        for (AbstractLaptop laptop : laptopsWithChoosedRam) {
            System.out.println(laptop);
        }
        LaptopWriter laptopWriter = new LaptopWriter();
        laptopWriter.writeToFile(laptopManager.LAPTOPS, "laptops");
    }

}

