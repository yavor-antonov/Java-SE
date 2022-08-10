package country;

import immigrants.Immigrant;
import immigrants.NormalImmigrant;


public class PoliceOfficer {
    public boolean immigrantPassesCheck (Immigrant immigrant){
        if ((immigrant.hasPassport()) || (immigrant.hasBomb())){
            return true;
        }
        return Math.random() > 0.5;
    }
}
