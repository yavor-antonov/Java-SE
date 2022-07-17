import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder text = new StringBuilder();
        for (int index=0; index<=n; index++){
            text.append(index);
        }

        System.out.println(text);
    }
}
