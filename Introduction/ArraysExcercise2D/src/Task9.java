import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        //Дадена е правоъ­гълна матрица с числа. Да се намери в нея
        //максималната подмат­рица с размер 2 х 2 и да се отпечата на
        //конзолата. Под максимална подматрица се разбира
        //подматрица, която има максимална сума на елементите, които я
        //съставят.

      int[][] array = { {11, 12, 13, 14, 15, 16},
                        {21, 22, 23, 24, 25, 26},
                        {31, 99, 70, 34, 35, 36},
                        {41, 50, 43, 44, 45, 46},
                        {51, 52, 53, 54, 55, 56},
                        {61, 62, 63, 64, 65, 66} };

      int[][] array2x2 = new int[2][2];


      int sum=0;
      int maxSum=0;

      for (int row = 0;row<array.length-1;row++){
          for (int col = 0;col<array[row].length-1;col++){
              sum=array[row][col] + array[row+1][col] + array[row][col+1] + array[row+1][col+1];
              if (sum>maxSum){
                  maxSum=sum;
                  array2x2[0][0] = array[row][col];
                  array2x2[1][0] = array[row+1][col];
                  array2x2[0][1] = array[row][col+1];
                  array2x2[1][1] = array[row+1][col+1];
              }
          }
      }

        System.out.println(Arrays.deepToString(array2x2));
    }
}
