import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        boolean flag =true;
        for (int index = 0; index<arraySize; index++){
            array[index]=sc.nextInt();
        }

        for (int index = 0; index< arraySize/2; index++){
            int var1;
            int var2;
            var1 = array[index];
            var2 = array[arraySize-1-index];
            array[index] = var2;
            array[arraySize-1-index] = var1;
        }
        System.out.println(Arrays.toString(array));
    }
}
