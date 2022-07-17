public class Task3 {
    static boolean isMonIncreaseing (int [] array, int index){
        if (index == array.length-1){
            return (array[index] > array[index-1]);
        }

        if (isMonIncreaseing(array,index+1)){
            return (array[index] > array[index-1]);
        }else{
            return false;
        }

    }

    //3. Да се състави програма, която по въведен масив с естествени числа проверява
    // дали този масив е монотонно нарастващ. Монотонно нарастващ масив е
    //такъв, при който всеки следващ елемент е по-голям от предишния. Използвайте
    //рекурсия.
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(isMonIncreaseing(array,1));
    }
}
