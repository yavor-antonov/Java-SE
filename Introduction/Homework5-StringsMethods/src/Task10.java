public class Task10 {
    public static void main(String[] args) {
        //Да се състави програма, която по даден низ връща друг,
        //символите, на който са получени като към всеки код на символ
        //от ASCII таблицата е добавеното числото 5 и е записан
        //новополучения символ.
        //Пример :
        //Вход: Hello
        //Изход: Mjqqt

        String text = "Hello";
        String text2="";

        for (int index=0;index<text.length();index++){
            text2+=(char)((int)text.charAt(index)+5);
        }
        System.out.println(text2);
    }
}
