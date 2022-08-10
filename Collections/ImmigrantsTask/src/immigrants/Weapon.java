package immigrants;

public abstract class Weapon {
    private double priceBlackMarket;
    private WeaponTypes type;

    public Weapon(double priceBlackMarket, WeaponTypes type) {
        this.priceBlackMarket = priceBlackMarket;
        this.type = type;
    }

    public Weapon(double priceBlackMarket) {
     this.priceBlackMarket = priceBlackMarket;
    }

    public double getPriceBlackMarket() {
        return priceBlackMarket;
    }

    public WeaponTypes getType() {
        return type;
    }

    public abstract int shoot ()throws BombExplodedException;
}
enum WeaponTypes{
    BOMB,PISTOL,RIFLE

}
