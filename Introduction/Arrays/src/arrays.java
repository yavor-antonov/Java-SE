import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int [] array = {1,2,3};
        int [] array2 = array;
        array2[1] = 5;
        System.out.println(Arrays.toString(array));
    }
}
