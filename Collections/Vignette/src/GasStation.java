import java.time.LocalDate;
import java.util.*;

public class GasStation {
    private int revenue;
    private Map<Integer, LinkedList<Vignette>> vignettes;

    public GasStation() {
        this.revenue = 0;
        vignettes = new TreeMap<Integer, LinkedList<Vignette>>(Integer::compareTo);
    }
    public void addVignette(Vignette vignette){
        if (vignette != null){
            if (!vignettes.containsKey(vignette.price())){
                vignettes.put(vignette.price(), new LinkedList<Vignette>());
            }
            vignettes.get(vignette.price()).offer(vignette);
        }else{
            System.out.println("Invalid vignette");
        }
    }

    public Vignette sellVignette(VehicleType vehicleType,VignetteValidity vignetteValidity){
        VignetteColour vignetteColour;
        switch (vehicleType){
            case CAR:vignetteColour = VignetteColour.BLUE;
                break;
            case BUS:vignetteColour = VignetteColour.GREEN;
                break;
            case TRUCK:vignetteColour = VignetteColour.RED;
                break;
            default:
                throw new IllegalStateException("Unexpected value");
        }
        int price = Vignette.price(vignetteColour,vignetteValidity);
        if (vignettes.get(price).peek() != null){
            revenue+=price;
            vignettes.get(price).peek().setSoldDate(LocalDate.now());
        }
        return vignettes.get(price).poll();
    }

    public int priceInquiry(VehicleType vehicleType, VignetteValidity vignetteValidity){
        VignetteColour vignetteColour;
        switch (vehicleType){
            case CAR:vignetteColour = VignetteColour.BLUE;
                break;
            case BUS:vignetteColour = VignetteColour.GREEN;
                break;
            case TRUCK:vignetteColour = VignetteColour.RED;
                break;
            default:
                throw new IllegalStateException("Unexpected value");
        }
        return Vignette.price(vignetteColour,vignetteValidity);
    }
}
