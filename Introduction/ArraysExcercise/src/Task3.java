import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float [] temperature = new float[n];

        for (int index = 0; index<temperature.length; index++){
            temperature[index] = sc.nextFloat();
        }

        float sumTemperature=0;
        for (int index=0; index<temperature.length;index++){
            sumTemperature += temperature[index];
        }
        float avgTemperature = sumTemperature/n;
        System.out.printf("Sredna temperatura: %.2f" , avgTemperature);

        int countColdDays=0;
        int maxCountColdDays=0;
        for (int index = 0; index<temperature.length; index++){
            if(temperature[index]<avgTemperature){
                countColdDays+=1;
            }else{
                countColdDays=0;
            }
            if (countColdDays>maxCountColdDays){
                maxCountColdDays = countColdDays;
            }
        }
        System.out.println("Nai-dulga poredica pod avg: " + maxCountColdDays );

        int countGettingColder=0;
        int maxCountGettingColder=0;
        for (int index = 1; index<temperature.length; index++){
            if (index ==1){
                countGettingColder+=1;
            }
            if(temperature[index]<temperature[index-1]){
                countGettingColder+=1;
            }else{
                countGettingColder=0;
            }
            if (countGettingColder>maxCountGettingColder){
                maxCountGettingColder = countGettingColder;
            }
        }
        System.out.println("Nai-dulga poredica na zastudqvane: " + maxCountGettingColder );
    }
}
