package ex1_multi_for;

public class Ex3_multifor {
    public static void main(String[] args) {

        // A B C D
        // E F G H
        // I J K L

        char ch = 'A';

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 4; j++) {

                System.out.printf("%C ", ch++);

            } // in

            System.out.println();

        } // out
    }// main

}// class
