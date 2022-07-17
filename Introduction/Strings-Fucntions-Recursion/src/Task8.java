import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //На някои мобилни телефони английската азбука се получава от
        //натискане на клавишите по следния начин: ABC(2), DEF(3),
        //GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
        //Напишете програма, която приема последователност от
        //натискания на клавиши (цифри) и конвертира
        //последователността към символен низ от английски букви.

        Scanner sc = new Scanner(System.in);
        String[] dataBase = {"0", " ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int oldInput = 0;
        int count=0;
        String text = "";
        do {
            int input =sc.nextInt();
            if (input == 0){
                break;
            }

            if (oldInput == input){
                if (count == 2 && (input !=7 && input!=9)){
                    break;
                }
                if (count == 3){
                    break;
                }

                count++;
                continue;
            }

            text += dataBase[input].charAt(count);


            count =0;
            oldInput = input;

        }while (true);

        System.out.println(text);
    }
}
