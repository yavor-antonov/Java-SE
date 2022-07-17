public class Task1 {
    public static void main(String[] args) {
        int[][] array = {   {48,72,13,14,15},
                            {21,22,53,24,75},
                            {31,57,33,34,35},
                            {41,95,43,44,45},
                            {59,52,53,54,55},
                            {61,69,63,64,65} };

        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for (int index = 0; index<array.length; index++){
            for (int i = 0; i<array[index].length; i++){
                if (array[index][i]<smallest){
                    smallest = array[index][i];
                }
                if (array[index][i]>biggest){
                    biggest=array[index][i];
                }
            }
        }

        System.out.println(smallest + " " + biggest);

    }
}
