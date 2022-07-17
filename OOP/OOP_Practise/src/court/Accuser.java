package court;

public class Accuser extends CitizenWithLawyer{
    private Lawyer [] lawyers;
    public Accuser(String name, String address, byte age) {
        super(name, address, age);
    }

    public void setLawyers(Lawyer[] lawyers) {
        this.lawyers = lawyers;
    }

    public Lawyer[] getLawyers() {
        return lawyers;
    }
}
