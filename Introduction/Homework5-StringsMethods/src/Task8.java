public class Task8 {
    public static void main(String[] args) {
        //Да се състави програма, чрез която се въвежда ред от символи
        //(стринг, низ).
        //Програмата да изведе на екрана дали въведения стринг е палиндром,
        //т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
        //Вход: капак
        //Изход: да.
        //Вход: тенджера
        //Изход: не.

        String text = "тенджера";
        boolean flag = true;
        for (int index=0;index<text.length();index++){
            if (text.charAt(index) != text.charAt(text.length()-1-index)){
                flag = false;
            }
        }

        System.out.println(flag);
    }
}
