public class Task5 {
    public static void main(String[] args) {
        int [][] array = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int sumCols = 0;
        int maxSumCols = Integer.MIN_VALUE;
        int sumRows = 0;
        int maxSumRows = Integer.MIN_VALUE;

        for (int cols = 0; cols< array.length; cols++){
            for (int rows = 0; rows< array[cols].length; rows++){
                sumRows+=array[cols][rows];
            }
            if (sumRows>maxSumRows){
                maxSumRows=sumRows;
            }
            sumRows = 0;
        }

        for (int rows = 0; rows< array.length;rows++){
            for (int cols = 0; cols< array.length; cols++){
                sumCols+=array[cols][rows];
            }
            if (sumCols>maxSumCols){
                maxSumCols=sumCols;
            }
            sumCols=0;
        }

        System.out.println("Columns " + maxSumCols + " Rows " + maxSumRows);
    }
}
