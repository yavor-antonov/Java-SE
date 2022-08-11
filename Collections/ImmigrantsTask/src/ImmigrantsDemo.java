import country.*;
import immigrants.*;

import java.util.*;

public class ImmigrantsDemo {
    private static final int NUMBER_OF_SHOOTERS = 20;
    private static final int NUMBER_OF_CITIES = 5;
    private static final int NUMBER_OF_POLICE = 50;
    private static final int NUMBER_OF_IMMIGRANTS = 100;
    private static final int NUMBER_OF_WEAPONS = 200;
    public static void main(String[] args) throws ImmigrantException {

        Country bulgaria = new Country("Bulgaria");


        for (int i = 1; i <=NUMBER_OF_CITIES ; i++) {
            bulgaria.addCity(new City("City " + i));
        }
        for (City city: bulgaria.getCities()) {
            for (int i = 1; i<=NUMBER_OF_POLICE/NUMBER_OF_CITIES;i++){
                city.addPoliceOfficer();
            }
        }

        List<Immigrant> immigrants = new ArrayList<Immigrant>(NUMBER_OF_IMMIGRANTS);
        generateImmigrants(immigrants);

        List<Weapon> weapons = new ArrayList<Weapon>();
        generateWeapons(weapons);

        for(Immigrant immigrant : immigrants){
            for (int i =1 ; i<=5;i++){
                if (weapons.size()==0){
                    break;
                }
                int index = new Random().nextInt(weapons.size());
                if (immigrant instanceof RadicalImmigrant) {
                    try {
                        immigrant.buyWeapon(weapons.get(index));
                        weapons.remove(index);
                    } catch (ImmigrantException e) {
                        e.printStackTrace();
                    }
                }
            }

            immigrant.immigrate(bulgaria.giveMeRandomCity(),bulgaria);
        }

        for(Immigrant immigrant : immigrants){
            immigrant.printInfo();
        }

        for (int i = 1 ; i<=NUMBER_OF_SHOOTERS;i++){
            int index = new Random().nextInt(immigrants.size());
            Immigrant immigrant = immigrants.get(index);
            if (immigrant instanceof RadicalImmigrant) {
                try {
                    ((RadicalImmigrant) immigrant).startShooting();
                }catch (BombExplodedException e){
                    System.out.println("Bomb exploded");
                }

            }
        }



    }
    private static void generateImmigrants(List<Immigrant> immigrants) {
        for (int count = 1; count <= NUMBER_OF_IMMIGRANTS; count += 3) {
            Immigrant immigrant = generateImmigrant();
            Immigrant relative1 = generateImmigrant();
            Immigrant relative2 = generateImmigrant();

            immigrant.addRelatives(relative1);
            immigrant.addRelatives(relative2);
            relative1.addRelatives(relative2);

            immigrants.addAll(Arrays.asList(immigrant, relative1, relative2));
        }
    }
    private static Immigrant generateImmigrant() {
        double rand = Math.random();
        if (rand < 0.25) {
            return new RadicalImmigrant(Math.random()>0.35 ? null : new Immigrant.Passport("Abdul",25,"Secret"));
        }
        if ((rand > 0.25) && (rand < 0.60)) {
            return new Extremist();
        }
        return new NormalImmigrant();
    }
    private static void generateWeapons(List<Weapon> weapons) {
        for (int count = 1; count <= NUMBER_OF_WEAPONS; count++) {
            double price = (Math.random()*2000) + 1000;
            if (Math.random() < 0.75) {
                weapons.add(new ShootingWeapon(price));
            } else {
                weapons.add(new ExplodingWeapon(price));
            }
        }
    }
}
