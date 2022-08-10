package immigrants;

import java.util.ArrayList;
import java.util.List;

public class Extremist extends RadicalImmigrant{

    public Extremist() {
        super(null);
    }

    @Override
    public boolean hasBomb() {
        for (int i = 0; i < getWeaponsList().size(); i++) {
            if (getWeaponsList().get(i).getType() == WeaponTypes.BOMB){
                return true;
            }
        }
        return false;
    }

    @Override
    public void buyWeapon(Weapon weapon) throws ImmigrantException {
        super.buyWeapon(weapon);
    }
}
