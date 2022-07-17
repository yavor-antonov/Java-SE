import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array ={0,1,1,0,1,0,1,0,1,1,0,1,0,1,0,1,1,1,0,0,0};
        //int[] array ={1,0};
        boolean shuffle = true;

        while(shuffle) {
            shuffle =false;
            for (int index = 1; index < array.length; index++) {
                int temp = -1;
                if (array[index] < array[index - 1]) {
                    temp = array[index];
                    array[index] = array[index - 1];
                    array[index-1] = temp;
                    shuffle = true;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
