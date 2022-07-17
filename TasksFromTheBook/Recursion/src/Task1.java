public class Task1 {
    static int nF (int number){
        if (number<=1){
            return number;
        }

        return number*nF(number-1);
    }
    //1. Да се състави програма, която приема за входни данни естествено число N и
    //изписва на екрана стойността на N! (N факториел).
    // Факториел на число N се изчислява чрез умножение на всички числа от 1 до N. Използвайте рекурсия.
    public static void main(String[] args) {
        int number = 4;
        System.out.println(nF(number));

    }
}
