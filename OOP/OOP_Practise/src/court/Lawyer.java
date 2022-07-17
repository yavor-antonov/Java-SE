package court;

public class Lawyer extends LegalEntity{
    public Lawyer(String name, byte experience, byte numberOfCases) {
        super(name, experience, numberOfCases);
        if (numberOfCases<10){
            this.numberOfCases=10;
        }
    }



    @Override
    public void logNotes() {

    }
}
