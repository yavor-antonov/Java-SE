package country;

import immigrants.Immigrant;
import immigrants.RadicalImmigrant;

import java.util.*;

public class City {
    private String name;
    private List <PoliceOfficer>listOfPoliceOfficers;
    private int population;
    private Set<Immigrant> immigrants;

    public City(String name) {
        this.name = name;
        this.listOfPoliceOfficers = new ArrayList<>();
        this.population = (new Random().nextInt(10000))+2000;
        this.immigrants = new TreeSet<>((i1,i2) -> i1.getCash()- i2.getCash());
    }

    public void addPoliceOfficer(){
        if (Math.random() > 0.3) {
            listOfPoliceOfficers.add(new PoliceOfficer());
        } else {
            listOfPoliceOfficers.add(new SpecialPoliceOfficer());
        }
    }

    public void casualties(int number){
        if (number > 0){
            this.population-=number;
        }
    }

    public boolean checkImmigrant(Immigrant immigrant){
        PoliceOfficer policeOfficer = listOfPoliceOfficers.get(new Random().nextInt(listOfPoliceOfficers.size()));
        if (policeOfficer.immigrantPassesCheck(immigrant)){
            System.out.println(immigrant + " passes inspection");
            this.immigrants.add(immigrant);
            return true;
        }else{
            System.out.println("Illegal immigrant caught");
            return false;
        }
    }

    public void removeImmigrant(RadicalImmigrant radicalImmigrant){
        immigrants.remove(radicalImmigrant);
    }

    @Override
    public String toString() {
        return this.name;
    }
    public void printCityInfo(){
        System.out.println(this + " population: " + this.population);
    }
}
