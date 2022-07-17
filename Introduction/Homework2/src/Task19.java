import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        boolean flag = true;
        while(flag) {
            System.out.println("Input number between 10 and 99");
            a = sc.nextInt();
            if (a >= 10 && a <= 99) {
                flag = false;
            }
        }

        while (a>1){
            if (a%2 == 0){
                a/=2;
            }else{
                a=a*3+1;
            }
            System.out.println(a);
        }

    }
}
