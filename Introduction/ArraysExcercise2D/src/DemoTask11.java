import java.util.Arrays;

public class DemoTask11 {
    public static void main(String[] args) {
        int [][] array = {{1, 3, 6, 10, 14},
                {2, 5, 9, 13, 17},
                {4, 8, 12, 16, 19},
                {7, 11, 15, 18, 20}};

        System.out.println(Arrays.deepToString(array));
        System.out.println(array[1][0]);
    }
}
