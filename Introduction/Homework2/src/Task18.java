import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        boolean flag;
        do {
            flag = false;
            System.out.println("Input number between 1 and 9");
            a = sc.nextInt();
            if (a>= 1 && a <=9){
                flag = true;
            }
        }while(!flag);

        do {
            flag = false;
            System.out.println("Input number between 1 and 9");
            b = sc.nextInt();
            if (b>= 1 && b <=9){
                flag = true;
            }
        }while(!flag);

        for (int i= 1; i<=a;i++){
            for (int j= 1; j<=b;j++){
            System.out.print(i + " * ");
            System.out.print(j+ " = ");
                System.out.println(i*j);
            }
        }
    }
}
