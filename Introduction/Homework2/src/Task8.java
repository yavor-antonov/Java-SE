import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input n");

        int n = sc.nextInt();

        System.out.println(n);
        int k = n-1;

        for (int i = 0; i <n; i++){
            for (int j = 0; j <n; j++){
                System.out.print(k);
            }
            System.out.println();
            k+=2;
        }
    }
}
