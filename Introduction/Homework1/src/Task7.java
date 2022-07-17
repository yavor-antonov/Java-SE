import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);

            double money = sc.nextDouble();
            boolean healthy = sc.nextBoolean();
            if (healthy) {
                if (money > 10) {
                    System.out.print("Kino");
                } else {
                    System.out.println("Kafe");
                }
            } else {
                if (money > 0) {
                    System.out.println("medicine");
                } else {
                    System.out.println("home");
                }
            }
        }
    }
}