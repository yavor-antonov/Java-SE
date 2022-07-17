public class Task15 {
    public static void main(String[] args) {
        double [] array1 = {7.13, 0.2, 4.9, 5.1, 6.34, 1.12 };
        int index1=0,index2=0,index3 = 0;
        double maxSum = Double.MIN_VALUE;
        for (int i=0; i<array1.length; i++){
            for (int k=i+1;k<array1.length; k++){
                for (int j=k+1; j<array1.length;j++){
                    double sum =array1[i]+array1[k]+array1[j];
                    if (Math.abs(sum)>maxSum){
                        maxSum=sum;
                        index1 =i;
                        index2 =k;
                        index3=j;
                    }
                }

            }
        }
        System.out.println(array1[index1] + " " + array1[index2] +" " + array1[index3]);
    }
}
