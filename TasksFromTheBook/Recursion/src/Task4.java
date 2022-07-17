import java.util.Arrays;

public class Task4 {
    //4. Да се състави програма, която приема за входни данни масив от естествени
    //числа. Програмата да извежда дали в масива има числа, които се повтарят. Използвайте рекурсия
    static boolean duplicateElements (int [] array, int index){
        if (index == array.length-2){
            return (array[index] == array[index+1]);
        }
        for (int i = index+1 ; i<array.length;i++){
            if (array[index] == array[i]){
                return true;
            }
        }
        return duplicateElements(array,index+1);


    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(duplicateElements(array,0));
    }
}
