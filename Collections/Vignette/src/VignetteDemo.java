import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VignetteDemo {

    public static final int NUMBER_OF_VIGNETTES = 200;
    public static final int NUMBER_OF_DRIVERS = 20;
    public static final int NUMBER_OF_VEHICLES = 200;
    public static final int VEHICLES_PER_DRIVER = 10;

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        generateVignette(NUMBER_OF_VIGNETTES,gasStation);
        gasStation.printAvailableVignettes();

        List<Driver> drivers = generateDrivers(NUMBER_OF_DRIVERS,gasStation);
        List<Vehicle> vehicles = generateVehicles(NUMBER_OF_VEHICLES);
        addVehiclesToDrivers(drivers,vehicles);

        for (int index =0; index<drivers.size();index++){
            Random rand = new Random();
            Driver driver = drivers.get(index);
            if ((index+1)%3==0){ // Every 3rd driver
                int counter =0;
                while (true){
                    int randomVehicleIndex = rand.nextInt(driver.getVehicles().size());
                    if (driver.getVehicles().get(randomVehicleIndex).getVignette()==null){
                        driver.buyVignette(randomVehicleIndex,VignetteValidity.randomValidity());
                        counter++;
                    }
                    if (counter>=5){
                        break;
                    }
                }
            }else{
                driver.buyVignetteForAllVehiclesRandomValidity();
            }
        }
        for(Driver driver : drivers){
            driver.printInfo();
            driver.vehiclesWithExpiredVignette(LocalDate.now().plusMonths(6));
        }

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
                } break;
                case 2:switch (period) {
                    case 1: vignette = new BusVignette(VignetteValidity.DAY); break;
                    case 2: vignette = new BusVignette(VignetteValidity.MONTH); break;
                    case 3: vignette = new BusVignette(VignetteValidity.YEAR);
                } break;
                case 3:switch (period) {
                    case 1: vignette = new TruckVignette(VignetteValidity.DAY); break;
                    case 2: vignette = new TruckVignette(VignetteValidity.MONTH); break;
                    case 3: vignette = new TruckVignette(VignetteValidity.YEAR);
                } break;
            }
            gasStation.addVignette(vignette);
        }

    }

    public static List<Driver> generateDrivers(int numberOfDrivers,GasStation gasStation){
        List<Driver> drivers = new ArrayList<Driver>();
        for (int i = 1; i<=numberOfDrivers; i++){
            drivers.add(new Driver("Name " + i,(int)((Math.random()*3000)+2000),gasStation));
        }
        return drivers;
    }

    public static List<Vehicle> generateVehicles(int numberOfVehicles){
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Vehicle vehicle = null;
        for (int i = 1; i<=numberOfVehicles; i++){
            Random rand = new Random();
            switch (rand.nextInt(3)+1){
                case 1: vehicle = new Car(); break;
                case 2: vehicle = new Bus(); break;
                case 3: vehicle = new Truck();
            }
            vehicles.add(vehicle);
        }
        return vehicles;
    }

    public static void addVehiclesToDrivers(List<Driver> drivers,List<Vehicle> vehicles){
        for (int i = 0; i<drivers.size(); i++){
            for (int j = 1; j<= VEHICLES_PER_DRIVER; j++){
                int randomVehicleIndex = new Random().nextInt(vehicles.size());
                drivers.get(i).addVehicle(vehicles.get(randomVehicleIndex));
                vehicles.remove(randomVehicleIndex);
            }
        }
    }
}
