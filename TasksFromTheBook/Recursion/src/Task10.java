public class Task10 {
    //Да се състави програма, която приема за входни данни две числа – х и y.
    //Програмата да пресмята стойността на xy (x на степен y), като се използва
    //единствено операторът събиране (+). Използвайте рекурсия

    static int power (int x, int y){
        if (x==1 || y==0){
            return 1;
        }

        return x * power(x,y-1);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
    }
}
