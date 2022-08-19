package Vignettes;

import Vehicles.VehicleType;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;

public abstract class Vignette {
    public static final int MONTH_MULTIPLIER = 10;
    public static final int YEAR_MULTIPLIER = MONTH_MULTIPLIER*6;
    public static final int DAY_PRICE_BLUE = 5;
    public static final int DAY_PRICE_GREEN = 7;
    public static final int DAY_PRICE_RED = 9;

    private LocalDate soldDate;
    private VignetteColour colour;
    private VignetteValidity validity;

    public Vignette(VignetteColour colour, VignetteValidity validity) {
        if (colour != null && validity!=null) {
            this.colour = colour;
            this.validity = validity;
        }else{
            throw new IllegalArgumentException();
        }
    }
    public static int checkVignettePrice(VignetteColour vignetteColour, VignetteValidity vignetteValidity){
        if (vignetteColour!= null && vignetteValidity != null) {
            switch (vignetteColour) {
                case BLUE:
                    switch (vignetteValidity) {
                        case DAY:
                            return DAY_PRICE_BLUE;
                        case MONTH:
                            return DAY_PRICE_BLUE * MONTH_MULTIPLIER;
                        case YEAR:
                            return DAY_PRICE_BLUE * YEAR_MULTIPLIER;
                    }
                case GREEN:
                    switch (vignetteValidity) {
                        case DAY:
                            return DAY_PRICE_GREEN;
                        case MONTH:
                            return DAY_PRICE_GREEN * MONTH_MULTIPLIER;
                        case YEAR:
                            return DAY_PRICE_GREEN * YEAR_MULTIPLIER;
                    }
                case RED:
                    switch (vignetteValidity) {
                        case DAY:
                            return DAY_PRICE_RED;
                        case MONTH:
                            return DAY_PRICE_RED * MONTH_MULTIPLIER;
                        case YEAR:
                            return DAY_PRICE_RED * YEAR_MULTIPLIER;
                    }
            }
        }
        throw new NullPointerException();
    }

    public abstract int price() ;

    public abstract Duration putOnGlass();

    public VehicleType vehicleType(){
        VignetteColour colourTemp = this.colour;
        switch (colourTemp){
            case BLUE:return VehicleType.CAR;
            case GREEN:return VehicleType.BUS;
            case RED:return VehicleType.TRUCK;
        }
        return null;
    }

    public VignetteColour getColour() {
        return colour;
    }

    public void setSoldDate(LocalDate soldDate) {
        this.soldDate = soldDate;
    }

    public LocalDate getSoldDate() {
        return soldDate;
    }

    public VignetteValidity getValidity() {
        return validity;
    }

    @Override
    public String toString() {
        return "[price=" + price() + ", colour=" + colour + ']';
    }




}
