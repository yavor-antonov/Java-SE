import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secretWord ="tron";
        StringBuilder foundLetters = new StringBuilder();
        System.out.println();
        for (int index = 0; index<secretWord.length(); index++){
            if (index ==0 || index == secretWord.length()-1){
                foundLetters.append(secretWord.charAt(index));
            }else{
                foundLetters.append("_");
            }
        }
        System.out.println(foundLetters);
        boolean flag = true;
        int count = 3;
        do {
            String letter = sc.nextLine();
            int index = secretWord.indexOf(letter);

            if (index==-1){
                count--;
            }else{
                foundLetters.replace(index,index+1,letter);
                System.out.println(foundLetters);
            }
            if (foundLetters.equals(secretWord)){
                System.out.println("Congratulations");
                flag =false;
            }


        }while(flag && count>0);

    }
}
