package immigrants;

import java.util.ArrayList;
import java.util.List;

public class RadicalImmigrant extends Immigrant{
    private List<Weapon> weaponsList = new ArrayList<>(5);
    public RadicalImmigrant(Passport passport) {
        super(passport);
    }

    @Override
   public void buyWeapon(Weapon weapon)throws ImmigrantException{
        int weaponSize=5;
        if (this instanceof Extremist){
            weaponSize= Integer.MAX_VALUE;
        }
        if ((weapon != null) && (weaponsList.size()<=weaponSize)){
            if (weapon.getPriceBlackMarket() > getCash()){
                throw new ImmigrantException("Not enough money.Very angry");
            }
            if (weapon instanceof ExplodingWeapon){
                if (this instanceof Extremist){
                    weaponsList.add(weapon);
                }else{
                    System.out.println("Cannot buy a bomb");
                }
            }else{
                weaponsList.add(weapon);
            }
        }
    }

    @Override
    public boolean hasBomb() {
        return false;
    }

    public List<Weapon> getWeaponsList() {
        return weaponsList;
    }

    public void startShooting() throws BombExplodedException {
        if (getCurrentCity()!= null) {
            for (int i = 0; i < weaponsList.size(); i++) {
                try {
                    getCurrentCity().casualties(weaponsList.get(i).shoot());
                } catch (BombExplodedException e) {
                    System.out.println(getCurrentCity() + " destroyed!");
                    getCurrentCountry().removeCity(getCurrentCity());
                }

            }
        }
    }
}
