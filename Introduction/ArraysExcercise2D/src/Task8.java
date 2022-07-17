public class Task8 {
    public static void main(String[] args) {
        //Напишете програма, която за матрица от булеви стойности,
        //проверява дали се съдържа елемент със стойност true над
        //втория диагонал

        boolean [][] array = {  {false, false, false},
                                {true, false, false},
                                {false, false, false} };
        boolean flag = false;

        for (int rows = 0; rows< array.length-1; rows++){
            for (int cols = 0; cols<array.length-1-rows;cols++){
                if (array[rows][cols]){
                    flag = true;
                }

            }

        }

        if (flag){
            System.out.println("ima true");
        }else{
            System.out.println("nqma true");
        }
    }
}
