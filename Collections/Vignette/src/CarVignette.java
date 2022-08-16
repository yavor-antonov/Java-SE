import java.time.Duration;

public class CarVignette extends Vignette{
    public CarVignette(VignetteValidity validity) {
        super(VignetteColour.BLUE, validity);
    }

    @Override
    public int price() {
        switch (this.getValidity()) {
            case DAY:
                return DAY_PRICE_BLUE;
            case MONTH:
                return DAY_PRICE_BLUE * MONTH_MULTIPLIER;
            case YEAR:
                return DAY_PRICE_BLUE * YEAR_MULTIPLIER;
        }
        return 0;
    }

    @Override
    public Duration putOnGlass() {
        return Duration.ofSeconds(5);
    }
}
