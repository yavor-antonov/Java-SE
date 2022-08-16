import java.time.Duration;

public class TruckVignette extends Vignette{
    public TruckVignette(VignetteValidity validity) {
        super(VignetteColour.RED, validity);
    }

    @Override
    public int price() {
        switch (this.getValidity()) {
            case DAY:
                return DAY_PRICE_RED;
            case MONTH:
                return DAY_PRICE_RED * MONTH_MULTIPLIER;
            case YEAR:
                return DAY_PRICE_RED * YEAR_MULTIPLIER;
        }
        return 0;
    }

    @Override
    public Duration putOnGlass() {
        return Duration.ofSeconds(10);
    }
}
