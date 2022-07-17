public class Task8 {
    //8. Да се състави програма, която проверява дали въведено естествено число е
    //просто. Просто е число, което се дели без остатък единствено на 1 и на себе си.
    //Използвайте рекурсия

    static boolean isPrime (int number, int numberTwo){
        if (number == numberTwo){
            return true;
        }

        if (number%numberTwo==0){
            return false;
        }else{
            return isPrime(number, numberTwo+1);
        }


    }

    public static void main(String[] args) {
        int number = 88;
        System.out.println(isPrime(number,2));

    }
}
