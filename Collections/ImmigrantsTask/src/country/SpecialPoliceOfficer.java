package country;

import immigrants.Immigrant;

public class SpecialPoliceOfficer extends PoliceOfficer{
    @Override
    public boolean immigrantPassesCheck(Immigrant immigrant) {
        if (immigrant.hasPassport()){
            return true;
        }
        return Math.random() > 0.1;
    }
}
