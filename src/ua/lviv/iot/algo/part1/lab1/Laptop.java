package ua.lviv.iot.algo.part1.lab1;

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



public class Laptop {
private static final String MODEL="Unknow";


    private static final double SCREENSIZE=15.6;
       private static final int RAM=8;
          private static final int STORAGE=256;
             private static final int BATTERYLIFE=5;
            public String model;
    public int moreRam;
    public int moreStorage;
    public int maxBatteryLevel;
    private static int finalRam;
    public static int finalStorage;

 public int addRam(int moreRam) {
     finalRam = RAM + moreRam;
     return finalRam;
 }
public int addStorage(int moreStorage){
     finalStorage= STORAGE+moreStorage;
     return finalStorage;
}
public void setCharge(int maxBatteryLevel){
this.maxBatteryLevel=maxBatteryLevel;
System.out.println("Max battery life is "+maxBatteryLevel);
}
    public static Laptop instance=new Laptop();
public static Laptop getInstance(){
     return instance;
}





public static void main(String[] args){

Laptop[] laptops = new Laptop[4];

laptops[0]=new Laptop();
    laptops[1]=new Laptop( "Aspire", 8, 256, 5000);
    laptops[2]=Laptop.getInstance();
    laptops[3]=Laptop.getInstance();

    for (int i=0; i<laptops.length; i++){
        System.out.println(laptops[i].toString());
    }

}
    }