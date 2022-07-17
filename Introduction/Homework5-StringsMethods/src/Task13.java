public class Task13 {
    static void multiplyArray(int [] array1, int[] array2){

        for (int index=0;index<array1.length;index++){
            if (index==0){
                System.out.print("[ " + array1[index]*array2[index] +" , ");
            }else {
                if (index == array1.length - 1) {
                    System.out.print(array1[index]*array2[index] + " ]");
                } else {
                    System.out.print(array1[index]*array2[index] + " , ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] array1 = { 1 ,3 ,5 };
        int [] array2 = { 5 ,3 ,9 };
        multiplyArray(array1,array2);
    }
}
