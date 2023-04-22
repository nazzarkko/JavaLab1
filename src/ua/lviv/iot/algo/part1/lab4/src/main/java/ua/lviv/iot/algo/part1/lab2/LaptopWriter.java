package ua.lviv.iot.algo.part1.lab2;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;
import java.io.IOException;
public class LaptopWriter {
    public static void addObjects (){
        LinkedList<AbstractLaptop> laptops = new LinkedList<>();
        AbstractLaptopManager.addLaptop(new BussinesLaptop("Dell", 32, 16, 3,
                "Windows 11 PRO", true));
        AbstractLaptopManager.addLaptop(new GamingLaptop("Asus", 32, 16,
                "MSI Radeon", 6, 4));
        AbstractLaptopManager.addLaptop(new Ultrabook("Xiaomi", 8, 13, 1.0,
                10));
        AbstractLaptopManager.addLaptop(new MacBook("MacBook PRO M1", 32, 15, 5,
                "M1", "IOS 16"));
        LaptopWriter writer= new LaptopWriter();
        writer.writeToFile(laptops, "File.cvs");
    }
    public void writeToFile ( List<AbstractLaptop> laptops, String nameOfFile ) {
        if (laptops == null || laptops.isEmpty()) {
            return;
        }
 try(FileWriter writer = new FileWriter(nameOfFile)){
     for (AbstractLaptop laptop : laptops) {
         if (laptops!=null) {
             writer.write(laptop.getHeaders());
             laptops = null;
         }
         writer.write(laptop.toCSV());

     }}
 catch(IOException e){
     e.fillInStackTrace();
        }
    }
}
