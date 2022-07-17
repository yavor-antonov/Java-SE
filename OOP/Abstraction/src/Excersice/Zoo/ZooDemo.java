package Excersice.Zoo;

import java.util.Arrays;

public class ZooDemo {
    public static void main(String[] args) {
        Zoo disney = new Zoo(10);
        Animal jivotno = new Cat();
        Cat kotka = new Cat();
        Dog kuche = new Dog();

        disney.addAnimal(jivotno);
        disney.addAnimal(kotka);
        disney.addAnimal(kuche);
        System.out.println(Arrays.toString(disney.getAnimals()));
    }

}
