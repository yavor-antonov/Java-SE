package Car;

public class CarShop {
    public static final int DEFAULT_CAPACITY = 10;
    private Car [] arrayOfCars;
    private int currentFreePlace =0;
    private int currentCar=0;

    public CarShop(int capacity) {
        if (capacity>0) {
            this.arrayOfCars = new Car[capacity];
        }else{
            this.arrayOfCars = new Car[DEFAULT_CAPACITY];
        }
    }

    public boolean addCar(Car car){
        if (car!=null&&currentFreePlace<arrayOfCars.length){
            this.arrayOfCars[currentFreePlace] = car;
            currentFreePlace++;
            return true;
        }
        return false;
    }
    public Car getNextCar(){
        if (currentCar>=arrayOfCars.length){
            currentCar=0;
        }
        return this.arrayOfCars[currentCar++];
    }

    void sellNextCar (Person buyer){
        if (buyer==null){
            return;
        }
        Car currentCar = this.getNextCar();
        if (currentCar!=null){
            buyer.buyCar(currentCar);
            this.removeCar(currentCar);
        }
    }

    public boolean removeCar(Car car){
        for (int carIndex=0; carIndex<this.arrayOfCars.length;carIndex++){
            if (this.arrayOfCars[carIndex]!= null){
                if (this.arrayOfCars[carIndex].equals(car)){
                    this.arrayOfCars[carIndex] = null;
                    return true;
                }
            }
        }
        return false;
    }

    void showAllCarsInTheShop(){
        for (Car car: this.arrayOfCars) {
            if (car!=null){
                System.out.println(car);
            }
        }
    }
}
