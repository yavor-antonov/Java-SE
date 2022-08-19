import Vehicles.*;
import Vignettes.*;


import java.time.LocalDate;
import java.util.*;

public class Driver {
    private String name;
    private List <Vehicle>vehicles;
    private int money;
    private GasStation gasStation;

    public Driver(String name, int money,GasStation gasStation) {
        if (name!=null && (!name.equals("")) && gasStation!=null) {
            this.name = name;
            this.vehicles = new ArrayList<Vehicle>();
            this.money = money;
            this.gasStation = gasStation;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public void buyVignette (int indexOfVehicle, VignetteValidity vignetteValidity){
        if (indexOfVehicle < 0 || indexOfVehicle > (vehicles.size()-1)){
            System.out.println("Wrong index of Vehicle.Vehicle");
            return;
        }
        Vehicle vehicle = vehicles.get(indexOfVehicle);
        System.out.println(vehicle);
        if (this.gasStation.priceInquiry(vehicle.getType(),vignetteValidity)<=this.money) {
            Vignette vignette = this.gasStation.sellVignette(vehicle.getType(), vignetteValidity);
            if (vignette != null) {
                vehicle.setVignette(vignette);
            }else{
                System.out.println("No available vignettes at the gas Station");
                return;
            }
        }else{
            System.out.println("Not enough money");
            return;
        }
        this.money-= vehicle.getVignette().price();
    }

    public void buyVignetteForAllVehiclesRandomValidity(){
        for (int index = 0; index < this.vehicles.size();index++){
            buyVignette(index,VignetteValidity.randomValidity());
        }

    }

    public void vehiclesWithExpiredVignette(LocalDate date){
        for (int i = 0; i< vehicles.size();i++){
            Vehicle vehicle = vehicles.get(i);
            if (vehicle.getVignette()==null){
                System.out.println("Vehicle.Vehicle number: " + (i+1) + " No vignette available");
                return;
            }
            LocalDate expiryDate = vehicle.getVignette().getSoldDate();

            switch (vehicle.getVignette().getValidity()){
                case DAY:expiryDate = expiryDate.plusDays(1);break;
                case MONTH:expiryDate = expiryDate.plusMonths(1);break;
                case YEAR:expiryDate = expiryDate.plusYears(1);
            }
            if (expiryDate.compareTo(date)<0){
                System.out.println("===========================");
                System.out.println("Vehicle.Vehicle number: " + (i+1));
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

    public List<Vehicle> getVehicles() {
        return Collections.unmodifiableList(this.vehicles);
    }

    public void printInfo(){
        System.out.println(name + " , money:" + money + " Number of vehicles: " + vehicles.size());
    }
}
