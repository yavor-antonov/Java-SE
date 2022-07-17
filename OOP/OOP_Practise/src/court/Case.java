package court;

public abstract class Case implements ICase{
    Judge judge;
    Juror[] jurors;
    Defendant defendant;
    Witness [] witnesses;

    public Case(Judge judge, Juror[] jurors, Defendant defendant) {
        this.judge = judge;
        this.jurors = jurors;
        this.defendant = defendant;
    }
    void askQuestionWitnesses(LegalEntity legalEntity, int numberOfQuestions){
        for (Witness witness:this.witnesses) {
            for (int index = 1; index<= numberOfQuestions; index++) {
                legalEntity.askQuestion(witness);
            }
        }
    }
    void askQuestionDefendant(LegalEntity legalEntity, int numberOfQuestions){
        for (int index = 1; index<= numberOfQuestions; index++) {
            legalEntity.askQuestion(defendant);
        }

    }

    void increaseNumberOfCasesForLegalEntities(){
        this.judge.increaseNumberOfCases();
        for (Juror juror:jurors) {
            juror.increaseNumberOfCases();
        }
        for (Lawyer lawyer:defendant.getLawyers()) {
            lawyer.increaseNumberOfCases();
        }
    }

    boolean isGuilty(){
        int guiltyCounter =0;
        for (Juror jurors:this.jurors) {
            if (Math.random()>0.55){
                System.out.println(jurors.name + ": Guilty");
                guiltyCounter++;
            }else{
                System.out.println(jurors.name + ": Innocent");
            }
        }
        System.out.println("Guilty " + guiltyCounter + ":" + (jurors.length-guiltyCounter) + " Innocent");
        if (guiltyCounter>this.jurors.length/2){
            return true;
        }
        return false;
    }

    void passSentence(boolean isGuilty){
        if (isGuilty) {
            int sentence = (int) (Math.random() * 37) + 3;
            System.out.println("Sentence: " + sentence + " years");
        }else{
            System.out.println("Sentence: Not guilty!");
        }
    }


}
