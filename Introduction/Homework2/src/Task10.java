import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Input a");
        a = sc.nextInt();
        boolean prime = true;
        for (int i=2;i < a; i++){
            if (a%i == 0){
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
}
