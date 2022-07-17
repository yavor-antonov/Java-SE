package Excersice.Zoo;

abstract class Animal {
    private int age;
    private double weight;
    public void breathe() {
        System.out.println("Breathing...");
    }
    public void walk() {
        System.out.println("Walking...");
    }
    public abstract void makeSomeNoise();
}
