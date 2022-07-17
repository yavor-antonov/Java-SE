import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int abc = sc.nextInt();
        int a,b,c;
        a = abc/100;
        b = (abc - a*100) / 10;
        c = abc - a*100 - b*10;

        if (a == b && b == c){
            System.out.println("Ravni sa");
        }

        if (a> b && b > c){
            System.out.println("Vuzhodqsht red");
        }

        if (a<b && b<c){
            System.out.println("Nizhodqsht red");
        }else{
            System.out.println("Other");
        }

    }
}
