package Excersice.Zoo;

public class Cat extends Animal{
    void climb() {
        System.out.println("Climbing...");
    } public void makeSomeNoise() {
        System.out.println("Myal myal...");
    }

    @Override
    public String toString() {
        return "Kotka";
    }
}
