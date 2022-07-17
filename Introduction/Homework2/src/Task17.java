import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        String a = sc.next();
        char c = a.charAt(0);

        for (int i = 0;i<b;i++){
            if (i == 0 || i == b-1){
                for (int j = 0; j<b;j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for (int j = 0; j<b;j++) {

                    if (j == 0 || j == b - 1) {
                        System.out.print("*");
                    } else {
                            System.out.print(c);
                    }
                }
                System.out.println();
            }
        }

    }
}
