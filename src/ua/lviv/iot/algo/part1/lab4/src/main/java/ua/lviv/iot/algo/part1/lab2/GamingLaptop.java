package ua.lviv.iot.algo.part1.lab2;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
@Setter
public class GamingLaptop extends AbstractLaptop {

private String graficProcessor;
private int countOfVentilators;
private int capacityInHours;

    public GamingLaptop ( String model, int ram, int screenSizeInch, String graficProcessor, int countOfVentilators,
                         int capacityInHours ) {
        super(model, ram, screenSizeInch);
        this.graficProcessor = graficProcessor;
        this.countOfVentilators = countOfVentilators;
        this.capacityInHours = capacityInHours;
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() + "graficProcessor, " + "countOfVentilators, " + "capacityInHours";
    }
    @Override
    public String toCSV() {
        return super.toCSV() + " , " + capacityInHours + " , " + countOfVentilators + " , " + graficProcessor;
    }

    @Override
    public String replaceBatttery ( int capacityInHours ) {
        this.capacityInHours = capacityInHours;
        return "Laptop with new battery can work " + capacityInHours;
    }

}
