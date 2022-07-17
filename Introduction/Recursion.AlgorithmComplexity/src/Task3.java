public class Task3 {
    static int multiply(int x){
        if (x<=0){
            return 0;
        }else{
            if (x==1){
                return 1;
            }else{
                if (x%2==0){
                    return multiply(x-1);
                }else{
                    return x*multiply(x-2);
                }
            }
        }
        //return (x%2==0) ? multiply(x-1): (x<=1) ? 0 : x*multiply(x-2);
}
    public static void main(String[] args) {
        System.out.println(multiply(2));
    }
}
