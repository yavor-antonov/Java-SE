import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char [] array = {'d','s','e','o'};

        boolean flag = false;

        for (int index = 0; index<array.length; index++){
            if (array[index] == ch){
                System.out.println("Index na ch - " + index);
                flag = true;
            }
        }

        if (!flag){
            System.out.println(-1);
        }

    }
}
