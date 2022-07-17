import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Напишете програма, която отпечатва на екрана инициалите на
        //името ви. Въведете името си от клавиатурата.

        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String secondName = sc.next();
        String lastName = sc.next();
        System.out.println(firstName.charAt(0) +" " + secondName.charAt(0) + " " + lastName.charAt(0));
    }
}
