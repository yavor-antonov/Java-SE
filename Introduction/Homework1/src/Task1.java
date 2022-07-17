import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number A");
        double A = sc.nextDouble();
        System.out.println("Input number B");
        double B = sc.nextDouble();
        System.out.println("Input number C");
        double C = sc.nextDouble();

        if (A>B){
            if (C<A && C>B){
                System.out.println("mejdu");
            }else{
                System.out.println("ne e");
            }

        }

        if (B>A){
            if (C>A && C<B){
                System.out.println("mejdu");
            }else{
                System.out.println("ne e");
            }

        }



    }
}
