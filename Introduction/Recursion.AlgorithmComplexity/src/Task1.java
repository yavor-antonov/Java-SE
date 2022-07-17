public class Task1 {
    static void number1to10(int number, int n){
        if (number>n){
            return;
        }
        if (number%2==0) {
            System.out.println(number);
        }

        number1to10(number+1,n);

    }
    public static void main(String[] args) {
        int number = 1;
        int n =100;
        number1to10(number,n);
    }
}
