public class Task2 {
    public static void main(String[] args) {
        int [][] array = {  {1,4,6,3},
                            {5,9,7,2},
                            {4,8,1,9},
                            {2,3,4,5}};

        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array[i].length; j++){
                if (i==j){
                    System.out.print(array[i][j]);
                }
            }
        }
        System.out.println();

        int counter = array.length-1;

        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array[i].length; j++){
                if (j==counter){
                    System.out.print(array[i][j]);
                    counter--;
                }
            }

        }
    }


}
