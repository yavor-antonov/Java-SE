public class Task6 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {1, 4, 5, 7, 9};

        if (array1.length == array2.length){
            boolean flag = true;
            for (int index= 0; index<array1.length; index++){
                if (array1[index]!= array2[index]){
                    System.out.println("Ne sa ednakvi");
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Ednakvi sa");
            }

        }else{
            System.out.println("Ne sa ednakvi");
        }
    }
}
