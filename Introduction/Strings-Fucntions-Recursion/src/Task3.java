public class Task3 {
    public static void main(String[] args) {
        //Напишете програма, която проверява дали даден символен низ
        //е палиндром (един и същ е отпред назад и отзад напред).

        String palidrome = "abcdcba";

        boolean flag = true;

        for (int index =0;index<=palidrome.length()/2;index++){
            if (palidrome.charAt(index)!=palidrome.charAt(palidrome.length()-1-index)){
                flag = false;
            }
        }

        if (flag){
            System.out.println("Da");
        }else{
            System.out.println("Ne");
        }
    }
}
