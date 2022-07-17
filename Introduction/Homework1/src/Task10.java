import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number between 10 and 9999");

        int volume = sc.nextInt();
        int timesBoth = volume / 5;
        int remaining = volume % 5;

        if (remaining == 0){
            System.out.println(timesBoth + "puti po 2 litra");
            System.out.println(timesBoth + "puti po 3 litra");
        }
        if (remaining == 1){
            System.out.println((timesBoth-1) + "puti po 2 litra");
            System.out.println((timesBoth+1) + "puti po 3 litra");
        }
        if (remaining == 2){
            System.out.println((timesBoth+1) + "puti po 2 litra");
            System.out.println(timesBoth + "puti po 3 litra");
        }
        if (remaining == 3){
            System.out.println(timesBoth + "puti po 2 litra");
            System.out.println((timesBoth+1) + "puti po 3 litra");
        }
        if (remaining == 4){
            System.out.println((timesBoth+2) + "puti po 2 litra");
            System.out.println(timesBoth + "puti po 3 litra");
        }
    }
}
