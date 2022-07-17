import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int x = 0;
        while(Math.pow(2, x)<=number){
            x++;
        }
        int[] binaryArray = new int[x];
        for (int index = 0; index< binaryArray.length; index++){
            if (number%2 != 0){
                binaryArray[index]=1;
            }else {
                binaryArray[index]= 0;
            }
            number= (number-(number%2))/2;
        }

        for (int index=binaryArray.length-1; index>= 0; index--){
            System.out.print(binaryArray[index]);
        }

    }
}
