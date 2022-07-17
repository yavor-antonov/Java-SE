package court;

public class Judge extends LegalEntity{


    public Judge(String name, byte experience, byte numberOfCases) {
        super(name, experience, numberOfCases);
        if (experience<5){
            this.experience=5;
        }
    }



    @Override
    public void logNotes() {

    }
}
