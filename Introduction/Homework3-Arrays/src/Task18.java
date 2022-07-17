import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        int[] array1 = {18,19,32,1,3, 4, 5, 6, 7, 8};
        int[] array2 = {1, 2, 3,4,5,16,17,18,27,11};
        int[] arrayMix = new int[array1.length];

        for (int index = 0; index< array1.length; index++){
            if (array1[index]>array2[index]){
                arrayMix[index] = array1[index];
            }else{
                arrayMix[index] = array2[index];
            }
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(arrayMix));
    }
}
