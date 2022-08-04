package setChallenge;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final BodyType bodyType;
    private final Set<HeavenlyBody> satellites;
    public enum BodyType{
        STAR,
        PLANET,
        MOON,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod,BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public final boolean equals(Object obj){
        if (this == obj){
            return true;
        }


        if (obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if (this.name.equals(theObject.getName())){
                return this.bodyType == theObject.getBodyType();
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }
}
