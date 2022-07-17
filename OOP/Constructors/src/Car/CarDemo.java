package Car;

public class CarDemo {
    public static void main(String[] args) {
        Car bmw = new Car("320",true,"Silver");
        Car opel = new Car("Omega",false,"Green");

        bmw.price = 30_000f;
        bmw.maxSpeed = 250;
        bmw.currentSpeed = 120;
        bmw.currentGear = 5;

        opel.price = 10_000f;
        opel.maxSpeed = 210;
        opel.currentSpeed = 30;
        opel.currentGear = 3;

        Person georgi = new Person();
        georgi.name = "Georgi Georgiev";
        georgi.age = 34;
        georgi.buyCar(bmw);

        Person ivan = new Person();
        ivan.name = "Ivan Ivanov";
        ivan.age = 25;

        georgi.friend = ivan;
        ivan.friend = georgi;

        System.out.println("Bmw owner - " + bmw.owner.name + ". Age - " + bmw.owner.age);
        System.out.println(bmw.isMoreExpensive(opel));
        System.out.println(opel.isMoreExpensive(bmw));
    }
}
