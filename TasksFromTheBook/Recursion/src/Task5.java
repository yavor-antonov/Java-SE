public class Task5 {
    static int indexOfLargestElement(int [] array, int index){
        if (index == array.length-1){
            return index;
        }
        int maxElementIndex = indexOfLargestElement(array, index + 1);
        if (array[maxElementIndex] < array [index] ){
            return maxElementIndex;
        }else{
            return  index;
        }
    }
    //2. Да се състави програма, която по въведен масив с естествени числа извежда
    //минималния елемент от масива. Използвайте рекурсия.
    public static void main(String[] args) {
        int [] array = {3,5,11,2,8,9};

        System.out.println(array[indexOfLargestElement(array,0)]);

    }
}
