public class Task2 {
    public static void main(String[] args) {
        //Да се състави програма, чрез която от клавиатурата се въвеждат
        //последователно две думи с дължина 10-20 знака.
        //Програмата да размени първите им 5 знака и да изведе дължината на
        //по-дългата, както и новото им съдържание.
        //Пример: uchilishe uchenik
        //Изход: 9 uchenishe

        String first = "uchilishe";
        String second = "uchenik";


        if (first.length()>second.length()){
            System.out.print(first.length());
        }else{
            System.out.print(second.length());
        }
        String replace = first.substring(0,5);
        System.out.println(replace);

        first = first.replace(replace,second.substring(0,5));
        second = second.replace(second.substring(0,5), replace);
        System.out.print(first +" " + second);



    }
}
