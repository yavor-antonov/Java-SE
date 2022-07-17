public class Task9 {
    //Да се състави програма, която приема за входни данни две числа – x и y.
    // Програмата да пресмята произведението на двете числа,
    // като се използва единствено операторът събиране (+). Използвайте рекурсия.

    static int multiply (int x, int y){ // x*y
        if (x == 0 || y == 0){
            return 0;
        }
        if (y == 1 ) {
            return x;
        }
        if (y< 0){
            y = -y;
            return -(x + multiply(x, y - 1));
        }
        return x + multiply(x, y - 1);
    }

    static int power (int x, int y){ //x^y
        if (x==1 || y==0){
            return 1;
        }

        return multiply(x ,power(x,y-1));
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(multiply(x,y));
        System.out.println(power(x,y));
    }
}
