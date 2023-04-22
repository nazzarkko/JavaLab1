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
public class MacBook extends AbstractLaptop {
private int capacityInHours;
private String modelOfProcessor;
private String versionOfIOS;

    public MacBook( String model, int ram, int screenSizeInch, int capacityInHours, String modelOfProcessor,
                   String versionOfIOS ) {
        super(model, ram, screenSizeInch);
        this.capacityInHours = capacityInHours;
        this.modelOfProcessor = modelOfProcessor;
        this.versionOfIOS = versionOfIOS;
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() + "capacityInHours, " + "modelOfProcessor, " + "versionOfIOS";
    }
    @Override
    public String toCSV() {
        return super.toCSV() + " , " + capacityInHours + " , " + modelOfProcessor + " , " + versionOfIOS;
    }

    public String replaceBatttery( int capacityInHours ) {
this.capacityInHours = capacityInHours;
        return "Laptop with new battery can work " + capacityInHours;
    }
}
