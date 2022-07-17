package GSM;

public class GSMDemo {
    public static void main(String[] args) {
        GSM myPhone = new GSM("Samsung");
        GSM motherPhone = new GSM("Huawei");
        GSM fatherPhone = new GSM("Xiaomi");
        GSM brotherPhone = new GSM("Iphone");

        myPhone.insertSimCard("0855555555");
        motherPhone.insertSimCard("0899999999");
        fatherPhone.insertSimCard("0811111111");
        brotherPhone.insertSimCard("0877755777");

        myPhone.call(motherPhone,5);
        myPhone.call(brotherPhone,9);

        myPhone.printInfoForTheLastIncomingCall();
        myPhone.printInfoForTheLastOutgoingCall();
    }
}
