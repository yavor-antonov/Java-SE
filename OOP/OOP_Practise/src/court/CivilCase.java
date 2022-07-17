package court;

public class CivilCase extends Case{
    public static final int NUMBER_OF_QUESTION_TO_WITNESSES = 5;
    Accuser accuser;
    public CivilCase(Judge judge, Juror[] jurors, Defendant defendant,Accuser accuser, Witness[] witnesses) {
        super(judge, jurors, defendant);
        this.jurors = jurors;
        this.witnesses = witnesses;
        this.accuser =accuser;
    }

    @Override
    public void carryOut() {
        increaseNumberOfCasesForLegalEntities();

        for (Lawyer lawyer:this.accuser.getLawyers()) {
            askQuestionDefendant(lawyer,3);
            askQuestionWitnesses(lawyer,2);
        }
        for (Lawyer lawyer:this.defendant.getLawyers()) {
            askQuestionWitnesses(lawyer,5);
        }
        passSentence(isGuilty());


    }

    @Override
    void increaseNumberOfCasesForLegalEntities() {
        super.increaseNumberOfCasesForLegalEntities();
        for (Lawyer lawyer:this.accuser.getLawyers()) {
            lawyer.increaseNumberOfCases();
        }
    }
}
