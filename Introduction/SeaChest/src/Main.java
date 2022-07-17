import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag;
        do {
            System.out.println("New Game started");
            int count = 1;
            String[][] array = new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

            int c;
            do {
                flag = false;

                for(c = 0; c < 7; ++c) {
                    if (c % 2 == 0) {
                        System.out.println("-------");
                    } else {
                        switch (c) {
                            case 1:
                                System.out.println("|" + array[0][0] + "|" + array[0][1] + "|" + array[0][2] + "|");
                            case 2:
                            case 4:
                            default:
                                break;
                            case 3:
                                System.out.println("|" + array[1][0] + "|" + array[1][1] + "|" + array[1][2] + "|");
                                break;
                            case 5:
                                System.out.println("|" + array[2][0] + "|" + array[2][1] + "|" + array[2][2] + "|");
                        }
                    }
                }

                int x;
                int y;
                boolean innerFlag;
                if (count % 2 == 1) {
                    while(true) {
                        innerFlag = false;

                        do {
                            System.out.println("Player 1 input Row (Number between 1 and 3)");
                            x = sc.nextInt() - 1;
                        } while(x < 0 || x > 2);

                        do {
                            do {
                                System.out.println("Player 1 input Column (Number between 1 and 3)");
                                y = sc.nextInt() - 1;
                            } while(y < 0);
                        } while(y > 2);

                        if (Objects.equals(array[x][y], " ")) {
                            innerFlag = true;
                        } else {
                            System.out.println("Invalid input - Occupied space");
                        }

                        if (innerFlag) {
                            array[x][y] = "X";
                            break;
                        }
                    }
                } else {
                    while(true) {
                        innerFlag = false;

                        do {
                            System.out.println("Player 2 input Row (Number between 1 and 3)");
                            x = sc.nextInt() - 1;
                        } while(x < 0 || x > 2);

                        do {
                            do {
                                System.out.println("Player 2 input Column (Number between 1 and 3)");
                                y = sc.nextInt() - 1;
                            } while(y < 0);
                        } while(y > 2);

                        if (Objects.equals(array[x][y], " ")) {
                            innerFlag = true;
                        } else {
                            System.out.println("Invalid input - Occupied space");
                        }

                        if (innerFlag) {
                            array[x][y] = "O";
                            break;
                        }
                    }
                }

                ++count;

                for(c = 0; c < 8; ++c) {
                    String line = null;
                    switch (c) {
                        case 0:
                            line = array[0][0] + array[0][1] + array[0][2];
                            break;
                        case 1:
                            line = array[1][0] + array[1][1] + array[1][2];
                            break;
                        case 2:
                            line = array[2][0] + array[2][1] + array[2][2];
                            break;
                        case 3:
                            line = array[0][0] + array[1][0] + array[2][0];
                            break;
                        case 4:
                            line = array[0][1] + array[1][1] + array[2][1];
                            break;
                        case 5:
                            line = array[0][2] + array[1][2] + array[2][2];
                            break;
                        case 6:
                            line = array[0][0] + array[1][1] + array[2][2];
                            break;
                        case 7:
                            line = array[0][2] + array[1][1] + array[2][0];
                    }

                    if (line.equals("XXX")) {
                        System.out.println("Player One Won");
                        flag = true;
                    }

                    if (line.equals("OOO")) {
                        System.out.println("Player Two Won");
                        flag = true;
                    }

                    if (count == 10) {
                        System.out.println("Game ends in a draw");
                        flag = true;
                    }
                }
            } while(!flag);

            System.out.println("For New Game - Press 1");
            c = sc.nextInt();
            if (c == 1) {
                flag = false;
            }
        } while(!flag);

    }
}
