import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int [][] array = {  {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};
        int[][] secondArray = new int[4][4];

        for (int i = 0; i<array.length;i++){
            for (int j=0; j<array[i].length;j++ ){
                secondArray[j][array[i].length-i-1] = array[i][j];
            }
        }

        System.out.println(Arrays.deepToString(secondArray));
    }
}
