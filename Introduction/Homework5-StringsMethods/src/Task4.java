import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Да се състави програма, чрез която по въведени трите имена на двама
        //човека разделени със запетая, се извежда чие име има по-голям сбор
        //от ASCII кодовете на съставящите името букви.
        //Пример: Anna Dosewa Asenowa,Iwo Peew Peew
        //Изход: Anna Dosewa Asenowa

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String [] names = input.split(",") ;
        int total1 =0;
        int total2 = 0;

        for (int index=0; index<names[0].length();index++){
            total1+=names[0].charAt(index);
        }
        for (int index=0; index<names[1].length();index++){
            total2+=names[0].charAt(index);
        }

        if (total1>=total2){
            System.out.println(names[0]);
        }else{
            System.out.println(names[1]);
        }
    }
}
