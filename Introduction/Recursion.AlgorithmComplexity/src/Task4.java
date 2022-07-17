import java.util.Scanner;

public class Task4 {
    static String print(int start, int finish){
        if (finish<start){
            return "";
        }else{
            String text = print(start, finish-1);
            text = text + " " + finish;
            System.out.println(text);
            return text;
        }

    }
//    Да се състави програма, чрез която по въведени начална и крайна
//    цифра се извеждат на всеки нов ред следната последователност
//    (триъгълник от знаци):
//    Пример: 1, 9
//    Изход:
//            1
//            1 2
//            1 2 3
//            ... до
//            1 2 3 4 5 6 7 8 9
//    Използвайте рекурсия


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int finish = sc.nextInt();
        print(start,finish);

    }
}
