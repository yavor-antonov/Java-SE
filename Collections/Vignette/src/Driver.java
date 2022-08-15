import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Driver {
    private String name;
    private List <Vehicle>vehicles;
    private int money;
    private GasStation gasStation;

    public Driver(String name, int money,GasStation gasStation) {
        this.name = name;
        this.vehicles = new ArrayList<Vehicle>();
        this.money = money;
        this.gasStation = gasStation;
    }

    public void buyVignette (int numberOfVehicle,VignetteValidity vignetteValidity){
        int indexVehicle = numberOfVehicle-1;
        if (indexVehicle < 0 || indexVehicle > (vehicles.size()-1)){
            System.out.println("Wrong index of Vehicle");
            return;
        }
        Vehicle vehicle = vehicles.get(indexVehicle);
        if (this.gasStation.priceInquiry(vehicle.getType(),vignetteValidity)<=this.money) {
            vehicle.setVignette(this.gasStation.sellVignette(vehicle.getType(), vignetteValidity));
        }else{
            System.out.println("Not enough money");
            return;
        }

        this.money-= vehicle.getVignette().price();
    }

    public void buyVignetteForAllVehicles(VignetteValidity vignetteValidity){
        for (int i = 0; i < this.vehicles.size();i++){
            buyVignette(i+1,vignetteValidity);
        }
    }

    public void vehiclesWithExpiredVignette(LocalDate date){
        for (int i = 0; i< vehicles.size();i++){
            Vehicle vehicle = vehicles.get(i);
            LocalDate expiryDate = vehicle.getVignette().getSoldDate();

            switch (vehicle.getVignette().getValidity()){
                case DAY:expiryDate = expiryDate.plusDays(1);
                case MONTH:expiryDate = expiryDate.plusMonths(1);
                case YEAR:expiryDate = expiryDate.plusYears(1);
            }
            if (expiryDate.compareTo(date)<0){
                System.out.println("===========================");
                System.out.println("Vehicle number: " + (i+1));
                System.out.println("Date " + date);
                System.out.println("Expiry date: " + expiryDate);
            }
        }
    }

    public void addVehicle(Vehicle vehicle){
        if ((vehicle != null) && (!(this.vehicles.contains(vehicle)))){
            this.vehicles.add(vehicle);
        }else{
            System.out.println("Unsuccessfull attempt to add vehicle");
        }
    }
}
