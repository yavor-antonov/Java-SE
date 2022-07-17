package Car;

public class SportCar extends Car{
    private boolean isCabriolet;

    public SportCar(String model, String color) {
        super(model, true, color);
    }
    @Override
    void startEngine(){
        super.startEngine();
        this.switchTurbo();
    }

    void switchTurbo(){
        System.out.println("Turbo started");
    }
}
