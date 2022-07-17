public class Task2 {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,4,9,7,11};

        boolean isNazuben = true;

        for (int index=1; index< array.length-1;index++){
            if (index%2 !=0) {
                if (!(array[index] > array[index - 1] && array[index] > array[index + 1])) {
                    isNazuben = false;
                }
            }else{
                if (!(array[index] < array[index - 1] && array[index] < array[index + 1])) {
                    isNazuben = false;
                }
            }
        }

        System.out.println("nazuben li e? - " + isNazuben);
    }
}
