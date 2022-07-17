import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    static void randomArray(int size){
        int[]array = new int[size];
        for (int index = 0; index<size;index++){
            array[index] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        randomArray(n);
    }
}
