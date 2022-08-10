package immigrants;

public class NormalImmigrant extends Immigrant{
    public NormalImmigrant() {
        super(new Passport("Hasan",25,"Somewhere"));
    }

    @Override
    public void buyWeapon(Weapon weapon) throws ImmigrantException {
        throw new ImmigrantException("I cannot buy a weapon!");
    }

    @Override
    public void addRelatives(Immigrant immigrant) {
        if (getRelatives().size()<=10) {
            super.addRelatives(immigrant);
        }else{
            System.out.println("Too many relatives");
        }
    }

    @Override
    public boolean hasBomb() {
        return false;
    }
}
