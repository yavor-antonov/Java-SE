import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Да се състави програма, която чете набор от думи разделени с
        //интервал.
        //Като резултат да се извеждат броя на въведените думи, както и броя
        //знаци в най-дългата дума.
        //Пример: asd fg hjkl
        //Изход: 3 думи, най-дългата е с 4 символа.

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String [] words = input.split(" ") ;
        int maxLetters = Integer.MIN_VALUE;
        for (int index=0; index<words.length; index++){
            if (words[index].length()>maxLetters){
                maxLetters=words[index].length();
            }
        }

        System.out.println(words.length + "  думи, най-дългата е с " + maxLetters + " символа.");
    }
}
