import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,sum=0;
        System.out.println("Input a");
        a = sc.nextInt();
        System.out.println("Input b");
        b = sc.nextInt();

        for (int i=a;i < b+1; i++){
            int number = (int)Math.pow(i,2);
            if (number % 3 == 0){
                System.out.format("%s,","skip3");
            }else{
                sum+=number;
                System.out.format("%d,",number);
            }
            if (sum>200){
                break;
            }

        }

    }
}
