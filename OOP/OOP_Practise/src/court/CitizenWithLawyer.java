package court;

public abstract class CitizenWithLawyer extends Citizen{
    Lawyer[] lawyers;

    public CitizenWithLawyer(String name, String address, byte age) {
        super(name, address, age);
    }
}
