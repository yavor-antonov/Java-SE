package GSM;

public class Call {
    static float priceForAMinute = 1.5f;
    GSM caller;
    GSM receiver;
    float duration;

    Call(float duration, GSM caller, GSM receiver){
        this.duration = duration;
        this.caller = caller;
        this.receiver = receiver;

    }
}
