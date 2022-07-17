package Car;

public class Car {
    private static final int SPEED_TO_INCREASE = 30;

    private static final char NEUTRAL_GEAR = 'N';
    private static final char REVERSE_GEAR = 'R';

    private static final int DEFAULT_MAX_SPEED = 250;

    private static final String ANOTHER_COLOR_FOR_MORE_EXPENSIVE_CAR_FOR_SCRAP = "black";

    private static final String COLOR_FOR_MORE_EXPENSIVE = "red";

    private static final float INITIAL_COEFF_FOR_SCRAP = 0.2f;

    final float COEFF_TO_ADD_FOR_SCRAP = 0.05f;
    private String model;
    private float price;
    private boolean isSportsCar;
    private short maxSpeed;
    private int currentSpeed;
    private String color;
    private char currentGear;

    private Person owner;

    Car(String model, boolean isSportCar, String color){
        this.setModel(model);
        this.setSportsCar(isSportCar);
        this.setColor(color);

        this.maxSpeed = DEFAULT_MAX_SPEED;
        this.currentSpeed = 0;
        this.currentGear=NEUTRAL_GEAR;
    }

    void startEngine(){
        System.out.println("Engine started!");
    }


    void accelerate(){
        if (currentSpeed < maxSpeed){
            currentSpeed+=SPEED_TO_INCREASE;
        }else{
            System.out.println("At maximum speed");
        }
    }
    void changeGearUp(){
        if (currentGear==NEUTRAL_GEAR){
            currentGear='1';
            return;
        }
        if (currentGear==REVERSE_GEAR){
            currentGear=NEUTRAL_GEAR;
        }
        if (currentGear<'5'){
            currentGear++;
        }else{
            System.out.println("At maximum gear");
        }
    }
    void changeGearDown(){
        if (currentGear>1){
            currentGear--;
        }else{
            System.out.println("You are at: " + currentGear + "Cannot change gear down");
        }
    }
    void changeGear(char nextGear){
        if ((nextGear >=1 && nextGear<=5) || (nextGear == REVERSE_GEAR || nextGear == NEUTRAL_GEAR)){
            this.currentGear = nextGear;
        }else{
            System.out.println("Invalid gear");
        }
    }
    void changeColor(String newColor){
        if (!newColor.equals(null) || !newColor.equals("")) {
            this.color = newColor;
        }
    }

    boolean isMoreExpensive(Car car){
        return (this.price>car.price);
    }

    float calculateCarPriceForScrap(float metalPrice){
        if (metalPrice>0){
        float coef = INITIAL_COEFF_FOR_SCRAP;
        if (this.color!=(null)) {
            if (this.color.equalsIgnoreCase(COLOR_FOR_MORE_EXPENSIVE) || this.color.equalsIgnoreCase(ANOTHER_COLOR_FOR_MORE_EXPENSIVE_CAR_FOR_SCRAP)) {
                coef += COEFF_TO_ADD_FOR_SCRAP;
            }
        }
        if (this.isSportsCar){
            coef+=COEFF_TO_ADD_FOR_SCRAP;
        }
        return metalPrice*coef;
        }
        return 0;
    }
    void changeOwner(Person newOwner){
        if (this.owner != newOwner){
            if (this.owner != null) {
                this.owner.ownCar = null;
            }

            this.owner = newOwner;

            if (this.owner != null) {
                this.owner.ownCar = this;
            }
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.equals("")) {
            this.model = model;
        }else{
            this.model = "No model";
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price>0) {
            this.price = price;
        }
    }

    public boolean isSportsCar() {
        return isSportsCar;
    }

    public void setSportsCar(boolean sportsCar) {
        isSportsCar = sportsCar;
    }

    public short getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(short maxSpeed) {
        if (maxSpeed>0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed>=0 && currentSpeed<=this.maxSpeed) {
            this.currentSpeed = currentSpeed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.equals("")) {
            this.color = color;
        }else{
            this.color = "White";
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(char currentGear) {
        if (currentGear>='1' && currentGear<='5' || currentGear == 'R' || currentGear =='N') {
            this.currentGear = currentGear;
        }else{
            this.currentGear = 1;
        }
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        if (owner != null) {
            this.owner = owner;
        }
    }
}
