import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] workersNames= new String[10];
        int [] workersSalary = new int[10];
        for (int index = 0 ; index< workersNames.length; index++){
            workersNames[index] = sc.next();
            workersSalary[index] = sc.nextInt();
        }
        int minSalary = Integer.MAX_VALUE;
        int minSalaryIndex=-1;
        int maxSalary = Integer.MIN_VALUE;
        int maxSalaryIndex=-1;
        int sumSalary = 0;

        for (int index = 0; index< workersSalary.length; index++){
            if (workersSalary[index]< minSalary){
                minSalary = workersSalary[index];
                minSalaryIndex = index;
            }
            if (workersSalary[index]>maxSalary){
                maxSalary = workersSalary[index];
                maxSalaryIndex = index;
            }
            sumSalary+=workersSalary[index];
        }
        int mediumSalary = sumSalary/ workersSalary.length;

        System.out.println(workersNames[minSalaryIndex] + " - " + workersSalary[minSalaryIndex]);
        System.out.println(workersNames[maxSalaryIndex] + " - " + workersSalary[maxSalaryIndex]);
        System.out.println(sumSalary);
        System.out.println(mediumSalary);
    }
}
