import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numberOfMonths = sc.nextByte();
        byte [][] holidays = new byte [numberOfMonths][];

        for (int month= 0; month<numberOfMonths; month++){
            int numberOfHolidays= sc.nextInt();

            byte [] holidaysInThisMonth = new byte[numberOfHolidays];
            for (int day = 0; day<numberOfHolidays; day++){
                holidaysInThisMonth[day] = sc.nextByte();
            }

            holidays[month] = holidaysInThisMonth;
        }
        int counterHolidays = 0;
        int maxCounterMostHolidays = 0;
        int indexOfMonthWithMostHolidays = 0;

        for (int month=0; month<numberOfMonths; month++){
            for (int holiday = 0; holiday<holidays[month].length; holiday++){
                counterHolidays++;

                if (counterHolidays>maxCounterMostHolidays){
                    maxCounterMostHolidays = counterHolidays;
                    indexOfMonthWithMostHolidays = month;
                }

            }
            counterHolidays = 0;
        }
        for (int day = 0 ;day<holidays[indexOfMonthWithMostHolidays].length; day++){
            System.out.print(holidays[indexOfMonthWithMostHolidays][day]);
        }


    }
}
