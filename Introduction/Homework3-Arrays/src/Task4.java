import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        boolean flag =true;
        for (int index = 0; index<arraySize; index++){
            array[index]=sc.nextInt();
        }

        for (int index = 0; index< arraySize/2; index++){
            if (array[index] != array[arraySize-index-1]){
                flag = false;
            }
        }
        if (flag){
            System.out.println("Mirror");
        }else{
            System.out.println("Not mirror");
        }
    }
}
