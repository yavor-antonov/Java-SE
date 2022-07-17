public class Task11 {
    static void printArray(int[] array){
        for (int index=0;index<array.length;index++){
            if (index==0){
                System.out.print("[ " + array[index] +" , ");
            }else {
                if (index == array.length - 1) {
                    System.out.print(array[index] + " ]");
                } else {
                    System.out.print(array[index] + " , ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        printArray(array);
    }
}
