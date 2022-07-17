package Excersice.Zoo;

public class Zoo {
    private Animal [] animals;

    public Zoo(int cages) {
        this.animals = new Animal[cages];
    }

    void addAnimal(Animal newAnimal){
        for (int index=0; index< animals.length; index++){
            if (animals[index]==null){
                animals[index] = newAnimal;
                return;
            }
        }
        System.out.println("No free cages for more animals!");
    }

    Animal[] getAnimals(){
        return animals;
    }
}
