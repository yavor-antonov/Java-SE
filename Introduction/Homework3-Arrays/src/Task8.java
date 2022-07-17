public class Task8 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 3, 5, 5, 5, 5, 4, 4, 4, 6, 6};
        int counter = 1;
        int max =1;
        int prevElement;
        for (int index = 1 ; index< array1.length; index++){
            prevElement = index-1;
            if (array1[index] == array1[prevElement]){
                counter++;
            }else{
                counter = 1;
            }

            if (counter> max){
                max = counter;
            }
        }
        System.out.println(max);
    }
}
