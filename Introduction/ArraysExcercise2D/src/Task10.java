public class Task10 {
    public static void main(String[] args) {
        int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};

        int element = 0;
        int maxElement = 0;

        int count = 0;
        int maxCount = 0;

        for (int index = 0; index< array.length; index++){
            element = array[index];
            for (int i = 0; i<array.length; i++){
                if (element == array[i]){
                    count++;
                }
                if (count > maxCount){
                    maxCount = count;
                    maxElement=element;
                }
            }
            count = 0;
        }

        System.out.println("element - " + maxElement + " Number ot times - " + maxCount);
    }
}
