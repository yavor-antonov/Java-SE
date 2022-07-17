package court;

public class CriminalCase extends Case{
    Prosecutor accuser;

    public CriminalCase(Judge judge, Juror[] jurors, Defendant defendant,Prosecutor accuser,Witness [] witnesses) {
        super(judge, jurors, defendant);
        this.jurors = jurors;
        this.witnesses = witnesses;
        this.accuser = accuser;
    }

    @Override
    public void carryOut() {
       increaseNumberOfCasesForLegalEntities();
        askQuestionDefendant(accuser,5);
        askQuestionWitnesses(accuser,5);
        for (Lawyer lawyer:this.defendant.getLawyers()) {
            askQuestionWitnesses(lawyer,5);
        }
        passSentence(isGuilty());

    }

    @Override
    void increaseNumberOfCasesForLegalEntities() {
        super.increaseNumberOfCasesForLegalEntities();
            this.accuser.increaseNumberOfCases();
    }



}
