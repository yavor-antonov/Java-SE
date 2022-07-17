public class Task7 {
    public static void main(String[] args) {
//Напишете програма, която за дадена матрица намира
//произведението на елементите под главния диагонал.

        int [][] array ={
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, -36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66} };

        for (int rows = 1; rows< array.length; rows++){
            for (int cols = 0; cols<rows;cols++){
                System.out.print(array[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
