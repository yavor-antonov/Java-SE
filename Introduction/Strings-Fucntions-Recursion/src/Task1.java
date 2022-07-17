public class Task1 {
    public static void main(String[] args) {
        //Напишете програма, която проверява дали даден символен низ
        //е префикс (начало) на друг символен низ.

        String money = "money";
        String moneyDance = "moneyDance";
        boolean flag = true;
        for (int index = 0; index<money.length(); index++){
            if (money.charAt(index) != moneyDance.charAt(index)){
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
