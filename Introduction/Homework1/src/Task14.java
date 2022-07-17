import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,x2,y1,y2;
        boolean position1,position2; // true = white, false = black

        System.out.println("Input first position");
        System.out.println("Input X");
        x1 = sc.nextInt();
        System.out.println("Input Y");
        y1 = sc.nextInt();

        System.out.println("Input second position");
        System.out.println("Input X");
        x2 = sc.nextInt();
        System.out.println("Input Y");
        y2 = sc.nextInt();

        if (x1%2 == 1){
            if (y1%2 ==1){
                position1 = true;
            }else{
                position1 = false;
            }
        }else{
            if (y1%2 == 1){
                position1 = false;
            }else{
                position1 = true;
            }
        }

        if (x2%2 == 1){
            if (y2%2 ==1){
                position2 = true;
            }else{
                position2 = false;
            }
        }else{
            if (y1%2 == 1){
                position2 = false;
            }else{
                position2 = true;
            }
        }

        if (position1 == position2){
            System.out.println("Same color");
        }else{
            System.out.println("Not same color");
        }
    }
}
