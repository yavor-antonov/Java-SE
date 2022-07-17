import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number between 1000 and 9999");
        int num = sc.nextInt();
        if ((num >= 1000) && (num <= 9999)){
            int num1,num2,num3,num4;
            num1 =num / 1000;
            num %= 1000;
            num2 = num / 100;
            num %=100;
            num3 = num / 10;
            num4 = num % 10;

            num1 = num1*10 + num4;
            num2 = num2*10 + num3;

            System.out.println(num1);
            System.out.println(num2);

        }else{
            System.out.println("Wrong input");
        }
    }
}
