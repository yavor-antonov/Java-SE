package court;

public abstract class LegalEntity extends Person implements ILegalEntity{
    byte experience;
    byte numberOfCases;

    public LegalEntity(String name, byte experience, byte numberOfCases) {
        super(name);

        if (experience<0){
            this.experience = 0;
        }else{
            this.experience = experience;
        }

        if (numberOfCases <0){
            this.numberOfCases = 0;
        }else{
            this.numberOfCases = numberOfCases;
        }


    }

    public void increaseNumberOfCases(){
        this.numberOfCases++;
    }

    @Override
    public void askQuestion(Citizen citizen) {
        System.out.println(this.name + " asked " + citizen.name +" a question!");

    }
}
