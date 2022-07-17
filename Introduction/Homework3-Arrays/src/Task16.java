import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        double [] array = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i<array.length; i++){
            if (array[i]< -0.231){
                array[i] = Math.pow(i+1, 2) + 41.25;
            }else{
                array[i] *= (i+1);
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
