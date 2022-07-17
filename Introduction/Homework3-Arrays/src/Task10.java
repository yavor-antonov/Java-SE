public class Task10 {
    public static void main(String[] args) {
        int [] array = { 1,2,3,4,5,6,7};
        int sum=0;
        for (int index=0; index< array.length; index++){
            sum+= array[index];
        }
        double mid = sum / array.length;
        double smallestDiff = Integer.MAX_VALUE;
        int smallestNumber=0;
        for (int index=0; index< array.length; index++){
            double difference = Math.abs(array[index] - mid);
            if (difference<smallestDiff){
                smallestNumber = array[index];
                smallestDiff = difference;
            }
        }
        System.out.println(smallestNumber);

    }
}
