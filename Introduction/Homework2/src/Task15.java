import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,number=1,sum=0;
        System.out.println("Input n");
        n = sc.nextInt();
        do {
            sum+=number;
            number++;
        }while (number<=n);
        System.out.println(sum);
    }
}
