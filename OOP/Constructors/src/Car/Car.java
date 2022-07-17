package Car;

public class Car {
    String model;
    float price;
    boolean isSportsCar;
    short maxSpeed;
    int currentSpeed;
    String color;
    int currentGear;

    Person owner;

    Car(String model, boolean isSportCar, String color){
        if (model!=null && !model.equals("")) {
            this.model = model;
        }else{
            this.model = "No model";
        }
        this.isSportsCar=isSportCar;
        if (color!=null && !color.equals("")) {
            this.color = color;
        }else{
            this.color = "White";
        }
        this.maxSpeed = 200;
        this.currentSpeed = 0;
        this.currentGear=1;
    }


    void accelerate(){
        if (currentSpeed < maxSpeed){
            currentSpeed++;
        }else{
            System.out.println("At maximum speed");
        }
    }
    void changeGearUp(){
        if (currentGear<5){
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
    void changeGear(int nextGear){
        if (nextGear >=1 && nextGear<=5){
            currentGear = nextGear;
        }else{
            System.out.println("Invalid gear");
        }
    }
    void changeColor(String newColor){
        color = newColor;
    }

    boolean isMoreExpensive(Car car){
        return (this.price>car.price);
    }

    float calculateCarPriceForScrap(float metalPrice){
        if (metalPrice>0){
        float coef = 0.2f;
        if (this.color!=(null)) {
            if (this.color.equalsIgnoreCase("black") || this.color.equalsIgnoreCase("white")) {
                coef += 0.05;
            }
        }
        if (this.isSportsCar){
            coef+=0.05;
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
}
