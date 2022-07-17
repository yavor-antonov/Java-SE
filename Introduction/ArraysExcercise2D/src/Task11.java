import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 5;
        int [][] array = new int[n][m];

        int number = 1;

        for (int rows = 0; rows< array.length; rows++){
            for (int cols = 0; cols<array[rows].length;cols++){
                array[rows][cols] = number;
                number++;
            }
        }
        System.out.println(Arrays.deepToString(array));
        number = 1;
        for (int cols = 0; cols< m; cols++){
            for (int rows = 0; rows<n; rows++){
                array[rows][cols] = number;
                number++;
            }
        }
        System.out.println(Arrays.deepToString(array));
        number=1;
        for (int total = 0;total<n;total++){
            for (int count = 0;count<=total;count++){
                array[total-count][count] = number;
                number++;
            }
        }
        for (int total = n; total<=n+m-2; total++){
            for (int count = total-(n-1); count<=n;count++){
                array[total-count][count] = number;
                number++;
            }
        }

        for (int i = 0; i< array.length;i++){
            for (int j = 0; j< array[i].length; j++){
                System.out.print(array[i][j] + ",");
            }
            System.out.println();
        }

        number =1;
        for (int cols = 0; cols<m; cols++){
            if (cols%2 == 0) {
                for (int rows = 0; rows < n; rows++) {
                    array[rows][cols] = number;
                    number++;
                }
            }else {
                for (int rows = n-1;rows>=0; rows--){
                    array[rows][cols] = number;
                    number++;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
