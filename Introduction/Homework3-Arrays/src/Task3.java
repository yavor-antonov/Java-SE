import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[10];

        for (int index=0; index< array.length; index++){
            if (index<= 1){
                array[index] = num;
            }else{
                array[index] = array[index-1] + array[index-2];
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
