public class Task7 {
    static void printNumber (int begin, int end){
        if (begin > end){
            return;
        }
        if (begin == end){
            System.out.println(end);
            return;
        }
        printNumber(begin,end-1);
        for (int index = begin ; index<=end; index++){
            System.out.print(index + " ");
        }
        System.out.println();



    }
    //Да се състави програма, чрез която по въведени начална и крайна цифра се
    //извеждат на всеки нов ред редица от числа, започващи с първата цифра и увеличаващи
    // броя си с едно на всеки ред, докато не се стигне до втората – крайна
    //цифра. Използвайте рекурсия.
    public static void main(String[] args) {
        int begin = 1;
        int end = 6;

        printNumber(begin,end);
    }
}
