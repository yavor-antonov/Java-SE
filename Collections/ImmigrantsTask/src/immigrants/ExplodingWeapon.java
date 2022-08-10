package immigrants;

public class ExplodingWeapon extends Weapon{
    public ExplodingWeapon(double priceBlackMarket) {
        super(priceBlackMarket, WeaponTypes.BOMB);
    }

    @Override
    public int shoot() throws BombExplodedException {
        throw new BombExplodedException("Bomb exploded");
    }
}
