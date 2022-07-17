package court;

import java.lang.reflect.Array;

public class Court {
    private static final int MAXIMUM_CASES = 10;
    private String name;
    private String address;
    LegalEntity [] legalEntities;
    private int legalEntitiesIndex = 0;

    private Case [] cases = new Case[MAXIMUM_CASES];
    private int casesIndex = 0;

    public Court(String name, String address, int numberOfLegalEntities) {
        this.name = name;
        this.address = address;
        if (numberOfLegalEntities>0) {
            this.legalEntities = new LegalEntity[numberOfLegalEntities];
        }else{
            this.legalEntities = new LegalEntity[20];
        }
    }

    void addLegalEntity (LegalEntity legalEntity){
        if (this.legalEntitiesIndex > legalEntities.length-1){
            System.out.println("Court is full)");
            return;
        }
        if (legalEntity!=null){
            this.legalEntities[this.legalEntitiesIndex]=legalEntity;
            this.legalEntitiesIndex++;
        }else{
            System.out.println("Cannot add legal entity");
        }
    }

    CivilCase createCivilCase(Citizen[] citizens){
        if (casesIndex >= MAXIMUM_CASES-1){
            System.out.println("Maximum number of cases reached");
            return null;
        }
        CivilCase temp = new CivilCase(
                addJudge(),
                addJurors(3),
                addDefendant(citizens),
                addAccuser(citizens),
                addWitnesses(citizens));
        if (temp.jurors == null){
            System.out.println("Cannot create case");
            return null;
        }
        temp.defendant.setLawyers(addLawyers());
        temp.accuser.setLawyers(addLawyers());
        this.cases[casesIndex] = temp;
        casesIndex++;
        return temp;
    }

    CriminalCase createCriminalCase(Citizen[] citizens){
        if (casesIndex >= MAXIMUM_CASES-1){
            System.out.println("Maximum number of cases reached");
            return null;
        }
        CriminalCase temp = new CriminalCase(
                addJudge(),
                addJurors(13),
                addDefendant(citizens),
                addProsecutor(),
                addWitnesses(citizens));

        if (temp.jurors == null){
            System.out.println("Cannot create case");
            return null;
        }
        temp.defendant.setLawyers(addLawyers());
        this.cases[casesIndex] = temp;
        casesIndex++;
        return temp;
    }

    Judge addJudge(){
        for (int index=0; index<500;index++){
            LegalEntity temp =  legalEntities[(int)(Math.random() * (legalEntities.length-1))];
            if (temp instanceof Judge) {
                return (Judge) temp;
            }
        }
        return null;
    }

    Prosecutor addProsecutor(){
        for (int index=0; index<500;index++){
            LegalEntity temp =  legalEntities[(int)(Math.random() * (legalEntities.length-1))];
            if (temp instanceof Prosecutor)
                return (Prosecutor)temp;
        }
        System.out.println("No prosecutor found");
        return null;
    }

    Lawyer [] addLawyers(){
        int maximumLawyers=((int)Math.random())+1;
        Lawyer [] tempLawyers= new Lawyer[maximumLawyers];
        for (int index=0; index<500;index++){
            if (maximumLawyers<1){
                return tempLawyers;
            }else{
                LegalEntity temp =  legalEntities[(int)(Math.random() * (legalEntities.length-1))];
                if (temp instanceof Lawyer) {
                    tempLawyers[maximumLawyers-1]= (Lawyer) temp;
                    maximumLawyers--;
                }
            }

        }
        System.out.println("Cannot find a lawyer!");
        return null;
    }
    Juror[] addJurors(int numberOfJurors){
        LegalEntity [] legalEntitiesTemp = legalEntities.clone();
        Juror[] temp = new Juror[numberOfJurors];
        int tempIndex = 0;
        for (int index=0; index< 500;index++) {
            if (tempIndex>temp.length-1){
                break;
            }
            int randomNumber = (int) (Math.random() * (legalEntitiesTemp.length - 1));
            LegalEntity juror = legalEntitiesTemp[randomNumber];
            if (juror instanceof Juror) {
                temp [tempIndex] = (Juror)juror;
                System.out.println("Added " + juror.name);
                tempIndex++;
                legalEntitiesTemp[randomNumber] = null;
            }

        }
        if (numberOfJurors-1 > tempIndex){
            System.out.println("Not enough jurors");
            return null;
        }
        return temp;
    }

    Defendant addDefendant(Citizen[] citizens){
        for (int index=0; index<50;index++){
            Citizen temp =  citizens[(int)(Math.random() * (citizens.length-1))];
            if (temp instanceof Defendant)
                return (Defendant) temp;
        }
        return null;
    }

    Accuser addAccuser(Citizen[] citizens){
        for (int index=0; index<50;index++){
            Citizen temp =  citizens[(int)(Math.random() * (citizens.length-1))];
            if (temp instanceof Accuser)
                return (Accuser) temp;
        }
        return null;
    }

    Witness[] addWitnesses(Citizen[] citizens){
        Citizen [] citizenTemp = citizens.clone();
        Witness[] temp = new Witness[(int) (Math.random() * 2) + 1];
        int tempIndex = 0;
        for (int index=0; index< 500;index++) {
            if (tempIndex>temp.length-1){
                break;
            }
            int randomNumber = (int) (Math.random() * (citizenTemp.length - 1));
            Citizen witness = citizenTemp[randomNumber];
            if (witness instanceof Witness) {
                temp [tempIndex] = (Witness) witness;
                System.out.println("Added " + witness.name);
                tempIndex++;
                citizenTemp[randomNumber] = null;
            }

        }
        return temp;
    }


}
