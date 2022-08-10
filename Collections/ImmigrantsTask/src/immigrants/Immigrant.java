package immigrants;
import country.City;
import country.Country;

import java.util.*;

public abstract class Immigrant {
    private Passport passport;
    private int cash;
    private City currentCity;
    private Country currentCountry;
    private Set<Immigrant> relatives = new HashSet<>();

    public Immigrant(Passport passport) {
        this.passport = passport;
        this.cash = (new Random().nextInt(10000)) + 5000;
        this.relatives = new HashSet<>(10);
    }

    public static class Passport {
        private String name;
        private int age;
        private String birthPlace;

        public Passport(String name, int age, String birthPlace){
            this.name = name;
            this.age = age;
            this.birthPlace = birthPlace;
        }
    }

    public void immigrate(City city,Country country){
        if (city.checkImmigrant(this)){
            this.currentCity=city;
            this.currentCountry = country;
            System.out.println(this + " immigrated to " + city);
            for (Immigrant relative : relatives){
                System.out.println("Relative " + relative + " trying to immigrate to: " + city);
                relative.immigrate(city,country);
            }
        }
    }

    public abstract void buyWeapon(Weapon weapon) throws ImmigrantException;

    public void addRelatives(Immigrant immigrant){
        if (relatives.contains(immigrant)){
            System.out.println("Already is a relative");
            return;
        }
        if (immigrant != null){
            relatives.add(immigrant);
            immigrant.addRelatives(this);
        }
    }
    public abstract boolean hasBomb();

    public void printInfo (){
        System.out.println(this + " is currently in: " + currentCity + " Has passport: " + hasPassport() + " and has " + this.cash);
        System.out.print("Relatives: ");
        for (Immigrant relative: relatives){
            System.out.print(relatives + ",");
        }
        System.out.println();
    }

    public boolean hasPassport() {
        if (passport== null){
            return false;
        }else{
            return true;
        }
    }

    public int getCash() {
        return cash;
    }

    public City getCurrentCity() {
        return currentCity;
    }

    public Country getCurrentCountry() {
        return currentCountry;
    }

    public Set<Immigrant> getRelatives() {
        return relatives;
    }

    @Override
    public String toString() {
        return this.passport.name;
    }
}
