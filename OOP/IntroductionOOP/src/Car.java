import java.awt.*;

public class Car {
    String model;
    short maxSpeed;
    int currentSpeed;
    String color;
    int currentGear;

    Person owner;

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
}
