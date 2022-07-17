package com.ittalents;

import java.util.Scanner;

public class SeaChest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <7; i++){
            if (i%2 == 0)
            for (int j = 0; j <7; j++){
                System.out.print("-");
            }
            if (i%2 == 1){
                for (int j = 0; j <7; j++){

                    if (j%2 == 0) {
                        System.out.print("|");
                    }else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
        System.out.println("Player 1 turn. Select Coordinates");
       int x = sc.nextInt();
       int y = sc.nextInt();
        System.out.println(x + " , " + y);
        switch (x){
            case 1:  x+=1; break;
            case 2: x+=2; break;
            case 3: x+=3; break;
        }
        switch (y){
            case 1:  y+=1; break;
            case 2: y+=2; break;
            case 3: y+=3; break;
        }

        for (int i = 1; i <8; i++){
            if (i%2 == 1)
                for (int j = 1; j <8; j++){
                    System.out.print("-");
                }
            if (i%2 == 0){
                for (int j = 1; j <8; j++){

                    if (j%2 == 1) {
                        System.out.print("|");
                    }else if((i == x) && (j == y)){
                        System.out.print("X");
                    } else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }


    }
}
