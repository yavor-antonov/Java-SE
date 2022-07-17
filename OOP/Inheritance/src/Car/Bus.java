package Car;

public class Bus extends Car{
    private int numberOfSeats;
    private int placeForLuggage;

    public Bus(String model, String color) {
        super(model, false, color);
    }
}
