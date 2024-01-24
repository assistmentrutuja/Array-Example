package com.rutuja;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println(a.length);

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = sc.nextInt();
                System.out.print(a[row][col] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}
