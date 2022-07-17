public class Task6 {
    public static void main(String[] args) {
        String [] stringArray = {"abc" , "bgj" , "hgks"};
        StringBuilder text = new StringBuilder();

        for (int index=0; index<stringArray.length; index++){
            text.append(stringArray[index]);
        }

        System.out.println(text);



    }
}
