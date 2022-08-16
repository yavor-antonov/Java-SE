import java.util.Random;

public class VignetteDemo {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        generateVignette(200,gasStation);
        gasStation.printAvailableVignettes();
    }
    public static void generateVignette(int numberOfVignettes, GasStation gasStation){
        Vignette vignette = null;
        for (int i = 1; i<=numberOfVignettes; i++){
            Random rand = new Random();
            int colour=rand.nextInt(3)+1;
            int period=rand.nextInt(3)+1;
            switch (colour){
                case 1:switch (period){
                    case 1: vignette = new CarVignette(VignetteValidity.DAY); break;
                    case 2: vignette = new CarVignette(VignetteValidity.MONTH); break;
                    case 3: vignette = new CarVignette(VignetteValidity.YEAR);
                }
                case 2:switch (period) {
                    case 1: vignette = new BusVignette(VignetteValidity.DAY); break;
                    case 2: vignette = new BusVignette(VignetteValidity.MONTH); break;
                    case 3: vignette = new BusVignette(VignetteValidity.YEAR);
                }
                case 3:switch (period) {
                    case 1: vignette = new TruckVignette(VignetteValidity.DAY); break;
                    case 2: vignette = new TruckVignette(VignetteValidity.MONTH); break;
                    case 3: vignette = new TruckVignette(VignetteValidity.YEAR);
                }
            }
            gasStation.addVignette(vignette);
        }
    }
}
