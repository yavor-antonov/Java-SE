public class Task2 {
    static int smallestElement(int [] array, int index){
        if (index == array.length-1){
            return array[index];
        }
        int smallestElement = smallestElement(array, index + 1);
        if (array[index] > smallestElement ){
            return smallestElement;
        }else{
            return  array[index];
        }
    }
    //2. Да се състави програма, която по въведен масив с естествени числа извежда
    //минималния елемент от масива. Използвайте рекурсия.
    public static void main(String[] args) {
        int [] array = {3,5,11,2,8,9};
        System.out.println(smallestElement(array,0));
    }
}
