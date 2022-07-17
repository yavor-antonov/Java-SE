import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int [] array = new int [arraySize];
        int min = Integer.MAX_VALUE;

        for (int index=0; index<arraySize; index++){
            array[index] = sc.nextInt();
            if (array[index]<min && array[index] % 3 == 0){
                min = array[index];
            }
        }

        System.out.println(min);
    }
}
