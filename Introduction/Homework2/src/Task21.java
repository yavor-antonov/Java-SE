import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i =a-1; i<52; i++){
            int type = i/4;
            int color = i%4;            switch (type){
                case 12:
                    System.out.print("Aso ");
                    break;
                case 11:
                    System.out.print("Pop ");
                    break;
                case 10:
                    System.out.print("Dama ");
                    break;
                case 9:
                    System.out.print("Vale ");
                    break;
                default:
                    System.out.print((type+2) + " ");
                    break;

         }
            switch (color){
                case 3:
                    System.out.print("Pika, ");
                    break;
                case 0:
                    System.out.print("Spatiq, ");
                    break;
                case 1:
                    System.out.print("Karo, ");
                    break;
                case 2:
                    System.out.print("Kupa, ");
                    break;

            }
        }
    }
}
