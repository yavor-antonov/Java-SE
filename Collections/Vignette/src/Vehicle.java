import java.time.LocalDate;
import java.util.Date;

public class Vehicle {
    private VehicleType type;
    private Vignette vignette;
    private Date manufacturingDate;

    public Vehicle(VehicleType type) {
        this.type = type;
        this.manufacturingDate = new Date();
    }

    public Vignette getVignette() {
        return vignette;
    }

    public void setVignette(Vignette vignette) {
        if (vignette.vehicleType() == this.type) {
            this.vignette = vignette;
        }else{
            System.out.println("Wrong vehicle type");
        }
    }

    public VehicleType getType() {
        return type;
    }

}
