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
public class BussinesLaptop extends AbstractLaptop {
    private int capacityInHours;
    private String versionOfWindows;
    private boolean licensionForMicrosoftOffice;

    public BussinesLaptop( String model, int ram, int screenSizeInch, int capacityInHours, String versionOfWindows,
                           boolean licensionForMicrosoftOffice ) {
        super(model, ram, screenSizeInch);
        this.capacityInHours = capacityInHours;
        this.versionOfWindows = versionOfWindows;
        this.licensionForMicrosoftOffice = licensionForMicrosoftOffice; }
    @Override
    public String getHeaders() {
        return super.getHeaders() + "capacityInHours, " + "versionOfWindows, " + "licensionForMicrosoftOffice";
    }
    @Override
    public String toCSV() {
        return super.toCSV() + " , " + capacityInHours + " , " + versionOfWindows + " , " + licensionForMicrosoftOffice;
    }
    @Override
    public String replaceBatttery( int capacityInHours ) {
        this.capacityInHours = capacityInHours;
        return "Laptop with new battery can work " + capacityInHours;
    }
}
