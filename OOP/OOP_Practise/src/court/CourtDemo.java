package court;

import java.util.Arrays;

public class CourtDemo {
    public static String [] names = {"Ivan","Georgi","Boyko","Kamen","Yordan","Mihail"};
    public static String [] surNames = {"Ivanov","Georgiev","Boykov","Kamenov","Yordanov","Mihailov"};
    public static void main(String[] args) {
        Court velikoTurnovo = new Court("Veliko Turnovo Court","adress",30);

        Judge j1 = new Judge("Ivan Ivanov",(byte) 7,(byte) 3 );
        Judge j2 = new Judge("Petar Petrov",(byte) 5,(byte) 2 );
        Judge j3 = new Judge("Georgi Georgiev",(byte) 8,(byte) 1 );
        velikoTurnovo.addLegalEntity(j1);
        velikoTurnovo.addLegalEntity(j2);
        velikoTurnovo.addLegalEntity(j3);

        Prosecutor prosecutor1 = new Prosecutor("Ivan Geshev",(byte) 12,(byte) 1 );
        Prosecutor prosecutor2 = new Prosecutor("Georgi Tsatsarov",(byte) 15,(byte) 1 );
        velikoTurnovo.addLegalEntity(prosecutor1);
        velikoTurnovo.addLegalEntity(prosecutor2);

        for (int index=1; index<=20;index++){
            String name = "Juror " + index;
            velikoTurnovo.addLegalEntity(new Juror((name), (byte)(10) , (byte)(5)));
        }

        for (int index=1; index<=5;index++){
            String name = "Lawyer " + index;
            velikoTurnovo.addLegalEntity(new Lawyer((name), (byte)(1+index) , (byte)(9+index)));
        }

        Citizen [] spisukGrajdani = new Citizen[20];

        for (int index=0; index<spisukGrajdani.length;index++){
            if (index <=4){
                spisukGrajdani[index]=new Defendant(("Defendant " + index), "address" , (byte)(20));
            }
            if (index>4 && index<10){
                spisukGrajdani[index]=new Accuser(("Accuser " + index), "address" , (byte)(20));

            }
            if (index>=10){
                spisukGrajdani[index]=new Witness(("Witness " + index), "address" , (byte)(20));
            }

        }
//        for (int index=1; index<=1000;index++){
//        System.out.println(velikoTurnovo.addJudge().name);
//        System.out.println(velikoTurnovo.addProsecutor().name);
//        velikoTurnovo.addJurors(10);
//        velikoTurnovo.addWitnesses(spisukGrajdani);
//        }

        CivilCase case1 = velikoTurnovo.createCivilCase(spisukGrajdani);
        case1.carryOut();
        CivilCase case2 = velikoTurnovo.createCivilCase(spisukGrajdani);
        case2.carryOut();
        CivilCase case3 = velikoTurnovo.createCivilCase(spisukGrajdani);
        case3.carryOut();

        CriminalCase case4 = velikoTurnovo.createCriminalCase(spisukGrajdani);
        case4.carryOut();
        CriminalCase case5 = velikoTurnovo.createCriminalCase(spisukGrajdani);
        case5.carryOut();
        CriminalCase case6 = velikoTurnovo.createCriminalCase(spisukGrajdani);
        case6.carryOut();





    }



}
