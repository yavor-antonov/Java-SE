public class Task11 {
    public static void main(String[] args) {
        int [] array = {-23, -55, 17, 75, 56, 105, 134};
        for (int index = 0; index<array.length; index++){
            if (array[index] > 5 && array[index]%5 ==0){
                System.out.println(array[index]);
            }
        }
    }
}
