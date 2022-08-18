import java.time.Period;
import java.util.Random;

public enum VignetteValidity {
    DAY,MONTH,YEAR;
    public static VignetteValidity randomValidity(){
        int randomValidity = new Random().nextInt(3)+1;
        switch (randomValidity){
            case 1: return DAY;
            case 2: return MONTH;
            case 3: return YEAR;
        }
        return null;
    }
}
