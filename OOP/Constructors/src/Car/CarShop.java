package Car;

import java.util.Arrays;

public class CarShop {
    Car [] arrayOfCars;
    static int currentCar =0;

    public CarShop(int capacity) {
        if (capacity>0) {
            this.arrayOfCars = new Car[capacity];
        }
    }

    boolean addCar(Car car){
        if (car==null){
            return false;
        }
        for (int index=0;index<this.arrayOfCars.length;index++){
            if(this.arrayOfCars[index]==null){
                this.arrayOfCars[index] = car;
                return true;
            }
        }
        return false;
    }
    Car showCurrentCar(){
        return this.arrayOfCars[this.currentCar];
    }
    Car getNextCar(){
        return this.arrayOfCars[this.currentCar+1];
    }

    void sellNextCar (Person buyer){
        if (buyer==null){
            return;
        }
        buyer.ownCar = getNextCar();
        getNextCar().owner = buyer;
    }
}
