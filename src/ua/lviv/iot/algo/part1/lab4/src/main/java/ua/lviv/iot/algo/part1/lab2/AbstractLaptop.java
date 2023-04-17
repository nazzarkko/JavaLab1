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


abstract class AbstractLaptop {
   protected String model;
   protected int ram;
   protected int screenSizeInch;
   public String getHeaders(){
       return "model, "+"ram, "+"screenSizeInch, ";
   }
    public String toCSV(){
        return model+" , "+ram+" , "+screenSizeInch;
    }
   public abstract String replaceBatttery(int capacityInHours);



    }


