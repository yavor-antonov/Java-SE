public class Task9 {
    public static void main(String[] args) {
        //Да се състави програма, чрез която по въведен низ съдържащ букви,
        //цифри, знак минус '-' се извежда сборът на въведените числа като се
        //отчита знакът '-' пред съответното число.
        //Вход: asd-12sdf45-56asdf100
        //Изход:
        //-12
        //45
        //-56
        //100
        //Сума = 77

        String text = "asd-12sdf45-56asdf100";

        int result =0;


        for (int index=0;index<text.length();index++){
            boolean b = (text.charAt(index) == '-') || (text.charAt(index) >= '0' && text.charAt(index) <= '9');

            if (b){
                int j = index;
                String number = "";
                do{
                    number+=text.charAt(j);
                    j++;
                }while(j<text.length() && (text.charAt(j) >= '0' && text.charAt(j) <= '9'));

                System.out.println(number);
                result+=Integer.parseInt(number);

                if (text.charAt(j) == '-'){
                    index = j-1;
                }else{
                index=j;
                }
            }
        }
        System.out.println(result);
    }
}
