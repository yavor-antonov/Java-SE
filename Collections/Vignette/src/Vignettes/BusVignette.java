package Vignettes;

import java.time.Duration;

public class BusVignette extends Vignette {
    public BusVignette(VignetteValidity validity) {
        super(VignetteColour.GREEN, validity);
    }

    @Override
    public int price() {
        switch (this.getValidity()) {
            case DAY:
                return DAY_PRICE_GREEN;
            case MONTH:
                return DAY_PRICE_GREEN * MONTH_MULTIPLIER;
            case YEAR:
                return DAY_PRICE_GREEN * YEAR_MULTIPLIER;
        }
        return 0;
    }

    @Override
    public Duration putOnGlass() {
        return Duration.ofSeconds(20);
    }
}
