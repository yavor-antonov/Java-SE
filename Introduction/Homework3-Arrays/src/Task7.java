import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9, 11};
        int[] array2 = new int[array1.length];

        for (int index = 0; index< array1.length; index++){
            if (index == 0 || index == array1.length-1){
                array2[index] = array1[index];
            }else{
                array2[index] = array1[index-1] + array1[index+1];
            }
        }

        System.out.println(Arrays.toString(array2));
    }
}
