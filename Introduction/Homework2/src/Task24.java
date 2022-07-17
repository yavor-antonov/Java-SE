import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int num=a,b=0,digit;
        do {
            digit = num %10;
            num/=10;
            b += digit;
            if (num>0) {
                b *= 10;
            }

        }while (num!=0);

        if (a==b){
            System.out.println("Polindrom");
        }else{
            System.out.println("Not a Polindrom");
        }
    }
}
