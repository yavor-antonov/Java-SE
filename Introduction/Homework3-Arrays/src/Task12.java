import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));

        // 0 1
            int cpy = array[0];
            array[0] = array[1];
            array[1] = cpy;
            //2 3
            array[2]+=array[3];
            array[3]=array[2]- array[3];
            array[2]= array[2]- array[3];
            //4 5
            array[4]*=array[5];
            array[5]=array[4]/array[5];
            array[4]= array[4]/array[5];

        System.out.println(Arrays.toString(array));



    }
}
