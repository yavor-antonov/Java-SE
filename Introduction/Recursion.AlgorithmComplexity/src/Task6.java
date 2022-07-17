public class Task6 { //да се отпечата масива обратно с рекурсия
    static void printReverseArray (int[] array, int index){
        if (index>=0 && index<= array.length-1){
            System.out.print(array[index]+" ");
            printReverseArray(array, index-1);

        }else{
            return;
        }

}
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        printReverseArray(array,array.length-1);
    }
}
