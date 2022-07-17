import java.util.Arrays;

public class Task2_SelectionSort {
    public static void main(String[] args) {
        int[] array = { 1,6,8,1,4,5};

        for (int end =array.length-1,begin=0; end>begin;end--,begin++) {
            int maxValue =  Integer.MIN_VALUE;
            int maxIndex=0;

            int minValue =  Integer.MAX_VALUE;
            int minIndex=0;

            for (int index = begin; index <= end; index++) {
                if (array[index] > maxValue){
                    maxValue = array[index];
                    maxIndex = index;
                }

                if (array[index] < minValue){
                    minValue = array[index];
                    minIndex = index;
                }
            }

            if (minIndex == end){
                minIndex = maxIndex;
            }

            int temp = array[end];
            array[end] = array[maxIndex];
            array[maxIndex] = temp;

            temp = array[begin];
            array[begin] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.println(Arrays.toString(array));
    }



}
