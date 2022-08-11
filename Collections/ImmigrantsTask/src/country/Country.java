package country;

import java.util.*;

public class Country {
    private String name;
    private Set<City> cities;

    public Country(String name) {
        this.name = name;
        this.cities = new HashSet<City>();
    }

    public void addCity(City city){
        cities.add(city);
    }
    public void removeCity(City city){
        cities.remove(city);
    }

    public Set<City> getCities() {
        return this.cities;
    }

    public City giveMeRandomCity() {
        return new ArrayList<City>(cities).get(new Random().nextInt(cities.size()));
    }


}
