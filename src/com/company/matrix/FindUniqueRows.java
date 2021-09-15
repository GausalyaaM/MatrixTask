package com.company.matrix;

import java.util.Scanner;

public class FindUniqueRows {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = scan.nextInt();
        System.out.println("Enter the number of columns:");
        int col = scan.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < row; i++)
        {
            int flag = 0;
            for(int j = 0; j < i; j++)
            {
                flag = 1;
                for(int k = 0; k < col; k++)
                    if (matrix[i][k] != matrix[j][k])
                        flag = 0;
                if (flag == 1)
                    break;
            }
            if (flag == 0)
            {
                for(int j = 0; j < col; j++)
                    System.out.print(matrix[i][j] + " ");
                System.out.println();
            }
        }
    }
}
