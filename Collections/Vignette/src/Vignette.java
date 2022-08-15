import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class Vignette {
    public static final int MONTH_MULTIPLIER = 10;
    public static final int YEAR_MULTIPLIER = MONTH_MULTIPLIER*6;
    public static final int DAY_PRICE_BLUE = 5;
    public static final int DAY_PRICE_GREEN = 7;
    public static final int DAY_PRICE_RED = 9;

    private LocalDate soldDate;
    private VignetteColour colour;
    private VignetteValidity validity;

    public Vignette(VignetteColour colour, VignetteValidity validity) {
        this.colour = colour;
        this.validity = validity;
    }
    public static int price(VignetteColour vignetteColour, VignetteValidity vignetteValidity){
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
        return 0;
    }

    public int price() {
        switch (this.colour) {
            case BLUE:
                switch (this.validity) {
                    case DAY:
                        return DAY_PRICE_BLUE;
                    case MONTH:
                        return DAY_PRICE_BLUE * MONTH_MULTIPLIER;
                    case YEAR:
                        return DAY_PRICE_BLUE * YEAR_MULTIPLIER;
                }
            case GREEN:
                switch (this.validity) {
                    case DAY:
                        return DAY_PRICE_GREEN;
                    case MONTH:
                        return DAY_PRICE_GREEN * MONTH_MULTIPLIER;
                    case YEAR:
                        return DAY_PRICE_GREEN * YEAR_MULTIPLIER;
                }
            case RED:
                switch (this.validity) {
                    case DAY:
                        return DAY_PRICE_RED;
                    case MONTH:
                        return DAY_PRICE_RED * MONTH_MULTIPLIER;
                    case YEAR:
                        return DAY_PRICE_RED * YEAR_MULTIPLIER;
                }
        }
        return 0;
    }

    public Duration putOnGlass(){
        switch (this.colour){
            case BLUE:return Duration.ofSeconds(5);
            case GREEN:return Duration.ofSeconds(20);
            case RED:return Duration.ofSeconds(10);
        }
        return Duration.ofSeconds(0);
    }

    public VehicleType vehicleType(){
        if (this.colour == VignetteColour.BLUE){
            return VehicleType.CAR;
        }else if (this.colour == VignetteColour.GREEN){
            return VehicleType.BUS;
        }else{
            return VehicleType.TRUCK;
        }
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
}
