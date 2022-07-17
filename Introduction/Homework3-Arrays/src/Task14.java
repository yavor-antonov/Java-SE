import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        double [] array1 = {7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2};
        int size=0;
        for (int i =0; i<array1.length;i++){
            if (array1[i]>-2.99 && array1[i]<2.99){
                size++;
            }
        }
        double [] array2 = new double [size];
        size=0;
        for (int i =0; i<array1.length;i++){
            if (array1[i]>-2.99 && array1[i]<2.99){
                array2[size] = array1[i];
                size++;
            }
        }
        System.out.println(Arrays.toString(array2));

    }
}
