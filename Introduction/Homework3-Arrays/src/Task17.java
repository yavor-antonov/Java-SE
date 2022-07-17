public class Task17 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4, 3, 7,};
        boolean flag = true;
        for (int i=1; i<array.length-1; i++){
            if (array[0]> array[1]){
                flag = false;
                break;
            }
            if (i%2==1){
                if (!(array[i] > array[i-1] && array[i]> array[i+1])){
                    flag=false;
                    break;
                }

            }else {
                if (!(array[i]<array[i-1] && array[i]<array[i+1])){
                    flag=false;
                    break;
                }
            }
        }

        if (flag){
            System.out.println("Zigzagoobrazna e");
        }else{
            System.out.println("ne e");
        }
    }
}
