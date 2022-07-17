public class Task6 {
    public static void main(String[] args) {
        int [][] array = {{11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}};

        int sum=0;
        int totalSum=0;

        for (int cols = 0; cols<array.length; cols++){
            for (int rows = 0; rows<array.length;rows++){
                if (cols%2 != 0){
                    System.out.print(array[cols][rows] + ",");
                    sum+=array[cols][rows];
                }

            }
            if (cols%2 != 0) {
                System.out.println("Sum = " + sum);
            }
            totalSum+=sum;
            sum=0;
        }
        System.out.println("Total Sum - " + totalSum);


    }
}
