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
public class Ultrabook extends AbstractLaptop {
    private double wheight;
    private double thickness;

    public Ultrabook( String model, int ram, int screenSizeInch, double wheightInKilo, double thicknessInMilimeters ) {
        super(model, ram, screenSizeInch );
        this.wheight = wheightInKilo;
        this.thickness = thicknessInMilimeters; }
    public String getHeaders() {
        return super.getHeaders() + "wheight, " + "thickness";
    }
    public String toCSV() {
        return super.toCSV() + " , " + wheight + " , " + thickness;
    }
    @Override
    public String replaceBatttery( int capacityInHours ) {
        return "In Ultrabooks replacing of battery is never used ";
    }
}
