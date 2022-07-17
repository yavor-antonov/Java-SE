public class Task5 {
    public static void main(String[] args) {
        //Да се състави програма, чрез която се въвеждат 2 редици от знаци
        //(думи).
        //Ако в двете редици участва един и същи знак, да се изведе на екрана
        //първата редица хоризонтално, а втората вертикално, така че да се
        //пресичат в общия си знак.
        //Ако редиците нямат общ знак да се изведе само уведомително
        //съобщение.
        //Пример :

        //м
        //а
        //шапка
        //и
        //н
        //а

        String first = "шапка";
        String second = "машина";

        int indexFirst =-1, indexSecond=-1;
        boolean flagBrake = false;
        for (int row=0;row<first.length();row++){
            for (int col =0;col<second.length();col++){
                if(second.charAt(col) == first.charAt(row)){
                    indexFirst = row; // 3
                    indexSecond = col; // 0
                    flagBrake = true;
                    break;
                }
            }
            if (flagBrake){
                break;
            }
        }

        for (int row=0;row<second.length();row++){

            for (int col =0;col<first.length();col++){
                if (row == indexSecond){
                    System.out.print(first.charAt(col));
                }else if (col == indexFirst){
                    System.out.print(second.charAt(row));
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
}
