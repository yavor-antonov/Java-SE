public class Task7 {
    public static void main(String[] args) {
        //Напишете програма, която трансформира дадена матрица от
        //реални числа в символен низ, така че при отпечатване на
        //екрана на символния низ числата от матрицата да бъдат в
        //четим табличен вид с точност 2 цифри след десетичната точка.
        double [][] array = {   {11.974, 12.9753, 13.8976, 14.7757, 15, 16},
                                {21, 22, 23, 24, 25, 26},
                                {31, 32, 33, 34, 35, 36},
                                {41, 42, 43, 44, 45, 46},
                                {51, 52, 53, 54, 55, 56},
                                {61, 62, 63, 64, 65, 66.456335} };

        String [] tableString = new String[array.length];
        for (int row=0;row< array.length;row++){
            for (int col=0;col< array[row].length; col++){
                String number = String.format("%.2f",array[row][col]);
                if (col==0){
                    tableString [row] = number + " ";
                }else{
                    tableString [row] = tableString[row] + number + " ";
                }
            }
            System.out.println(tableString[row]);
        }
    }
}
