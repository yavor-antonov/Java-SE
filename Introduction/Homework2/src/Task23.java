public class Task23 {
    public static void main(String[] args) {
        int a=1,b=1;

        while (a<=9){
            while (b<=9){
                System.out.format("%d*%d; ",a,b);
                b++;
            }
            System.out.println();
            a++;
            b=a;
        }
    }
}
