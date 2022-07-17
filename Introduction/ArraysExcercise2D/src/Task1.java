public class Task1 {
    public static void main(String[] args) {
        int [][] array ={
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, -36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66} };

        boolean allNumbersArePositive = true;

        for (int cols=0;cols<array.length;cols++){
            for (int rows=0;rows<array[cols].length;rows++){
                if (array[cols][rows]<0){
                    allNumbersArePositive = false;
                }
            }
        }

        if (allNumbersArePositive){
            System.out.println("All numbers are positive");
        }else{
            System.out.println("All numbers are not positive");
        }
    }
}
