package ua.lviv.iot.algo.part1.lab2;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString
@Setter
public abstract class AbstractLaptop {
    private final static String HEADERS = "model, ram, screenizeInch";
    private String model;
   private int ram;
   private int screenSizeInch;
   public String getHeaders() {
       return HEADERS;
   }
    public String toCSV() {
        return model + " , " + ram + " , " + screenSizeInch;
    }
   public abstract String replaceBatttery(int capacityInHours);
}


