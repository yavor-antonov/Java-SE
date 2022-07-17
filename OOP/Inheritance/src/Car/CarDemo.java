package Car;

public class CarDemo {
    public static void main(String[] args) {
        Car bmw = new Car("320",true,"Silver");
        Car opel = new Car("Omega",false,"Green");

        bmw.setPrice(30_000f);
        bmw.setMaxSpeed((short) 250);
        bmw.setCurrentSpeed(120);
        bmw.setCurrentGear('5');

        opel.setPrice(10_000f);
        opel.setMaxSpeed((short)120);
        opel.setCurrentSpeed(30);
        opel.setCurrentGear('3');
        opel.changeGear('N');

        Person georgi = new Person();
        georgi.name = "Georgi Georgiev";
        georgi.age = 34;
        georgi.buyCar(bmw);

        Person ivan = new Person();
        ivan.name = "Ivan Ivanov";
        ivan.age = 25;

        georgi.friend = ivan;
        ivan.friend = georgi;

        System.out.println("Bmw owner - " + bmw.getOwner().name + ". Age - " + bmw.getOwner().age);
        System.out.println(bmw.isMoreExpensive(opel));
        System.out.println(opel.isMoreExpensive(bmw));

        new SportCar("Z180","White").startEngine();

        CarShop magazin = new CarShop(1);
        Car[] testCars = {new Car("Lada",false,"Pink"),
                            new Car("Moskvich",true,"Blue"),
                            new Car("Trabant",false,"Gray"),
                            new Car("Shokda",true,"Red")};

        for (Car car:testCars){
            magazin.addCar(car);
        }
        magazin.showAllCarsInTheShop();
    }
}
