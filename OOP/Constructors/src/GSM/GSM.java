package GSM;

public class GSM {
    String model; //модел на телефона
    boolean hasSimCard; //дали в телефона е заредена SIM карта
    String simMobileNumber;  //номер на SIM картата(телефонен номер), ако е заредена такава.
    float outgoingCallsDuration; //общото време (в минути) на изходящите повиквания
    Call lastIncomingCall; //последното входящо повикване
    Call lastOutgoingCall;  //последното изходящо повикване

    GSM(String model){
        this.model = model;
    }


    void insertSimCard(String simMobileNumber) { // метода задава номер(сим карта) на телефона.
        // Да се провери дали подаденият номер евалиден (започва с 08 и се състои от 10 цифри).
        // Ако номеръте валиден, го задава на телефона и задава стойност true на полето hasSimCard

        if ((simMobileNumber.charAt(0) == '0' && simMobileNumber.charAt(1) == '8') && simMobileNumber.length() == 10) {
            this.hasSimCard = true;
            this.simMobileNumber = simMobileNumber;
        } else {
            System.out.println("Wrong input");
        }
    }

    void removeSimCard() { // премахва сим картата от телефона (задава false на полето hasSimCard)

        this.hasSimCard = false;
        this.simMobileNumber = "";
    }

    void call(GSM receiver, float duration) { // В тялото му да се направят проверки за:
        // дали въведената дължина на разговора е валидна
        // дали двата телефона (този за който се извиква метода и този
        // към който се прави обаждането) не са един и същ телефон
        // дали и двата телефона имат сим карта
        if (duration <= 0) {
            System.out.println("Invalid duration of call");
            return;
        }
        if (this.simMobileNumber.equals(receiver.simMobileNumber)) {
            System.out.println("Same number of receiver and caller");
            return;
        }
        if (!this.hasSimCard || !receiver.hasSimCard) {
            System.out.println("One of the phones is without a SimCard");
            return;
        }
        //Ако всички проверки преминат успешно, метода прави обаждане с продължителност duration
        // към телефона подаден като параметър.Задава това обаждане като последно изходящо повикване на
        //телефона от който се прави повикването (телефона за който се извиква метода) и задава същото
        // обаждане като последно входящо за телефона към който се прави обаждането.
        //Осен това увеличава стойността на outgoingCallsDuration със дължината на разговора за телефона
        // от който се прави обаждането.
        Call newCall = new Call(duration, this, receiver);
        this.lastOutgoingCall = newCall;
        receiver.lastIncomingCall = newCall;

        this.outgoingCallsDuration += duration;
        }

       // Да се направи и метод getSumForCall() който връща сумата която е начислена за изходящите повиквания
       // на телефона (общото време на изходящите повиквания по цената за минута - priceForAMinute).

    float getSumForCall(){
        return this.outgoingCallsDuration*Call.priceForAMinute;
    }

    //Да се направят два метода printInfoForTheLastOutgoingCall() и printInfoForTheLastIncomingCall()
    // които извеждат информация за последното изходящо/входящо повиквана на телефона (ако има такова)

    void printInfoForTheLastOutgoingCall(){
        if (this.lastOutgoingCall==null){
            System.out.println("No outgoing calls");
            return;
        }
        System.out.println("Outgoing call to : " + this.lastOutgoingCall.receiver.simMobileNumber
                +" Duration: " + this.lastOutgoingCall.duration);
    }

    void printInfoForTheLastIncomingCall(){
        if (this.lastIncomingCall==null){
            System.out.println("No incoming calls");
            return;
        }
        System.out.println("Incoming call from : " + this.lastIncomingCall.receiver
                +" Duration: " + this.lastIncomingCall.duration);
    }
}
