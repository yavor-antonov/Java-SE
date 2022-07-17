import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] workersNames= new String[10];

        for (int index = 0 ; index< workersNames.length; index++){
            workersNames[index] = sc.next();
        }

        for (int index = 0; index<workersNames.length; index++){
            System.out.println(index + ". " + workersNames[index]);
        }
        for (int index = workersNames.length-1; index>=0;index--){
            System.out.println(index + ". " + workersNames[index]);
        }
    }
}
