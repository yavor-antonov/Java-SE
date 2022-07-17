import javax.swing.*;

public class TaskDemo {
    public static void main(String[] args) {
        String text = "What is are these shit how many is is in here";
        String is ="is";
        int count = 0;
        for (int index =0; index<text.length()-2; index++){
            if (is.equalsIgnoreCase((text.substring(index,index+2)))){
                count++;
            }
        }

        System.out.println(text);

        System.out.println(count);
        String[] words = text.split(" ");
        String longestWord = "";
        for (int index=0;index<words.length;index++){
            if (words[index].length()>longestWord.length()){
                longestWord=words[index];
            }
        }
        System.out.println(longestWord + " - " + longestWord.length());
    }
}
