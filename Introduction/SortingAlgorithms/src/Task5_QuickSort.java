import java.util.Arrays;

public class Task5_QuickSort {
    static int partition (int [] array, int left, int right){
        //get random index ot element
        int randomIndex = ((int) (Math.random() * (right-left+1))) + left;

        //swap with the last
        int temp = array[right];
        array[right] = array[randomIndex];
        array[randomIndex] = temp;

        int lastIndexOfSmallestElement = left-1;


        for (int index = left; index <= right; index++){
            if (array[index] <= array[right]){
                lastIndexOfSmallestElement++;

                temp = array[index];
                array[index] = array[lastIndexOfSmallestElement];
                array[lastIndexOfSmallestElement] = temp;

            }
        }

        return lastIndexOfSmallestElement;
    }

    static void quickSort (int [] array, int left, int right){
        if (left>=right){
            return;
        }
        int position = partition(array,left,right);
        quickSort(array,left,position-1);
        quickSort(array,position+1,right);
    }

    public static void main(String[] args) {
        //int [] array = {1,5,2,8,3,6,4,4};
        int [] longArray = new int [5_000_000];
        for (int i = 0; i <longArray.length; i++){
            longArray[i] = (int) (Math.random()*1_000_000);
            //longArray[i] = i+1;
        }
       // quickSort(array,0,array.length-1);
       // System.out.println(Arrays.toString(array));
        quickSort(longArray,0,longArray.length-1);
        System.out.println(Arrays.toString(longArray));
    }
}
