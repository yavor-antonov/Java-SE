import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int index=0; index< array.length; index++){
            array[index] = index*3;
        }

        System.out.println(Arrays.toString(array));
    }
}
