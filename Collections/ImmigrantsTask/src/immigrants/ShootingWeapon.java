package immigrants;

import java.util.Random;

public class ShootingWeapon extends Weapon{

    private int bullets;

    public ShootingWeapon(double priceBlackMarket) {
        super(priceBlackMarket,Math.random()>0.5 ? WeaponTypes.PISTOL:WeaponTypes.RIFLE);
        if (getType() == WeaponTypes.PISTOL){
            this.bullets = 6;
        }else {
            this.bullets = 30;
        }
    }

    @Override
    public int shoot() {
        return (int) (((new Random().nextInt(60) + 10) / 100.0) * bullets);
    }



}

