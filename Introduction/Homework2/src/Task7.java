import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input n");

        int n = sc.nextInt();
        int number = 1;
        while(n != 0){
            if (number % 3 == 0){
                System.out.print(number +",");
                number++;
                n--;
            }
            number++;
        }
    }
}
