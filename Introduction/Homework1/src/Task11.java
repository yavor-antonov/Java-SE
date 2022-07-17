import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number between 100 and 999 , without zero in it");
        int number,num;
        boolean flag = true;
        do {
            number = sc.nextInt();
            if (number >=100 && number <=999){
                num = number;
                while(num != 0) {
                    num %= 10;
                    flag = false;
                    if (num == 0) {
                        flag = true;
                    }
                    num/=10;
                }
            }
        }while(flag);

        num = number;
        while(num != 0){
            flag = true;
            if (number%(num%=10) != 0){
                flag = false;
                break;
            }
            num /= 10;

        }
        System.out.println(flag);



    }
}
