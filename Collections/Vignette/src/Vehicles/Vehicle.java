package Vehicles;

import Vignettes.Vignette;

import java.util.Date;

public abstract class Vehicle {
    private VehicleType type;
    private Vignette vignette;
    private Date manufacturingDate;

    public Vehicle(VehicleType type) {
        if (type!=null) {
            this.type = type;
            this.manufacturingDate = new Date();
        }else{
            throw new IllegalArgumentException();
        }
    }

    public Vignette getVignette() {
        return vignette;
    }

    public void setVignette(Vignette vignette) {
        if (vignette == null){
            return;
        }
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
