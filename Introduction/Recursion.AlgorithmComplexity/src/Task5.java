public class Task5 {
    // Да се провери дали въведено число е палидром.
   static int sum = 0;
    static int isPalidrome(int number){;
        if (number != 0){
                int remaining = number %10;
                sum = sum*10 + remaining;
                return isPalidrome(number/10);
        }
            return sum;
    }
    public static void main(String[] args) {
        int number = 12381;
      int result =   isPalidrome(number);
        System.out.println(result + " " + (result==number));
    }
}
