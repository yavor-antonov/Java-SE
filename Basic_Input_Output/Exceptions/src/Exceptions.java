import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        int x = 96;
        int y =0;
        System.out.println(divideLBYL(x,y));
        System.out.println(divideEAFP(x,y));

        int n = getIntEAFP();
        System.out.println("n is " + n);

        try{
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }


    }
    private static int getInt(){
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                return sc.nextInt();
            }catch (InputMismatchException e){
                // go round again
                System.out.println("Please enter a number");
                sc.nextInt();
            }
        }

    }

    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        try{
            return s.nextInt();
        } catch (InputMismatchException e){
            return 0;
        }
    }

    private static  int divideLBYL (int x, int y){
        if (y != 0){
            return x/y;
        }else{
            return 0;
        }
    }

    private static int divideEAFP (int x, int y){
        try{
            return x/y;
        } catch (ArithmeticException e){
            return 0;
        }
    }
    private static int divide(){
        int x,y;
        try{
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x/y;
        }catch (NoSuchElementException e){
            throw new NoSuchElementException("no suitable input");
        }catch (ArithmeticException e){
            throw new ArithmeticException("attempt to divide by zero");
        }
    }


}
