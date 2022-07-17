public class CarDemo {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car opel = new Car();

        bmw.model = "320";
        bmw.color = "Silver";
        bmw.maxSpeed = 250;
        bmw.currentSpeed = 120;
        bmw.currentGear = 5;

        opel.model = "Omega";
        opel.color = "Green";
        opel.maxSpeed = 210;
        opel.currentSpeed = 30;
        opel.currentGear = 3;

        Person georgi = new Person();
        georgi.name = "Georgi Georgiev";
        georgi.age = 34;
        bmw.owner = georgi;

        Person ivan = new Person();
        ivan.name = "Ivan Ivanov";
        ivan.age = 25;

        georgi.friend = ivan;
        ivan.friend = georgi;

        System.out.println("Bmw owner - " + bmw.owner.name + ". Age - " + bmw.owner.age);
    }
}
