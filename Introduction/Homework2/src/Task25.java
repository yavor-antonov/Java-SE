import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=1;

        do {
            sum*=n;
            n--;
        }while (n>0);

        System.out.println(sum);
    }
}
