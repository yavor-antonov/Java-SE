package Car;

public class Person {
    String name;
    int age;
    float weight;
    long personalNumber;
    boolean isMale;
    float money=50_000f;
    Car ownCar;
    Person friend;
    Person [] friends;
    Person(){
        this.age = 0;
        this.weight = 4f;
        this.friends = new Person[3];
    }
    Person(String name, long personalNumber, boolean isMale){
        this();
        this.personalNumber=personalNumber;
        this.isMale=isMale;

    }



    void eat() {
        System.out.println("Eating...");
    }
    void walk() {
        System.out.println(name + " is walking");
    }
    void growUp() {
        age++;
    }
    void drinkWater(double liters) {
        if(liters > 1) {
            System.out.println("This is too much water!!!");
        } else {
            System.out.println(name + " is drinking " + liters + " water.");
        }
    }

    void buyCar(Car car){
        if (car != null) {
            if ((this.money >= car.getPrice() && (car.getPrice()>0))) {
                this.money -= car.getPrice();
                car.changeOwner(this);
            }
        }
    }

    float sellCarForScrap(){
        if (this.ownCar != null) {
            this.money += this.ownCar.calculateCarPriceForScrap(1000);
            this.ownCar.changeOwner(null);
            this.ownCar = null;
        }
       return this.money;
    }
}
