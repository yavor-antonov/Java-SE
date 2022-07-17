public class Task3 {
    public static void main(String[] args) {
        int [][] array = {  {1,4,6,3},
                {5,9,7,2},
                {4,8,1,9},
                {2,3,4,5}};
        double sum = 0;
        int arrayLength=0;

        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array[i].length; j++){
                sum+=array[i][j];
                arrayLength+=1;
            }
        }
        double average = sum/arrayLength;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
