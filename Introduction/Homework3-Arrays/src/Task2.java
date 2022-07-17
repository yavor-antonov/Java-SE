import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int []array1 = {7, 4, 5, 1, 3, 9};
        int []array2 = new int [array1.length];
        int k = array1.length-1;
        for (int index=0; index<array1.length/2; index++){
            array2[index] = array1[index];
        }
        for (int index = array1.length/2; index<array1.length; index++,k--){
            array2[k]= array1[index];
        }
        System.out.println(Arrays.toString(array2));
    }
}
