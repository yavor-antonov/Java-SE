public class Task6 {
    //. Да се състави програма, която приема за входни данни естествено число N.
    //Програмата да извежда число, чиито цифри са написани в ред, обратен на въведеното число.
    // Използвайте рекурсия.
    static int sum = 0;
    static void reversePrintNumber (int number){
        if (number <= 0){
            return;
        }
        System.out.print(number%10);
        reversePrintNumber(number/10);
    }
    static int reverseNumber(int number){
        if (number<=0){
            return sum;
        }
        int remaining = number %10;
        sum = sum*10 + remaining;
        return reverseNumber(number/10);

    }
    public static void main(String[] args) {
        int number = 25482;
        reversePrintNumber(number);
        System.out.println();
        number = reverseNumber(number);
        System.out.println(number);
    }
}
