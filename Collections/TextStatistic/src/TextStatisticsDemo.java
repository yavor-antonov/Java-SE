import java.util.Scanner;

public class TextStatisticsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextStatistic ts = new TextStatistic(sc.nextLine());
        ts.printStatistics();
    }

}