public class Task20 {
    public static void main(String[] args) {
        int count = 1;
        while(count != 11) {
            for (int i = count; i <= 9 + count; i++) {
                if (i < 10) {
                    System.out.print(i + " ");
                } else {
                    System.out.print((i - 10) + " ");
                }

            }
            System.out.println();
            count++;
        }
    }
}
