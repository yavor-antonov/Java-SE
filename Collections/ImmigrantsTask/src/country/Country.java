package country;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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
}
