public class Task4_CountingSortNegativeNumbers {
    static void countingSort (int [] array){
    // Find max element
    int max = Integer.MIN_VALUE;
    int negative = 0;
    for (int index = 0; index <= array.length-1; index++) {
        if (array[index] > max){
            max = array[index];
        }
        if (array[index]<negative){
            negative = array[index];
        }
    }

    int [] countOfEachValue = new int[max+1+(negative*-1)];

    //count each element
    for (int index = 0; index <= array.length-1; index++) {
        int value = array[index];
        countOfEachValue[value-negative]++;

    }

    //print each element count times
    for (int value=0; value<=countOfEachValue.length-1; value++){
        int count = countOfEachValue[value];
        while(count>0){
            System.out.print((value+negative) + " ");
            count--;
        }
    }
}
    public static void main(String[] args) {
        int[] array = { 1,-6,8,1,-4, 4,5, 0};
        countingSort(array);
    }
}
