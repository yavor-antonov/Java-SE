import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        while(count<=10){
            n++;
            if (n%2 == 0 || n%3 == 0 || n%5 == 0){
                System.out.format("d%:d%",count,n);
                count++;
            }
        }
    }
}
