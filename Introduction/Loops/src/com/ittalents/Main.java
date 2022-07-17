package com.ittalents;

public class Main {
    public static void main(String[] args) {

        int x = 9;

        for (int j = 0; j< x; j++){
            // Purviqt X
            for (int i = 0; i <x; i++){
                if (i==j){
                    System.out.print("*");
                }else{
                    if (i==(x-1) - j){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print(" ");

            // PLusut
            for (int i = 0; i <x; i++){
                if (x / 2 == j){
                    System.out.print("* ");
                }
                else if (x/2 == i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }


            // Vtoriqt X
            for (int i = 0; i <x; i++){
                if (i==j){
                    System.out.print("*");
                }else{
                    if (i==(x-1) - j){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print(" ");

            // Ravno
            for (int i = 0; i <x; i++){
                if (x / 2 == (j-1)){
                    System.out.print("*");
                }
                else if (x / 2 == (j+1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
