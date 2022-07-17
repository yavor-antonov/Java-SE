import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Да се състави програма, чрез която се въвежда изречение с отделни
        //думи.
        //Като резултат на екрана да се извежда същия текст, но всяка отделна
        //дума да започва с главна буква, а следващите я букви да са малки.
        //Пример: супер яката задача
        //Изход: Супер Яката Задача

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String [] words = input.split(" ") ;

        for (int index=0; index<words.length;index++){
            String firsLetter = String.valueOf(words[index].charAt(0)).toUpperCase();
            String otherLetters = words[index].substring(1,words[index].length()).toLowerCase();
            System.out.print(firsLetter+otherLetters + " ");
        }
    }
}
