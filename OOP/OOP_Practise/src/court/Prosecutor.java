package court;

public class Prosecutor extends LegalEntity{
    public Prosecutor(String name, byte experience, byte numberOfCases) {
        super(name, experience, numberOfCases);
        if (experience<10){
            this.experience=10;
        }
    }



    @Override
    public void logNotes() {

    }
}
