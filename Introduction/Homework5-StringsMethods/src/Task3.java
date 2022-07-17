public class Task3 {
    public static void main(String[] args) {
        //Да се състави програма, чрез която се въвеждат последователно две
        //редици от символи без интервали.
        //Програмата да извежда съобщение за резултата от сравнението им по
        //позиции.
        //Пример: хипопотам, хипопотук
        //Изход:
        //Двата низа са с равна дължина.
        //Разлика по позиции:
        //8 а-у
        //9 м-к

        String first = "хипопотам";
        String second = "хипопотук";

        if (first.length() > second.length()){
            System.out.println(first + " longer than " + second);
            for (int index =0; index<second.length();index++){
                if (first.charAt(index)!=second.charAt(index)){
                    System.out.println((index+1) +" " + first.charAt(index) + "-" + second.charAt(index));
                }
            }

        }else{
            if (first.length() == second.length()){
                System.out.println("Same length");
            }else{
                System.out.println(second + " longer than " + first);
            }

            for (int index =0; index<first.length();index++){
                if (first.charAt(index)!=second.charAt(index)){
                    System.out.println((index+1) +" " + first.charAt(index) + "-" + second.charAt(index));
                }
            }
        }
    }
}
